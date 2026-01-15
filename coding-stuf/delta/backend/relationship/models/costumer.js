    const mongoose = require('mongoose');
    const {Schema}=mongoose;
    main().then(()=>{console.log("connection successful")}).catch(err => console.log(err));

    async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/relationDemo');
    }
    const orderSchema = new Schema({
     item:String,
     price:Number,
    });

    const customerSchema = new Schema({
     name:String,
     orders:[
        {
            type: Schema.Types.ObjectId,
            ref:"Order"
        }
     ],
    });

     customerSchema.post("findOneAndDelete",async (custumer)=>{
        
        if(custumer.orders.length){
            let res=await Order.deleteMany({_id:{$in :custumer.orders}})
            console.log(res);
        }
    }); 

    const Order = mongoose.model("Order",orderSchema);
    const Customer = mongoose.model("Customer",customerSchema);
  

    const addCustomer = async ()=>{
        let newcust= new Customer({
            name:"karan",   
        });

        let neword = new Order({
            item:"burger",
            price:300
        });
        newcust.orders.push(neword);
            
        await newcust.save();
        await neword.save();
        console.log("new custumer added");
    };

    // addCustomer();
    const delcust = async ()=>{
        let data = await Customer.findByIdAndDelete("68c286692522ea40293d594f");
        console.log(data);
    };
    delcust();

    // const addORders=async()=>{
    //     let result = await Order.insertMany([
    //         {item:"somasa",price:10},
    //         {item:"chocolate",price:40},
    //         {item:"chips",price:10},
    //     ]);
    //     console.log(result);
    // };

    // addORders();