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

const useAuth = () => {
    const context = useContext(AuthCont);
    if (!context) {
        throw new Error('useAuth must be used within Authprovider');
    }
    return context;
};

export { useAuth, Authprovider };
