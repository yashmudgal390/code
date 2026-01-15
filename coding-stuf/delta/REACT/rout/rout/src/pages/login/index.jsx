import { useAuth } from "../../component/context/auth-context";

export const Login = () => {
    const { isLoggedIn, setIsLoggedIn } = useAuth();

    const onLogin = () => {
        setIsLoggedIn(!isLoggedIn);
    };

    return (
        <>
            <h1>Login</h1>

            { !isLoggedIn && (
                <input 
                    placeholder="Number" 
                    maxLength={10}
                />
            )}

            <button onClick={onLogin}>
                {isLoggedIn ? "Logout" : "Login"}
            </button>
        </>
    );
};
