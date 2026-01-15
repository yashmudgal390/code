const mongoose = require('mongoose');
const Chat = require("./models/chat.js")
main().catch(err => console.log(err));


async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
}


let chats = [
  {
    from: "neha",
    to: "priya",
    msg: "send me your exam sheet",
    created_at: new Date(),
  },
  {
    from: "priya",
    to: "neha",
    msg: "ok, I’ll send it in 5 mins",
    created_at: new Date(),
  },
  {
    from: "rahul",
    to: "neha",
    msg: "are you ready for the project submission?", 
    created_at: new Date(),
  },
  {
    from: "neha",
    to: "rahul",
    msg: "almost done, will share tonight",
    created_at: new Date(),
  },
];

Chat.insertMany(chats);