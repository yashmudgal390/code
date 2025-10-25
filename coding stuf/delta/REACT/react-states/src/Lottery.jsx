import { useState } from "react"
import ("./Lottery.css")
import { genNumber } from "./helper.js";
import { sum } from "./helper.js";
export default function Lottery(){
    let[ticket,setTicket]=useState(genNumber(3));
    let updateNum=()=>{
        setTicket(genNumber(3));
    }
    let isWinning = sum(ticket)===15;
    return(
        <div>
            <h1>Lottery<i className="fa-solid fa-face-smile smile"></i></h1>
            <h4>Lottery Ticket</h4>
            <h4 className="win">{isWinning && "congratulations! you WON   "}</h4>
            <div className="ticket">
                <span>{ticket[0]}</span>
                &nbsp;&nbsp;
                <span>{ticket[1]}</span>
                &nbsp;&nbsp;
                <span>{ticket[2]}</span>
            </div>
            <br></br><br></br><br></br>
            <button onClick={updateNum}>Get Lottery </button>
        </div>
    )
}