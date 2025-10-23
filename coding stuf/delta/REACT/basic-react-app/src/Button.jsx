function sayHello(){
    console.log("say hello to me");
}
function sayBye(){
    console.log("bye");
}
export default function Button(){
    return(
        <div>
            <button onClick={sayHello}>click me for hello </button>
            <button onClick={sayBye}>click me for bye </button>
        </div>
    )
}