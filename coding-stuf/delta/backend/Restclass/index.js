// const { name } = require("ejs");
const express =require("express");
const app = express();
const port = 8080;
const path = require("path");
const { v4: uuidv4 } = require('uuid');
const methodOverride = require("method-override")
 // ⇨ '1b9d6bcd-bbfd-4b2d-9b5d-ab8dfbbd4bed'

app.use(express.urlencoded({extended : true}));
app.use(methodOverride('_method'))

app.set("view engine","ejs");
app.set("views",path.join(__dirname,"views"));
app.use(express.static(path.join(__dirname,"public")));

let posts =[
    {
        name: "yash",
        post:"hi whatsup ",
        id: uuidv4(),
    },{
        name: "rajani",
        post:"i am a good boy",
        id : uuidv4(),
    },{
        name: "nishu",
        post:"gym jao bc",
        id :uuidv4(),
    },
]

app.get("/posts",(req,res)=>{
    res.render("index.ejs",{posts});

});

app.get("/posts/new",(req,res)=>{
    res.render("new.ejs");
});
app.post("/posts",(req,res)=>{
    let {name,post}=req.body;
    let id=uuidv4();
    posts.push({id,name,post});
    res.redirect("/posts");
})
app.get("/posts/:id",(req,res)=>{
    let {id} = req.params;
    let post = posts.find((p)=> id === p.id);
    console.log(post);
        res.render("show.ejs",{post});
})


app.patch("/posts/:id",(req,res)=>{
    let {id} = req.params;
    let newContent = req.body.post;
    let post = posts.find((p)=> id === p.id);
    post.post=newContent;
    console.log(post);
    res.redirect("/posts");

})

app.get("/posts/:id/edit",(req,res)=>{
    let {id} = req.params;
    let post = posts.find((p)=> id === p.id);
    res.render("edit.ejs",{post});
    
})


app.delete("/posts/:id",(req,res)=>{
    let {id} = req.params;
     posts = posts.filter((p)=> id !== p.id);
     res.redirect("/posts");
})
app.get("/",(req,res)=>{
    res.send("server working perfectly!!!!!!");
});

app.listen(port,()=>{
    console.log(`listining on port${port}`);
});
