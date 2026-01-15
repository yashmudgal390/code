import { useNavigate } from "react-router-dom";
export const Home=()=>{
    const nav=useNavigate();
    const goCartClick=()=>{
        nav("/cart");
    }
    return(
        <>
        <h1>
            this is home
        </h1>
        <button onClick={goCartClick}>go to cart </button>
        </>
    );
};