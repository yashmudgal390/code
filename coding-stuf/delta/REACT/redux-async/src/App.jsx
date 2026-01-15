import { useDispatch, useSelector } from 'react-redux';
import { loadPost } from './slice/postSlice';
import './App.css'
import { useEffect } from 'react';

function App() {
  const dispatch = useDispatch();
  const { posts, status } = useSelector(state => state.posts);
  useEffect(() => {
    if (status === 'idle') {
      dispatch(loadPost());
    }
  }, [status, dispatch]);
  return (
    <>
      <div className="App">

      </div>
    </>
  )
}

export default App
