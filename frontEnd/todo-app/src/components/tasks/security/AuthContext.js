import { createContext, useState } from "react";

// create a context to store some state to be shared with multiple components
export const AuthContext = createContext()

// this function will provide the authentication context to other components (the children)
export default function AuthProvider({children}) {

    // put some state to be provided to children components
    const [number, setNumber] = useState(0)

    return (
        <AuthContext.Provider value={{number}}>
            {children}
        </AuthContext.Provider>
    )

}