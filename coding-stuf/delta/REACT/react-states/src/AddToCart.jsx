import { useState } from "react";

export default function AddToCart(){
        const allBrand=[
      {id:"1",name:"puma"},
      {id:"2",name:"adiddas"},
      {id:"3",name:"nike"},
      {id:"4",name:"fila"},
      {id:"5",name:"reebook"},
    ];

    let[cart,setcart]=useState([]);

    const onAddToCart=(id)=>{
        let reqName = allBrand.find(items=>items.id===id);
        setcart([...cart,reqName])
    }
    return(
        <>
        <div>
            <p>Add Brand To Cart</p>
            <hr></hr>
            {
                allBrand.map(brand=><div key={brand.id}>
                    <span>{brand.name}</span>
                    &nbsp;&nbsp;
                    <button onClick={()=>onAddToCart(brand.id)} >Add to Cart</button>
                </div>)
            }
        </div>
        <br></br>
        <br></br>
        <div>
            <p>Your Cart</p>
            <hr></hr>
           
            {
                cart.map(brand=><p>{brand.name}</p>)
            }

            
        </div>
        
        </>
    )
}