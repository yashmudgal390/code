import { useState } from "react";

export default function TodoList() {
  let [Todos, setTodos] = useState(["Sample Task"]);
  let [newTodo, setNewTodo] = useState("");

  let addTask = () => {
    if (newTodo.trim() !== "") {
      setTodos([...Todos, newTodo]);
      setNewTodo("");
    }
  };

  let updateTodo = (event) => {
    setNewTodo(event.target.value);
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
        {Todos.map((todo, index) => (
          <li key={index}>{todo}</li>
        ))}
      </ul>
    </div>
  );
}
