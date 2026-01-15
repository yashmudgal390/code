
import { createContext,useContext,useState } from "react";
const countCont = createContext();

//provider
const countProv=({child})=>{

    const [count,useCount]=useState(0);

    return(
        <countCont.Provider value={{count,useCount}}>
            {child}
        </countCont.Provider>
    );

}

//consumer
const useCount=()=>useContext(countCont)
//export

export {useCount,countProv};
