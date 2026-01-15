import { useState } from "react"

export default function Forms(){
    let[formData,setFormData]=useState({fullname:"",username:"",password:""})
    let handleInputChange=(event)=>{
        setFormData((currData)=>{            
            return{...currData,[event.target.name]:event.target.value};
        });        
    }

    let handleSub=(event)=>{
        event.preventDefault(); 
        console.log(formData)
        setFormData({fullname:"",username:"",password:""});
    }
    
    return(
        <form onSubmit={handleSub}>

            <label htmlFor="fullname">fullname</label>
            <input 
            placeholder="enter value"
            type="text"
            id="fullname"
            value={formData.fullname}
            name="fullname"
            onChange={handleInputChange}
            />
            <br></br>
            <label htmlFor="username">Username</label>
            <input 
            placeholder="enter value"
            type="text"
            id="username"
            value={formData.username}
            name="username"
            onChange={handleInputChange}
            />
            <br></br>
            <label htmlFor="password">password</label>
            <input 
            placeholder="enter value"
            type="text"
            id="password"
            value={formData.password}
            name="password"
            onChange={handleInputChange}
            />
            
            <br></br>
            <button>subbmit</button>
        </form>
    )
}