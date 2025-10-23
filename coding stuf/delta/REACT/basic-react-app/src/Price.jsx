export default function Price({ oldPrice, newPrice }) {
  return (
    <div style={{backgroundColor:"#e0c367", height:"30px", borderBottomLeftRadius:"14px",  borderBottomRightRadius:"14px", width:"200px", marginTop:"47px"}}>
      <span style={{ textDecoration: "line-through", marginTop:"2px"}}>
        ₹{oldPrice}
      </span>
      &nbsp;&nbsp;&nbsp;&nbsp;
      <span style={{ color: "green", fontWeight: "bold",marginTop:"5px" }}>
        ₹{newPrice}
      </span>
    </div>
  );
}
