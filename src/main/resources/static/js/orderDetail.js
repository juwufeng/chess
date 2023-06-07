$(function(){
    //查询挂号记录
    findById();
    //获取当前就诊人信息
    getPatInfo();

    //点击提交按钮
    $("#payNow").click(function(){
        var btnArray = ['立即支付', '暂不支付'];
        // var totalFee =$("#RegFee").text()+$("#serviceFee").text();
        //暂无平台服务费
        var totalFee =$("#RegFee").text();
        mui.confirm('当前预约挂号费用为'+totalFee+'，是否确认支付', '支付提示', btnArray, function(e) {
            if (e.index == 1) {
                mui.alert("30分钟后预约自动取消，请及时支付！", '提示', function() {
                    var PatientID = $("#PatientID").val();
                    window.location.href="/phone/payOnline/"+PatientID;
                });
            } else {
                //支付操作
                pay();
            }
        });
    });
});
//查询挂号记录
function findById(){
    $.ajax({
        url:"/AppointmentOrderRest/findById",
        data:{
            "id":$("#AppointmentOrderId").val()
        },
        async:false,
        dataType:"json",
        success:function(dto){
            var po = dto.po;
            $("#HospitalName").text(po.hospitalname);
            $("#Department").text(po.department);
            $("#DoctorName").text(po.doctorname);
            $("#DoctorTitle").text(po.doctortitle);
            $("#AdmitDate").text(po.admitdate);
            //分转化为元
            var regfee = po.regfee/100;
            $("#RegFee").text(regfee);
            $("#serviceFee").text(po.servicefee);

            $("#TransactionId").val(po.transactionid);
            $("#PatientID").val(po.patientid);
            $("#ScheduleItemCode").val(po.scheduleitemcode);
        }
    });
}

//获取当前就诊人信息
function getPatInfo(){
    var PatientID = $("#PatientID").val();
    $.ajax({
        url:"/DhccApiRest/GetPatInfo",
        data:{
            PatientID:PatientID
        },
        async:false,
        dataType:"json",
        success:function(dto){
            var resultJson = dto.resultJson;
            var PatInfo = resultJson.PatInfos.PatInfo;
            $("#PatInfoUl").append(
                '<li id="PatientID-'+PatInfo.PatientID+'" class="mui-table-view-cell mui-media">'+
                '<a>'+
                '<div class="mui-media-body">'+
                PatInfo.PatientName+"（"+PatInfo.Sex+"）"+
                '<p class="mui-ellipsis">电子健康卡号：<span>'+PatInfo.IDNo+'</span></p>'+
                '</div>'+
                '</a>'+
                '</li>'
            );
        }
    });
}

//挂号&提前挂号操作
function oPRegister(){
    //元改为分
    var regfee = $("#RegFee").text()*100;
    $.ajax({
        url:"/DhccApiRest/oPRegister",
        data:{
            PatientID:$("#PatientID").val(),
            TransactionId:$("#TransactionId").val(),
            ScheduleItemCode:$("#ScheduleItemCode").val(),
            RegFee:regfee
        },
        async:false,
        dataType:"json",
        success:function(dto){
            var resultJson = dto.resultJson;
            if(resultJson.ResultCode==0){
                //修改订单状态用
                payMap.AdmNo=resultJson.AdmNo;
                //修改订单状态
                updateAppointmentOrder();
            }else{
                mui.alert(resultJson.ResultContent,'提示', function() {
                });
            }
        }
    });
}

//修改订单状态，产生挂号标记AdmNo
function updateAppointmentOrder(AdmNo){
    $.ajax({
        url:"/AppointmentOrderRest/saveOrUpdate",
        data:{
            "po.id":$("#AppointmentOrderId").val(),
            "po.isPay":common.IS_PAY,
            "po.admno":payMap.AdmNo,
            //使用记录的订单号，统一订单号
            "po.outTradeNo":payMap.outTradeNo
        },
        async:false,
        dataType:"json",
        success:function(dto){
            if(dto.msgCode==common.REQUEST_SCCESS){
                //支付成功后
                mui.alert('支付成功','提示', function() {
                    var PatientID = $("#PatientID").val();
                    window.location.href="/phone/payOnline/"+PatientID;
                });
            }else{
                mui.alert(dto.msg, '提示', function() {
                });
            }
        }
    });
}

//调用微信支付
var payMap={};
function pay(){
    //获取缓存中的openId
    var openId = getOpenId();
    //生成订单号
    var outTradeNo = getOutTradeNo();
    payMap.outTradeNo=outTradeNo;
    var body = $("#Department").text()+","+$("#DoctorName").text()+","+$("#DoctorTitle").text()+","+$("#AdmitDate").text();
    //元改为分
    var regfee = $("#RegFee").text()*100;
    var totalFee = regfee;

    if(openId){
        var url = "/wxPay/wxPayUrl?openId="+openId+"&outTradeNo="+outTradeNo+"&body="+body+"&totalFee="+totalFee;
        $.get(url,function(result) {
            payMap.appId = result.appId;
            payMap.timeStamp = result.timeStamp;
            payMap.nonceStr = result.nonceStr;
            payMap.package = result.package;
            payMap.signType = result.signType;
            payMap.paySign = result.paySign;

            if (typeof WeixinJSBridge == "undefined") {
                if (document.addEventListener) {
                    document.addEventListener('WeixinJSBridgeReady',
                        onBridgeReady, false);
                } else if (document.attachEvent) {
                    document.attachEvent('WeixinJSBridgeReady',
                        onBridgeReady);
                    document.attachEvent('onWeixinJSBridgeReady',
                        onBridgeReady);
                }
            } else {
                onBridgeReady();
            }
        });
    } else {
        mui.alert("服务器错误", '提示', function () {
        });
    }
}
function onBridgeReady(){
    WeixinJSBridge.invoke('getBrandWCPayRequest',{
            "appId":payMap.appId,
            "timeStamp":payMap.timeStamp,//时间戳,自1970年以来的秒数
            "nonceStr":payMap.nonceStr, //随机串
            "package":payMap.package,
            "signType":payMap.signType,//微信签名方式：
            "paySign":payMap.paySign //微信签名
        },
        function(res){
            if(res.err_msg == "get_brand_wcpay_request:ok" ) {
                console.log('支付成功');
                //挂号&提前挂号操作
                oPRegister();
            }else if(res.err_msg == "get_brand_wcpay_request:cancel"){
                console.log('支付取消');
                mui.alert("30分钟后预约自动取消，请及时支付！", '提示', function() {
                    var PatientID = $("#PatientID").val();
                    window.location.href="/phone/payOnline/"+PatientID;
                });
            }else if(res.err_msg == "get_brand_wcpay_request:fail"){
                console.log('支付失败');
                WeixinJSBridge.call('closeWindow');
            }
        });
}


