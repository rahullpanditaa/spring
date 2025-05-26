import { createContext, useContext, useState } from "react";

// create a context to store some state to be shared with multiple components
export const AuthContext = createContext()

// this function will provide the authentication context to other components (the children)
export default function AuthProvider({children}) {

    // put some state to be provided to children components
    const [isAuthenticated, setIsAuthenticated] = useState(false)

    const [username, setUsername] = useState(null)

    function login(username, password) {
        if (username === "rahul" && password === "raskolnikov") {
            setIsAuthenticated(true)
            setUsername(username)
            return true
        } else {
            setIsAuthenticated(false)
            setUsername(null)
        }
    }

    function logout() {
        setIsAuthenticated(false)
    }

    return (
        <AuthContext.Provider value={{isAuthenticated, login, logout, username}}>
            {children}
        </AuthContext.Provider>
    )

}

export function useAuth() {
    return useContext(AuthContext)
}