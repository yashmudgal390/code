import './App.css'
import { useDispatch, useSelector } from 'react-redux';
import { addTodo ,deleteTodo } from '../slices/todoSlice';
import { v4 as uuid } from 'uuid';
import { useState } from 'react';
function App() {

  const [inputText, setInputText] = useState('');

  const { todos } = useSelector(state => state.todos);
  console.log(todos);

  const dispatch = useDispatch();

  const onAddClick = () => {
    dispatch(addTodo({
      id: uuid(),
      todo: inputText
    }))
    setInputText('');
  }
  const onTodoDelete=(id)=>{
    dispatch(deleteTodo(id)); 
  }

  return (

    <div className="App bg-slate-200 w-full h-full">
      <h1 className='text-violet-800 pt-4'>Todo App</h1>

      <div>

        <input value={inputText} onChange={(e) => setInputText(e.target.value)} placeholder='Enter a todo...' />
        <button onClick={onAddClick}>Add</button>
      </div>
      {
        todos?.length > 0 && todos.map(todo => (
          <div>
            <span>{todo.todo}</span>
            <button onClick={() => onTodoDelete(todo.id)}>Delete</button>
          </div>
        ))
      }
    </div>


  )
}

export default App
