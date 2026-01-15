import { useAuth } from "../context/auth-context";
import { Navigate } from "react-router-dom";  // ← MISSING IMPORT

export const PrivateRoute = ({ children }) => {
    const { isLoggedIn } = useAuth();
    return isLoggedIn ? children : <Navigate to="/login" />;
};
