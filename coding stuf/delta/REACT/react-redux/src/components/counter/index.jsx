import { useSelector,useDispatch } from "react-redux";
import { increment,decrement } from "../../slices/counterSlice";


export const Counter = () => {
    const dispatch=useDispatch();
const {count} = useSelector(state=>state.counter);
console.log(count)

const onUpClick=()=>{
    dispatch(increment());
}
const onDownClick=()=>{
    dispatch(decrement());
}
    return (
        <>
            <button onClick={onUpClick}>up</button>

            <span>{count}</span>
            <button onClick={onDownClick}>down</button>
        </>
    )
}