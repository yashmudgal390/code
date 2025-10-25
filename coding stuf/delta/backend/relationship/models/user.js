    const mongoose = require('mongoose');
    const {Schema}=mongoose;
    main().then(()=>{console.log("connection successful")}).catch(err => console.log(err));

    async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/relationDemo');
    }
    const userschema = new Schema({
        username:String,
        address:[
            {
                _id:false,
                location:String,
                city:String,
            },
        ],
    });

    const User = mongoose.model("User",userschema);
    const addusers = async()=>{
        let user1 =new User({
            username:"rahul",
            address:[
                {
                    location:"R34 holystreet",city:"London"
                }
            ]
        });
        user1.address.push({location:"z56 wallstreet",city:"London"});
        let result= await user1.save();
        console.log(result);    
    }

    addusers();