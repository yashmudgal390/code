import Product from "./Product";

function ProductTab(){
    let styles = {
        display:"flex",
        flexWrap:"wrap",
        justifyContent:"center",
        alignItem:"center",
        paddingBottom:"5px"

    };
    return(
        
        
        <div style={styles}>
        <Product title="Mouse" idx={0} />
        <Product title="Keyboard"idx={1}/>
        <Product title="Phone"idx={2}/>
        </div>
    )
};
export default ProductTab ;