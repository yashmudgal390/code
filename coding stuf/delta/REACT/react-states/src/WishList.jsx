import { useState } from "react"
import { v4 as uuidv4 } from 'uuid';

export default function WishList(){

    let[list,setList]=useState([{name:"todo",id:uuidv4()}]);
    let[todo,setTodo]=useState();


    const onInputChange=(e)=>{
        setTodo(e.target.value);
    }
   const onAdd=()=>{
        setList([...list,{name:todo ,id:uuidv4()}])
        setTodo("");
   }

    return(
        <>
        <h2>Your WishList</h2>
        <div className="toadd">
            <input onChange={onInputChange} placeholder="Enter Event"></input>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <button onClick={onAdd} style={{backgroundColor:"red"}}>ADD</button>
            <hr></hr>

        </div>
        <div>
            {todo && todo.length>0 && todo.map(todo=>(
                <div>
                    
                </div>

            ))}
        </div>

        </>
    )
}            <div>
                <label>
                    <input type="checkbox"></input>
                    &nbsp;&nbsp;
                    <span>code</span>
                </label>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <button><i class="fa-solid fa-trash"></i></button>
            </div>