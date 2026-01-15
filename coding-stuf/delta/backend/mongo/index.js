const express=require("express");
const app= express();
const mongoose = require('mongoose');
const path = require("path");
const Chat = require("./models/chat.js");
const methodOverride = require("method-override");
const ExpressError = require("./ExpressError.js");

app.set("views",path.join(__dirname,"views"));
app.set("view engine","ejs");
app.use(express.static(path.join(__dirname,"public")));
app.use(express.urlencoded({extended:true}));
app.use(methodOverride("_method"));

main().catch(err => console.log(err));

async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
}

app.get("/chats", async (req,res)=>{
  let chats = await Chat.find();
  // console.log(chats);
  res.render("index.ejs",{chats});
})

app.get("/chats/new",(req,res)=>{
  res.render("new.ejs")
})

app.post("/chats", (req, res) => {
  let { from, to, msg } = req.body;

  let newchat = new Chat({
    from,
    to,
    msg,
    created_at: new Date()   // or leave it if you used default: Date.now
  });

  newchat.save()
    .then(chat => {
      console.log("Saved:", chat);
      res.redirect("/chats");
    })
    .catch(err => {
      console.log(err);
      res.send("Error saving chat");
    });
});

//edit 
app.get("/chats/:id/edit",async(req,res)=>{
  let{id}= req.params;
  let chat=  await Chat.findById(id);
    res.render("edit.ejs",{chat});
})

//update

app.put("/chats/:id",async(req,res)=>{
    let{id}= req.params;
    let {msg}=req.body;
    let updatedChat=await Chat.findByIdAndUpdate(id,{msg:msg},{runValidators:true ,new:true});
    res.redirect("/chats");
});

//delete

app.delete("/chats/:id",async(req,res)=>{
    let{id}= req.params;
    
    let deletedChat=await Chat.findByIdAndDelete(id);
    res.redirect("/chats");
    console.log(deletedChat);
});

app.get("/",(req,res)=>{
  res.send("working welll!")
});






app.listen(8080,()=>{
  console.log ("server is listeningon port 8080")
});