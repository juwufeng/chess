import{ar as y,as as o,at as n,d as h,U as g,v as c,A as $,a3 as f,au as N,o as _,M as C,w as x,a5 as j,n as v,u as r,a6 as O,aq as w,K as E,af as k}from"./index.ed03ce07.js";const S=Symbol("rowContextKey"),K=y({tag:{type:String,default:"div"},span:{type:Number,default:24},offset:{type:Number,default:0},pull:{type:Number,default:0},push:{type:Number,default:0},xs:{type:o([Number,Object]),default:()=>n({})},sm:{type:o([Number,Object]),default:()=>n({})},md:{type:o([Number,Object]),default:()=>n({})},lg:{type:o([Number,Object]),default:()=>n({})},xl:{type:o([Number,Object]),default:()=>n({})}}),B={name:"ElCol"},P=h({...B,props:K,setup(m){const t=m,{gutter:u}=g(S,{gutter:c(()=>0)}),a=$("col"),d=c(()=>{const e={};return u.value&&(e.paddingLeft=e.paddingRight=`${u.value/2}px`),e}),b=c(()=>{const e=[];return["span","offset","pull","push"].forEach(s=>{const l=t[s];f(l)&&(s==="span"?e.push(a.b(`${t[s]}`)):l>0&&e.push(a.b(`${s}-${t[s]}`)))}),["xs","sm","md","lg","xl"].forEach(s=>{f(t[s])?e.push(a.b(`${s}-${t[s]}`)):N(t[s])&&Object.entries(t[s]).forEach(([l,p])=>{e.push(l!=="span"?a.b(`${s}-${l}-${p}`):a.b(`${s}-${p}`))})}),u.value&&e.push(a.is("guttered")),e});return(e,i)=>(_(),C(w(e.tag),{class:v([r(a).b(),r(b)]),style:O(r(d))},{default:x(()=>[j(e.$slots,"default")]),_:3},8,["class","style"]))}});var q=E(P,[["__file","/home/runner/work/element-plus/element-plus/packages/components/col/src/col.vue"]]);const I=k(q);export{I as E,S as r};
