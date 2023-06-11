import{ar as q,aJ as F,d as I,v as z,o as u,e as C,t as M,M as $,w as V,aq as Q,u as n,b as X,K as L,U as re,as as Z,at as ee,J as O,A as B,q as S,x as J,f as ae,N as ne,O as te,n as N,i as R,$ as ie,a7 as U,aK as oe,aL as Y,aM as le,aN as ue,aO as ce,aa as de,s as ge,a4 as pe,an as fe,Y as w,af as me}from"./index.ed03ce07.js";import{E as ve,a as be}from"./el-select.96d658d2.js";import{i as Pe}from"./isEqual.339d3b80.js";import{E as Ce}from"./el-input.0bfd428b.js";const se=Symbol("elPaginationKey"),he=q({disabled:Boolean,currentPage:{type:Number,default:1},prevText:{type:String},prevIcon:{type:F}}),ye={click:e=>e instanceof MouseEvent},_e=["disabled","aria-disabled"],ke={key:0},ze={name:"ElPaginationPrev"},Se=I({...ze,props:he,emits:ye,setup(e){const o=e,t=z(()=>o.disabled||o.currentPage<=1);return(i,l)=>(u(),C("button",{type:"button",class:"btn-prev",disabled:n(t),"aria-disabled":n(t),onClick:l[0]||(l[0]=g=>i.$emit("click",g))},[i.prevText?(u(),C("span",ke,M(i.prevText),1)):(u(),$(n(X),{key:1},{default:V(()=>[(u(),$(Q(i.prevIcon)))]),_:1}))],8,_e))}});var Ne=L(Se,[["__file","/home/runner/work/element-plus/element-plus/packages/components/pagination/src/components/prev.vue"]]);const xe=q({disabled:Boolean,currentPage:{type:Number,default:1},pageCount:{type:Number,default:50},nextText:{type:String},nextIcon:{type:F}}),Ee=["disabled","aria-disabled"],$e={key:0},we={name:"ElPaginationNext"},Te=I({...we,props:xe,emits:["click"],setup(e){const o=e,t=z(()=>o.disabled||o.currentPage===o.pageCount||o.pageCount===0);return(i,l)=>(u(),C("button",{type:"button",class:"btn-next",disabled:n(t),"aria-disabled":n(t),onClick:l[0]||(l[0]=g=>i.$emit("click",g))},[i.nextText?(u(),C("span",$e,M(i.nextText),1)):(u(),$(n(X),{key:1},{default:V(()=>[(u(),$(Q(i.nextIcon)))]),_:1}))],8,Ee))}});var Me=L(Te,[["__file","/home/runner/work/element-plus/element-plus/packages/components/pagination/src/components/next.vue"]]);const H=()=>re(se,{}),Ie=q({pageSize:{type:Number,required:!0},pageSizes:{type:Z(Array),default:()=>ee([10,20,30,40,50,100])},popperClass:{type:String},disabled:Boolean,size:{type:String,default:"default"}}),Be={name:"ElPaginationSizes"},qe=I({...Be,props:Ie,emits:["page-size-change"],setup(e,{emit:o}){const t=e,{t:i}=O(),l=B("pagination"),g=H(),h=S(t.pageSize);J(()=>t.pageSizes,(c,y)=>{if(!Pe(c,y)&&Array.isArray(c)){const p=c.includes(t.pageSize)?t.pageSize:t.pageSizes[0];o("page-size-change",p)}}),J(()=>t.pageSize,c=>{h.value=c});const k=z(()=>t.pageSizes);function x(c){var y;c!==h.value&&(h.value=c,(y=g.handleSizeChange)==null||y.call(g,Number(c)))}return(c,y)=>(u(),C("span",{class:N(n(l).e("sizes"))},[ae(n(be),{"model-value":h.value,disabled:c.disabled,"popper-class":c.popperClass,size:c.size,onChange:x},{default:V(()=>[(u(!0),C(ne,null,te(n(k),p=>(u(),$(n(ve),{key:p,value:p,label:p+n(i)("el.pagination.pagesize")},null,8,["value","label"]))),128))]),_:1},8,["model-value","disabled","popper-class","size"])],2))}});var Le=L(qe,[["__file","/home/runner/work/element-plus/element-plus/packages/components/pagination/src/components/sizes.vue"]]);const Ae=["disabled"],je={name:"ElPaginationJumper"},Ke=I({...je,setup(e){const{t:o}=O(),t=B("pagination"),{pageCount:i,disabled:l,currentPage:g,changeEvent:h}=H(),k=S(),x=z(()=>{var p;return(p=k.value)!=null?p:g==null?void 0:g.value});function c(p){k.value=+p}function y(p){p=Math.trunc(+p),h==null||h(+p),k.value=void 0}return(p,m)=>(u(),C("span",{class:N(n(t).e("jump")),disabled:n(l)},[R(M(n(o)("el.pagination.goto"))+" ",1),ae(n(Ce),{size:"small",class:N([n(t).e("editor"),n(t).is("in-pagination")]),min:1,max:n(i),disabled:n(l),"model-value":n(x),type:"number","onUpdate:modelValue":c,onChange:y},null,8,["class","max","disabled","model-value"]),R(" "+M(n(o)("el.pagination.pageClassifier")),1)],10,Ae))}});var Ue=L(Ke,[["__file","/home/runner/work/element-plus/element-plus/packages/components/pagination/src/components/jumper.vue"]]);const Fe=q({total:{type:Number,default:1e3}}),Oe=["disabled"],We={name:"ElPaginationTotal"},De=I({...We,props:Fe,setup(e){const{t:o}=O(),t=B("pagination"),{disabled:i}=H();return(l,g)=>(u(),C("span",{class:N(n(t).e("total")),disabled:n(i)},M(n(o)("el.pagination.total",{total:l.total})),11,Oe))}});var Je=L(De,[["__file","/home/runner/work/element-plus/element-plus/packages/components/pagination/src/components/total.vue"]]);const Ve=q({currentPage:{type:Number,default:1},pageCount:{type:Number,required:!0},pagerCount:{type:Number,default:7},disabled:Boolean}),He=["onKeyup"],Re=["aria-current","tabindex"],Ye=["tabindex"],Ge=["aria-current","tabindex"],Qe=["tabindex"],Xe=["aria-current","tabindex"],Ze={name:"ElPaginationPager"},ea=I({...Ze,props:Ve,emits:["change"],setup(e,{emit:o}){const t=e,i=B("pager"),l=B("icon"),g=S(!1),h=S(!1),k=S(!1),x=S(!1),c=S(!1),y=S(!1),p=z(()=>{const s=t.pagerCount,r=(s-1)/2,a=Number(t.currentPage),d=Number(t.pageCount);let v=!1,_=!1;d>s&&(a>s-r&&(v=!0),a<d-r&&(_=!0));const T=[];if(v&&!_){const b=d-(s-2);for(let E=b;E<d;E++)T.push(E)}else if(!v&&_)for(let b=2;b<s;b++)T.push(b);else if(v&&_){const b=Math.floor(s/2)-1;for(let E=a-b;E<=a+b;E++)T.push(E)}else for(let b=2;b<d;b++)T.push(b);return T}),m=z(()=>t.disabled?-1:0);ie(()=>{const s=(t.pagerCount-1)/2;g.value=!1,h.value=!1,t.pageCount>t.pagerCount&&(t.currentPage>t.pagerCount-s&&(g.value=!0),t.currentPage<t.pageCount-s&&(h.value=!0))});function f(s=!1){t.disabled||(s?k.value=!0:x.value=!0)}function A(s=!1){s?c.value=!0:y.value=!0}function W(s){const r=s.target;if(r.tagName.toLowerCase()==="li"&&Array.from(r.classList).includes("number")){const a=Number(r.textContent);a!==t.currentPage&&o("change",a)}else r.tagName.toLowerCase()==="li"&&Array.from(r.classList).includes("more")&&K(s)}function K(s){const r=s.target;if(r.tagName.toLowerCase()==="ul"||t.disabled)return;let a=Number(r.textContent);const d=t.pageCount,v=t.currentPage,_=t.pagerCount-2;r.className.includes("more")&&(r.className.includes("quickprev")?a=v-_:r.className.includes("quicknext")&&(a=v+_)),Number.isNaN(+a)||(a<1&&(a=1),a>d&&(a=d)),a!==v&&o("change",a)}return(s,r)=>(u(),C("ul",{class:N(n(i).b()),onClick:K,onKeyup:ue(W,["enter"])},[s.pageCount>0?(u(),C("li",{key:0,class:N([[n(i).is("active",s.currentPage===1),n(i).is("disabled",s.disabled)],"number"]),"aria-current":s.currentPage===1,tabindex:n(m)}," 1 ",10,Re)):U("v-if",!0),g.value?(u(),C("li",{key:1,class:N(["more","btn-quickprev",n(l).b(),n(i).is("disabled",s.disabled)]),tabindex:n(m),onMouseenter:r[0]||(r[0]=a=>f(!0)),onMouseleave:r[1]||(r[1]=a=>k.value=!1),onFocus:r[2]||(r[2]=a=>A(!0)),onBlur:r[3]||(r[3]=a=>c.value=!1)},[k.value||c.value?(u(),$(n(oe),{key:0})):(u(),$(n(Y),{key:1}))],42,Ye)):U("v-if",!0),(u(!0),C(ne,null,te(n(p),a=>(u(),C("li",{key:a,class:N([[n(i).is("active",s.currentPage===a),n(i).is("disabled",s.disabled)],"number"]),"aria-current":s.currentPage===a,tabindex:n(m)},M(a),11,Ge))),128)),h.value?(u(),C("li",{key:2,class:N(["more","btn-quicknext",n(l).b(),n(i).is("disabled",s.disabled)]),tabindex:n(m),onMouseenter:r[4]||(r[4]=a=>f()),onMouseleave:r[5]||(r[5]=a=>x.value=!1),onFocus:r[6]||(r[6]=a=>A()),onBlur:r[7]||(r[7]=a=>y.value=!1)},[x.value||y.value?(u(),$(n(le),{key:0})):(u(),$(n(Y),{key:1}))],42,Qe)):U("v-if",!0),s.pageCount>1?(u(),C("li",{key:3,class:N([[n(i).is("active",s.currentPage===s.pageCount),n(i).is("disabled",s.disabled)],"number"]),"aria-current":s.currentPage===s.pageCount,tabindex:n(m)},M(s.pageCount),11,Xe)):U("v-if",!0)],42,He))}});var aa=L(ea,[["__file","/home/runner/work/element-plus/element-plus/packages/components/pagination/src/components/pager.vue"]]);const P=e=>typeof e!="number",na=q({total:Number,pageSize:Number,defaultPageSize:Number,currentPage:Number,defaultCurrentPage:Number,pageCount:Number,pagerCount:{type:Number,validator:e=>typeof e=="number"&&Math.trunc(e)===e&&e>4&&e<22&&e%2===1,default:7},layout:{type:String,default:["prev","pager","next","jumper","->","total"].join(", ")},pageSizes:{type:Z(Array),default:()=>ee([10,20,30,40,50,100])},popperClass:{type:String,default:""},prevText:{type:String,default:""},prevIcon:{type:F,default:()=>ce},nextText:{type:String,default:""},nextIcon:{type:F,default:()=>de},small:Boolean,background:Boolean,disabled:Boolean,hideOnSinglePage:Boolean}),ta={"update:current-page":e=>typeof e=="number","update:page-size":e=>typeof e=="number","size-change":e=>typeof e=="number","current-change":e=>typeof e=="number","prev-click":e=>typeof e=="number","next-click":e=>typeof e=="number"},G="ElPagination";var sa=I({name:G,props:na,emits:ta,setup(e,{emit:o,slots:t}){const{t:i}=O(),l=B("pagination"),g=ge().vnode.props||{},h="onUpdate:currentPage"in g||"onUpdate:current-page"in g||"onCurrentChange"in g,k="onUpdate:pageSize"in g||"onUpdate:page-size"in g||"onSizeChange"in g,x=z(()=>{if(P(e.total)&&P(e.pageCount)||!P(e.currentPage)&&!h)return!1;if(e.layout.includes("sizes")){if(P(e.pageCount)){if(!P(e.total)&&!P(e.pageSize)&&!k)return!1}else if(!k)return!1}return!0}),c=S(P(e.defaultPageSize)?10:e.defaultPageSize),y=S(P(e.defaultCurrentPage)?1:e.defaultCurrentPage),p=z({get(){return P(e.pageSize)?c.value:e.pageSize},set(a){P(e.pageSize)&&(c.value=a),k&&(o("update:page-size",a),o("size-change",a))}}),m=z(()=>{let a=0;return P(e.pageCount)?P(e.total)||(a=Math.max(1,Math.ceil(e.total/p.value))):a=e.pageCount,a}),f=z({get(){return P(e.currentPage)?y.value:e.currentPage},set(a){let d=a;a<1?d=1:a>m.value&&(d=m.value),P(e.currentPage)&&(y.value=d),h&&(o("update:current-page",d),o("current-change",d))}});J(m,a=>{f.value>a&&(f.value=a)});function A(a){f.value=a}function W(a){p.value=a;const d=m.value;f.value>d&&(f.value=d)}function K(){e.disabled||(f.value-=1,o("prev-click",f.value))}function s(){e.disabled||(f.value+=1,o("next-click",f.value))}function r(a,d){a&&(a.props||(a.props={}),a.props.class=[a.props.class,d].join(" "))}return pe(se,{pageCount:m,disabled:z(()=>e.disabled),currentPage:f,changeEvent:A,handleSizeChange:W}),()=>{var a,d;if(!x.value)return fe(G,i("el.pagination.deprecationWarning")),null;if(!e.layout||e.hideOnSinglePage&&m.value<=1)return null;const v=[],_=[],T=w("div",{class:l.e("rightwrapper")},_),b={prev:w(Ne,{disabled:e.disabled,currentPage:f.value,prevText:e.prevText,prevIcon:e.prevIcon,onClick:K}),jumper:w(Ue),pager:w(aa,{currentPage:f.value,pageCount:m.value,pagerCount:e.pagerCount,onChange:A,disabled:e.disabled}),next:w(Me,{disabled:e.disabled,currentPage:f.value,pageCount:m.value,nextText:e.nextText,nextIcon:e.nextIcon,onClick:s}),sizes:w(Le,{pageSize:p.value,pageSizes:e.pageSizes,popperClass:e.popperClass,disabled:e.disabled,size:e.small?"small":"default"}),slot:(d=(a=t==null?void 0:t.default)==null?void 0:a.call(t))!=null?d:null,total:w(Je,{total:P(e.total)?0:e.total})},E=e.layout.split(",").map(j=>j.trim());let D=!1;return E.forEach(j=>{if(j==="->"){D=!0;return}D?_.push(b[j]):v.push(b[j])}),r(v[0],l.is("first")),r(v[v.length-1],l.is("last")),D&&_.length>0&&(r(_[0],l.is("first")),r(_[_.length-1],l.is("last")),v.push(T)),w("div",{role:"pagination","aria-label":"pagination",class:[l.b(),l.is("background",e.background),{[l.m("small")]:e.small}]},v)}}});const ua=me(sa);export{ua as E};
