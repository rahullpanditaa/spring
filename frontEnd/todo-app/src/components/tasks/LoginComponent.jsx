import { useState } from "react"
import { useNavigate } from "react-router-dom"
import { useAuth } from "./security/AuthContext"

export default function LoginComponent() {
    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")
    const [loginStatus, setLoginStatus] = useState(null)   // failure or success

    const navigate = useNavigate()

    const authContext = useAuth()

    function HandleLoginClick() {
        if (authContext.login(username, password)) {
            setLoginStatus("success")
            navigate("/welcome", {state: {username}}) // route to this component if login success; pass state
        } else {
            setLoginStatus("failure")
        }
    }

    return (
        <div className="LoginComponent">
            <h3>please enter username and password</h3>
            <div>
                <label>Username: </label>
                <input type="text" name="username" value={username} onChange={(e) => setUsername(e.target.value)}></input>
            </div>
            <div>
                <label>Password: </label>
                <input type="password" name="password" 
                       value={password} 
                       onChange={(e) => setPassword(e.target.value)}></input>
            </div>
            <div>
                <button type="button" name="login" onClick={HandleLoginClick}
                 disabled={!username || !password}>Login</button>
            </div>
            {/* CONDITIONAL RENDERING */}
            {loginStatus === "failure" && (   
                // render this if login status equals failure
                <div className="errorMessage">Login Failed! Invalid credentials</div>
            )}
        </div>
    )
    
}