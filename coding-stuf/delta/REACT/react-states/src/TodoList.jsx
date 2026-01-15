import { v4 as uuidv4 } from 'uuid';
import { useState } from "react";



export default function TodoList() {
  let [Todos, setTodos] = useState([{ task: "Sample Task", id: uuidv4(),isDone:false}]);
  let [newTodo, setNewTodo] = useState("");

  let addTask = () => {
    if (newTodo.trim() !== "") {
      setTodos((prevValue) => [
        ...prevValue,
        { task: newTodo, id: uuidv4(),isDone:false }
      ]);
      setNewTodo("");
    }
  };

  let updateTodo = (event) => {
    setNewTodo(event.target.value);
  };

  let deleteTodo = (id) => {
    setTodos(prevTodo=>prevTodo.filter((todo) => todo.id !== id));
  };

  let upperCase=()=>{
  setTodos(Todos.map((prevTodo)=>{
    return{...prevTodo,task:prevTodo.task.toUpperCase(),

    };
  }))
  }
let isDoneTask = (id) => {
  setTodos((prevTodo) => {
    return prevTodo.map((todo) => {
      if (todo.id == id) {
        return {
          ...todo,
          isDone:true,
        };
      } else {
        return todo;
      }
    });
  });
};

let markDone=(id)=>{
  setTodos((todo)=>{
    return todo.id()
  })
}
  return (
    <div>
      <input
        placeholder="ADD A TASK"
        value={newTodo}
        onChange={updateTodo}
      />
      &nbsp;&nbsp;&nbsp;&nbsp;
      <button onClick={addTask}>ADD</button>
      <br />
      <br />
      <h4>Tasks To Complete</h4>
      <ul>
        {Todos.map((todo) => (
          <li key={todo.id}>
            <span style={todo.isDone ? {textDecorationLine:"line-through"}:{}}>{todo.task}</span>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <button onClick={() => deleteTodo(todo.id)}>drop</button>
            <button onClick={()=>isDoneTask(todo.id)}>Mark done</button>
          </li>
          
        ))}
      </ul>
      <button onClick={upperCase}>To upper case </button>
    </div>
  );
}



