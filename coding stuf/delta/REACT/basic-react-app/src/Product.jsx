import Price from "./Price";
import "./Product.css";
function Product ({title,idx,features }){
    let oldPrices=["12,999","9,000","5,000"];
    let newPrices=["10,000","8,500","3,450"];
    let description=["8000 DPI","Mechanical","Smart"]
    return(
    <div className="Product">
        <h3>{title}</h3>
        <p>{description[idx]}</p>
        <Price oldPrice={oldPrices[idx]} newPrice={newPrices[idx]}/>
    </div>
    )
}
export default Product;