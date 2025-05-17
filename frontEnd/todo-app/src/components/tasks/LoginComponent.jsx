import { useState } from "react"

export default function LoginComponent() {
    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")
    const [loginStatus, setLoginStatus] = useState(null)   // failure or success

    function IsLoginClicked() {
        const hardcodedUsername = "rahul"
        const hardcodedPassword = "guy_montag"

        if (username === hardcodedUsername && password === hardcodedPassword) {
            console.log("login successful")
            setLoginStatus("SUCCESS")
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
                <button type="button" name="login" onClick={IsLoginClicked}
                 disabled={!username || !password}>Login</button>
            </div>
            {/* CONDITIONAL RENDERING */}
            {loginStatus === "SUCCESS" && (
                <div className="successMessage">Login success!</div>
            )}
            {loginStatus === "FAILURE" && (
                <div className="errorMessage">Login Failed! Invalid credentials</div>
            )}
        </div>
    )
    
}