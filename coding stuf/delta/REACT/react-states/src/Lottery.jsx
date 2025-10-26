import { useState } from "react"

import { genNumber } from "./helper.js";
import { sum } from "./helper.js";
import Ticket from "./Ticket.jsx";

export default function Lottery({n=3,wsum=15}){

    let[ticket,setTicket]=useState(genNumber(n));
    let updateNum=()=>{
        setTicket(genNumber(n));
    }

    let isWinning = sum(ticket)=== wsum;
    return(
        <div>
            <h1>Lottery<i className="fa-solid fa-face-smile " style={{color:"yellow"}}></i></h1>
            <h4 style={{color:"gray"}}>Lottery Ticket</h4>
          <h4 className="win" style={{ color: "white" }}>
  {isWinning && (
    <>
      Congratulations! You WON <i className="fa-solid fa-heart" style={{ color: "red" }}></i>
    </>
  )}
</h4>

            <Ticket ticket={ticket} />
            <br></br><br></br><br></br>
            <button onClick={updateNum}>Get Lottery </button>
        </div>
    )
}