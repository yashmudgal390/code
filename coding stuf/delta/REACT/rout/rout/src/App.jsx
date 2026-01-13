import './App.css';
import { NavLink, Route, Routes } from 'react-router-dom';
import { Home } from './pages/home';
import { Cart } from './pages/cart';
import { About } from './pages/about';
import { Login } from './pages/login';
import { PrivateRoute } from './component/PrivateRoute';

function App() {
  function getStyle({ isActive }) {
    return {
      color: isActive ? "red" : "black",
      marginRight: "20px"
    };
  }

  return (
    <>
      <nav>
        <NavLink to="/" style={getStyle}>Home</NavLink>
        <NavLink to="/cart" style={getStyle}>Cart</NavLink>
        <NavLink to="/about" style={getStyle}>About</NavLink>
        <NavLink to="/login" style={getStyle}>Login</NavLink>
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/cart" element={
          <PrivateRoute>
          <Cart />
          </PrivateRoute>
        } />
        <Route path="/about" element={<About />} />
        <Route path='/login' element={<Login/>}/>
      </Routes>
    </>
  );
}

export default App;
