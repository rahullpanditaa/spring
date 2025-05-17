import { useState } from "react"
import { useNavigate } from "react-router-dom"

export default function LoginComponent() {
    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")
    const [loginStatus, setLoginStatus] = useState(null)   // failure or success

    const navigate = useNavigate()

    function HandleLoginClick() {
        const hardcodedUsername = "rahul"
        const hardcodedPassword = "guy_montag"

        if (username === hardcodedUsername && password === hardcodedPassword) {
            console.log("login successful")
            setLoginStatus("SUCCESS")
            navigate("/welcome", {state: {username}}) // route to this component if login success; pass state
        } else {
            console.log("login failed. invalid credentials")
            setLoginStatus("FAILURE")
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
            {loginStatus === "FAILURE" && (   
                // render this if login status equals failure
                <div className="errorMessage">Login Failed! Invalid credentials</div>
            )}
        </div>
    )
    
}