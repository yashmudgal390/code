import { useState } from "react";
import { v4 as uuidv4 } from "uuid";

export default function WishList() {
  let [list, setList] = useState([]);
  let [todo, setTodo] = useState("");

  const onInputChange = (e) => {
    setTodo(e.target.value);
  };

  const onAdd = () => {
    if (todo.trim() !== "") {
      setList((prevValue) => [
        ...prevValue,
        { task: todo, id: uuidv4(), isDone: false },
      ]);
      setTodo("");
    }
  };

  const onDeleteClick = (id) => {
    setList((pl) => pl.filter((todo) => todo.id !== id));
  };

  const onChange = (id) => {
    setList((prVal) => {
      return prVal.map((todo) => {
        if (todo.id === id) {
          return {
            ...todo,
            isDone: !todo.isDone, // toggle true/false for checkbox
          };
        } else {
          return todo;
        }
      });
    });
  };

  return (
    <>
      <h2>Your WishList</h2>
      <div className="toadd">
        <input
          onChange={onInputChange}
          value={todo}
          placeholder="Enter Event"
        />
        &nbsp;&nbsp;&nbsp;&nbsp;
        <button onClick={onAdd} style={{ backgroundColor: "red" }}>
          ADD
        </button>
        <hr />
      </div>

      <div>
        {list &&
          list.length > 0 &&
          list.map((todo) => (
            <div key={todo.id}>
              <label>
                <input
                  onChange={() => onChange(todo.id)}
                  type="checkbox"
                  checked={todo.isDone}
                />
                &nbsp;&nbsp;
                <span
                  style={
                    todo.isDone
                      ? { textDecorationLine: "line-through", color: "gray" }
                      : {}
                  }
                >
                  {todo.task}
                </span>
              </label>
              &nbsp;&nbsp;&nbsp;&nbsp;
              <button onClick={() => onDeleteClick(todo.id)}>
                <i className="fa-solid fa-trash"></i>
              </button>
            </div>
          ))}
      </div>
    </>
  );
}
