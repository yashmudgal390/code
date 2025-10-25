const express = require("express");
const app =express();

// console.log(app);

let port = 3000;

app.listen(port ,()=>{
    console.log("requiest is sent from port"+ port);
})

app.get("/help",(req,res)=>{
    res.send("hello how can i assist u ");
})