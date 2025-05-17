import { useState } from "react"

export default function LoginComponent() {
    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")

    function IsLoginClicked() {
        console.log("Login clicked")
        console.log("username: ", username)
        console.log("password: ", password)
    }

    return (
        <div className="LoginComponent">
            <h3>please enter username and password</h3>
            <div>
                <label>Username: </label>
                <input type="text" name="username" value={username} onChange={(e) => setUsername(e.target.value)}></input>
                <p>username being entered: {username}</p>
            </div>
            <div>
                <label>Password: </label>
                <input type="password" name="password" 
                       value={password} 
                       onChange={(e) => setPassword(e.target.value)}></input>
                <p>password being entered: {password}</p>
            </div>
            <div>
                <button type="button" name="login" onClick={IsLoginClicked}
                 disabled={!username || !password}>Login</button>
            </div>
        </div>
    )
    
}