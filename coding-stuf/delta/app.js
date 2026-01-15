
let h1 = document.createElement("h1");
h1.innerHTML="<u>DOM practice</u>";
h1.classList.add("h1style");
document.querySelector("body").append(h1);

let btn = document.createElement("button");
let int = document.createElement("input");
btn.innerText="click me!";
document.querySelector("body").append(int);
document.querySelector("body").append(btn);

btn.setAttribute("id","btn");
int.setAttribute("placeholder","User Name");

let bn =document.querySelector("#btn");
bn.classList.add("btnstyle");

let para = document.createElement("p");
para.innerHTML ="Apna College <b>Delta</b> Practice ";
document.querySelector("body").append(para);

window.scroll({
  top: 100,
  left: 100,
  behavior: "smooth",
});

let btnn = document.createElement("button");
btnn.innerText="click me !";
btnn.addEventListener("click",function(){
    this.style.background='green';
    this.style.color='white';
    
})
document.querySelector("body").append(btnn);