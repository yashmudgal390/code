const mongoose = require('mongoose');
const chat = new mongoose.Schema({
    from:{
        type : String,
        required:true
    },
    to:{
        type:String,
         required:true
    },
    msg:{
        type:String,
         max:50    
    },
    created_at:{
        type:Date,
         required:true
    }

});

const Chat=mongoose.model("Chat",chat);
module.exports=Chat;