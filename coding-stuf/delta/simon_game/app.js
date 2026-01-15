let gameseq =[];
let userseq =[];
// let audio = new Audio(`sounds/${color}.mp3`);

let btns = ["red","yellow","green","purple"];
let start = false;
let level = 0;
let h2 = document.querySelector("h2");
document.addEventListener("keypress",function(){
    
    if (start ==false) {
        console.log("started");
        start=true;
        levelup();
    }
});



function levelup(){
    userseq=[];
    level++;
    h2.innerText=`level ${level}`;

    let ranum = Math.floor(Math.random()*3);
    let randcolor = btns[ranum];
    let randbtn = document.querySelector(`.${randcolor}`);

    gameseq.push(randcolor);
    console.log(gameseq);
    btnflash(randbtn);
    
}

function btnflash(btn){
    btn.classList.add("flash");
    playSound();
    
    setTimeout(function(){
        btn.classList.remove("flash");
    },400);
}


function pressbtn(){
    let btn = this;
    btnflash(btn);
    

    usercolor =btn.getAttribute("id");
    userseq.push(usercolor);
    console.log(userseq);
    check(userseq.length-1); 
    
}

let allbtns = document.querySelectorAll(".btn");
for(btn of allbtns){
    btn.addEventListener("click",pressbtn);
}

function check(idx){
    // let idx = level-1;
    if(gameseq[idx] === userseq[idx]){
        if(userseq.length ==  gameseq.length){
            setTimeout(levelup,1000);
        }
    }else{
         playErrorSound();
        h2.innerHTML =`GAME OVER ! Your score was <b>${level}</b><br> press any key to start`;
        document.querySelector("body").style.backgroundColor="red";
        setTimeout(function(){
             document.querySelector("body").style.backgroundColor="white";
        },250);

        reset();
    }

}

function reset(){
    start=false;
    gameseq=[];
    userseq=[];
    level=0;
}
function playSound() {
    let audio = new Audio("https://actions.google.com/sounds/v1/alarms/beep_short.ogg");
    audio.play();
}
function playErrorSound() {
    let errorAudio = new Audio("error.mp3");
    errorAudio.play().catch((e) => console.log("Error sound error:", e));
}
