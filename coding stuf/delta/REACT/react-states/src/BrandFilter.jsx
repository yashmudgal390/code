import { useState } from "react"

export default function BrandFilter(){
    const allBrand=[
      {id:"1",name:"puma"},
      {id:"2",name:"adiddas"},
      {id:"3",name:"nike"},
      {id:"4",name:"fila"},
      {id:"5",name:"reebook"},
    ];

    let[brands,setBrands]=useState(allBrand);
    

    const onSearcChange =(e)=>{
        const BrandFilter=e.target.value.length>0? brands.filter(brand=>brand.name.includes(e.target.value.toLowerCase())):allBrand;
        setBrands(BrandFilter);
    }

    return(
        <>
        <label htmlFor="search">Search</label>
        &nbsp;&nbsp;
        <input   onChange={onSearcChange} id="search" placeholder="Enter Brand Name"/>
        <ul>
            {brands.map(brand=><li key={brand.id}> {brand.name}</li>)}
        </ul>
        </>
    )
}