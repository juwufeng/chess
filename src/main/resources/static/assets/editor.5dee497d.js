import{d as s,q as r,r as i,R as l,ad as d,c as _,o as m,e as F,g as e,f as p,w as f,i as u}from"./index.ed03ce07.js";import{W as B}from"./wangEditor.874d542a.js";import"./_commonjsHelpers.712cc82f.js";const h={class:"container"},g=e("div",{class:"plugins-tips"},[u(" wangEditor\uFF1A\u8F7B\u91CF\u7EA7 web \u5BCC\u6587\u672C\u7F16\u8F91\u5668\uFF0C\u914D\u7F6E\u65B9\u4FBF\uFF0C\u4F7F\u7528\u7B80\u5355\u3002 \u8BBF\u95EE\u5730\u5740\uFF1A "),e("a",{href:"https://www.wangeditor.com/doc/",target:"_blank"},"wangEditor")],-1),w=u("\u63D0\u4EA4"),E=s({name:"editor"}),A=s({...E,setup(C){const o=r(null),n=i({html:"",text:""});let t;l(()=>{t=new B(o.value),t.config.zIndex=1,t.create()}),d(()=>{t.destroy(),t=null});const a=()=>{n.html=t.txt.html(),console.log(n.html)};return(x,k)=>{const c=_;return m(),F("div",h,[g,e("div",{class:"mgb20",ref_key:"editor",ref:o},null,512),p(c,{type:"primary",onClick:a},{default:f(()=>[w]),_:1})])}}});export{A as default};
