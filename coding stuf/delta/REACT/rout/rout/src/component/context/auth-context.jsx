import { createContext, useContext, useState } from "react";

const AuthCont = createContext();

const Authprovider = ({ children }) => {
    const [isLoggedIn, setIsLoggedIn] = useState(false);

    return (
        <AuthCont.Provider value={{ isLoggedIn, setIsLoggedIn }}>
            {children}
        </AuthCont.Provider>
    );
};

const useAuth = () => useContext(AuthCont);

export { useAuth, Authprovider };
