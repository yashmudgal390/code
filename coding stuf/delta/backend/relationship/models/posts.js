    const mongoose = require('mongoose');
    const {Schema}=mongoose;
    main().then(()=>{console.log("connection successful")}).catch(err => console.log(err));

    async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/relationDemo');
    }
    const userschema = new Schema({
        username:String,
        email:String,
    });

    const postschema = new Schema({
        content:String,
        likes:Number,
        user:{
            type:mongoose.Types.ObjectId,
            ref:"User"
        }
    });

    const  User = mongoose.model("User",userschema);
    const  Post = mongoose.model("Post",postschema);

    const addData = async () => {
  let user1 = new User({
    username: "rahulkumar",
    email: "rahul@gmail.com",
  });

  let post1 = new Post({
    content: "Hello World!",
    likes: 7,
  });

  post1.user = user1;

  await user1.save();
  await post1.save();
};

addData();
