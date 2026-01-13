import './App.css';
import { NavLink, Route, Routes } from 'react-router-dom';
import { Home } from './pages/home';
import { Cart } from './pages/cart';
import { About } from './pages/about';

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
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/cart" element={<Cart />} />
        <Route path="/about" element={<About />} />
      </Routes>
    </>
  );
}

export default App;
