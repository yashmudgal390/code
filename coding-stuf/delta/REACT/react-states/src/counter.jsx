import { useState } from "react";
export default function Count(){
    let [count,setCount]=useState(0);
   
    let incCount=()=>{
        setCount(count+1);
        console.log(count);
    }
    return(
        <div>
            <h3>Count ={count}</h3>
            <button onClick={incCount}>Increase count</button>

        </div>
    )
}