import { useReducer } from "react"

export default function UseReducer(){
    const initialState={
        count:0,
    };
    const reducerFun=(state,action)=>{
        switch(action.type){
            case "incriment":
                return{
                    ...state,
                    count:state.count+1
                }
            case "decrement":
                return{
                    ...state,
                    count:state.count-1
                }    
            
            default:
                return state
        
            }   
    }

    let[{count},dispatch]=useReducer(reducerFun,initialState);
    console.log(count)
    
    


    return(
        <>
        <h2>{count}</h2>
        <button onClick={()=>dispatch({type:"incriment"})}>+</button>
        <button onClick={()=>dispatch({type:"decrement"})}>-</button>
        </>
    )
}