import{d as p,q as i,c as m,o as E,e as b,g as c,f as a,w as r,i as x,_ as h}from"./index.ed03ce07.js";import{E as f,a as D}from"./el-table-column.09a80e02.js";/* empty css                    */import"./el-tag.29c18ca4.js";import{u,w as F}from"./xlsx.db07aefa.js";import"./index.888fdb9b.js";import"./event.776e7e11.js";const B={class:"container"},g={class:"handle-box"},v=x("\u5BFC\u51FAExcel"),C=p({name:"export"}),k=p({...C,setup(w){const s=i([]);(()=>{s.value=[{id:1,name:"\u5C0F\u660E",sno:"S001",class:"\u4E00\u73ED",age:"10",sex:"\u7537"},{id:2,name:"\u5C0F\u7EA2",sno:"S002",class:"\u4E00\u73ED",age:"9",sex:"\u5973"}]})();const n=[["\u5E8F\u53F7","\u59D3\u540D","\u5B66\u53F7","\u73ED\u7EA7","\u5E74\u9F84","\u6027\u522B"]],d=()=>{s.value.map((o,e)=>{const t=[e+1];t.push(o.name,o.sno,o.class,o.age,o.sex),n.push(t)});let _=u.aoa_to_sheet(n),l=u.book_new();u.book_append_sheet(l,_,"\u7B2C\u4E00\u9875"),F(l,"\u8868\u683C.xlsx")};return(_,l)=>{const o=m,e=f,t=D;return E(),b("div",null,[c("div",B,[c("div",g,[a(o,{type:"primary",onClick:d},{default:r(()=>[v]),_:1})]),a(t,{data:s.value,border:"",class:"table","header-cell-class-name":"table-header"},{default:r(()=>[a(e,{prop:"id",label:"ID",width:"55",align:"center"}),a(e,{prop:"name",label:"\u59D3\u540D"}),a(e,{prop:"sno",label:"\u5B66\u53F7"}),a(e,{prop:"class",label:"\u73ED\u7EA7"}),a(e,{prop:"age",label:"\u5E74\u9F84"}),a(e,{prop:"sex",label:"\u6027\u522B"})]),_:1},8,["data"])])])}}});const W=h(k,[["__scopeId","data-v-a32e0e80"]]);export{W as default};
