import { createContext, useContext, useState } from "react";

// create a context to store some state to be shared with multiple components
export const AuthContext = createContext()

// this function will provide the authentication context to other components (the children)
export default function AuthProvider({children}) {

    // put some state to be provided to children components
    const [number, setNumber] = useState(69)

    const [isAuthenticated, setIsAuthenticated] = useState(false)

    function logout() {
        setIsAuthenticated(false)
    }

    return (
        <AuthContext.Provider value={{number, isAuthenticated, setIsAuthenticated, logout}}>
            {children}
        </AuthContext.Provider>
    )

}

export function useAuth() {
    return useContext(AuthContext)
}