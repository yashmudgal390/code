import { useState } from "react";
export default function LikeButton(){
    let [isliked,setIsLiked]=useState(false);
    let Clicked=()=>{
        setIsLiked(!isliked);
        if (isliked==true) {
            
        }

    }
    return(
        <div>
            <p onClick={Clicked}>
                {isliked ? <i style={{color:"red"}}  className="fa-solid fa-heart"></i>:<i className="fa-regular fa-heart"></i>}
                </p>
        </div>
    )
}