const { faker } = require('@faker-js/faker');
const mysql = require('mysql2');
const express = require('express');
const app = express();
const path = require('path');
const methodOverride = require("method-override");

app.use(methodOverride("_method"));
app.use(express.urlencoded({extended : true}));
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));

// create connection
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  database: 'delta_app',
  password: 'yash@vaani2311'
});
let getRandomUser = () => {
  return[
     faker.string.uuid(),
     faker.internet.userName(), 
     faker.internet.email(),
     faker.internet.password()
];
};

//home 
app.get("/",(req,res)=>{
  let q =`select count(*) from user`
  try {
  connection.query(q, (err, result) => {
    if (err) throw err;
    let count = result[0]["count(*)"];
    res.render("home.ejs",{count});
  });
} catch (err) {
  console.log(err);
}

});

//users

app.get("/users",(req,res)=>{
  let q =`select * from user`
  try {
  connection.query(q, (err, result) => {
    if (err) throw err;
    res.render("showusers.ejs",{result});
  });
} catch (err) {
  console.log(err);
}

});

//edit

app.get("/user/:id/edit",(req, res)=>{
  let{id}=req.params;
  let q = `select * from user where id='${id}'`;
  console.log(id);
 
  try {
  connection.query(q, (err, result) => {
    if (err) throw err;
    let user = result[0];
    res.render("editName.ejs",{user});
  });
} catch (err) {
  console.log(err);
}
});

//edit in db

app.patch("/user/:id",(req,res)=>{
    let{id}=req.params;
    let{password:formPass, username:newName}=req.body;
  let q = `select * from user where id='${id}'`;
  console.log(id);
 
  try {
  connection.query(q, (err, result) => {
    if (err) throw err;
    let user = result[0];
    if (formPass !== user.password) {
      return res.send("wrong pass");
    }
    else{
      
      let q2 =`update user set name='${newName}' where id='${id}'`;
      connection.query(q2,(err,updatedData)=>{
        if(err) throw err;
        res.redirect("/users")

      })
    }
    
  });
} catch (err) {
  console.log(err);
}
})

//add

app.get("/user/new",(req,res)=>{
  res.render("new.ejs")
})

app.post("/user",(req,res)=>{
  let {id,name,email,password} = req.body;
  let q = `INSERT INTO user (id, name, email, password) VALUES (?, ?, ?, ?)`;
  let values = [id,name,email,password];

  try {
    connection.query(q, values, (err, result) => {
      if (err) {
        console.error(err);
        return res.send("Error inserting user");
      }
      res.redirect("/users");
    });
  } catch (err) {
    console.log(err);
  }
});

//delete

app.get("/user/:id/delete", (req, res) => {
  let { id } = req.params;
  let q = `SELECT * FROM user WHERE id='${id}'`;
  
  connection.query(q, (err, result) => {
    if (err) throw err;
    let user = result[0];
    res.render("delete.ejs", { user });  // now user is passed to delete.ejs
  });
});


app.delete("/user/:id",(req,res)=>{
    let { id } = req.params;
    let { password: formPass, email: formMail } = req.body;

    let q = `SELECT * FROM user WHERE id='${id}'`;
    console.log(id);

    try {
        connection.query(q, (err, result) => {
            if (err) throw err;
            if (result.length === 0) return res.send("User not found");

            let user = result[0];

            // ✅ Use formMail instead of formEmail
            if (formMail !== user.email || formPass !== user.password) {
                return res.send("Invalid email or password ");
            }

            let q2 = `DELETE FROM user WHERE id='${id}'`;
            connection.query(q2, (err, result2) => {
                if (err) throw err;
                res.redirect("/users");
            });
        });
    } catch (err) {
        console.log(err);
        res.send("Error deleting user");
    }
});


app.listen("8080",()=>{
  console.log("listning on port");
});


// let q = "INSERT INTO user(id,name,email,password) values ?"
// let data=[];
// for(let i=0;i<=1000;i++){
//   data.push(getRandomUser());
// }
// console.log( data.length)
// try {
//   connection.query(q,[data], (err, result) => {
//     if (err) throw err;
//     console.log(result);
//   });
// } catch (err) {
//   console.log(err);
// }
// connection.end();


