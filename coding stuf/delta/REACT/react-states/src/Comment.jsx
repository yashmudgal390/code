import "./Comment.css"
import { useState } from "react"
import CommentForm from "./CommentForm";
export default function Comment(){
    let[comment,setComment]=useState([{
        username:"@ask",
        review:"nice",
        rating:"5"
    },]);

    let AddNewComment = (comments)=>{
        setComment((currComment)=>[...currComment,comments]);
        console.log("comment added")
    }
    return(
    <>
        <div>
            <h3>All Comments</h3>
            {comment.map((comments,indx)=>(
                 <div className="comments" key={indx}>
                <span >{comments.review}</span>
                &nbsp;
                &nbsp;
                &nbsp;
                <span>(rating = {comments.rating})</span>
                <br></br>
                <span>{comments.username}</span>
            </div>
            ))}
           
            
        </div>
        <CommentForm AddNewComment={AddNewComment}/>
    </>
    )
}