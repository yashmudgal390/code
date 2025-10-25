import { v4 as uuidv4 } from 'uuid';
import { useState } from "react";

export default function TodoList() {
  let [Todos, setTodos] = useState([{ task: "Sample Task", id: uuidv4() }]);
  let [newTodo, setNewTodo] = useState("");

  let addTask = () => {
    if (newTodo.trim() !== "") {
      setTodos((prevValue) => [
        ...prevValue,
        { task: newTodo, id: uuidv4() }
      ]);
      setNewTodo("");
    }
  };

  let updateTodo = (event) => {
    setNewTodo(event.target.value);
  };

  let deleteTodo = (id) => {
    setTodos(prevTodo=>Todos.filter((prevTodo) => prevTodo.id !== id));
  };

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
            <span>{todo.task}</span>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <button onClick={() => deleteTodo(todo.id)}>drop</button>
          </li>
        ))}
      </ul>
    </div>
  );
}
