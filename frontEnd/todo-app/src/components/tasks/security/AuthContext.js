// create context, put some state in it that can be shred across components

const { createContext, useState, useContext } = require("react");

const AuthContext = createContext()

export function AuthProvider({children}) {
    const [isAuthenticated, setIsAuthenticated] = useState(false)  // is user logged in? initially, no
    const [username, setUsername] = useState("")

    function login(user) {
        setIsAuthenticated(true)
        setUsername(user)
    }

    function logout() {
        setIsAuthenticated(false)
        setUsername("")
    }

    // giving the above state and methods to all child components
    return (
        <AuthContext.Provider value={{isAuthenticated, username, login, logout}}>
            {children}
        </AuthContext.Provider>
    )
}

export function useAuth() {
    return useContext(AuthContext)
}