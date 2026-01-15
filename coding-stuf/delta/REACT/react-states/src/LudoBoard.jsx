import { useState } from "react"

export default function LudoBoard(){
    let [moves,setMoves]=useState({blue:0,red:0,yellow:0,green:0});
    let Update=(color)=>{
        
        setMoves((prevMoves)=>{

        
           return {...prevMoves ,[color]:prevMoves[color]+1 }
        }
    )
    }
    return(
        <div>
            <h3>Game Begins</h3>
            <div className="board">
                <p>Blue Moves={moves.blue}</p>
                <button style={{backgroundColor:"blue"}} onClick={()=>{Update("blue")}}>+1</button>

                <p>Yellow Moves={moves.yellow}</p>
                <button style={{backgroundColor:"yellow" ,color:"black"}} onClick={()=>{Update("yellow")}}>+1</button>

                <p>Green Moves={moves.green}</p>
                <button style={{backgroundColor:"green"}} onClick={()=>{Update("green")}}>+1</button> 

                <p>Red Moves={moves.red}</p>
                <button style={{backgroundColor:"red"}} onClick={()=>{Update("red")}}>+1</button>
            </div>
        </div>
    )
}