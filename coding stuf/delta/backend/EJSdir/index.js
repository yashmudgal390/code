const express = require("express");
const app =express();
const path =require("path");


// console.log(app);

let port = 8080;
app.use(express.static(path.join(__dirname,"public")));
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));

// app.get("/",(req,res)=>{
//     res.render("home.ejs");
// });

app.get("/ig/:username",(req,res)=>{
    let {username}=req.params;
    const instadata = require ("./data.json");
    let data = instadata[username];
    console.log(data);
    res.render("home.ejs",{ data });

})
app.listen(port ,()=>{
    console.log("requiest is sent from port"+ port);
});