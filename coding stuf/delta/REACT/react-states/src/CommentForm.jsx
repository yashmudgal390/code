import { useState } from "react"

export default function CommentForm({AddNewComment}){
    let[formData,setFormData]=useState({
        username:"",
        review:"",
        rating:""

    });
    let handleDataChange=(event)=>{
        setFormData((currData)=>{
            return{...currData,[event.target.name]:event.target.value};
        });
    };
    let handleSub=(event)=>{
        event.preventDefault();
        console.log(formData);
        AddNewComment(formData);
        setFormData({
        username:"",
        review:"",
        rating:""

    });
    }
    return(
        <div>
            <h4>Leave Review</h4>
            <form onSubmit={handleSub}>
                <input placeholder="Username" value={formData.username}  name="username" type="text" onChange={handleDataChange}></input>
                <br></br>
                <br></br>
                <textarea placeholder="Review" value={formData.review}  name="review" onChange={handleDataChange} />
                <br></br>
                <br></br>
                <input placeholder="Rating" value={formData.rating}  name="rating" type="number" min={0} max={5} onChange={handleDataChange}></input>
                <br></br>
                <br></br>
                <button>submit</button>            
            </form>
        </div>
    )
}