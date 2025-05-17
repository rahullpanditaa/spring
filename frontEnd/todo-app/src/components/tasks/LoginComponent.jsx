export default function LoginComponent() {
    return (
        <div className="LoginComponent">
            <h3>please enter username and password</h3>
            <div>
                <label>Username: </label>
                <input type="text" name="username"></input>
            </div>
            <div>
                <label>Password: </label>
                <input type="password" name="password"></input>
            </div>
            <div>
                <button type="button" name="login">Login</button>
            </div>
        </div>
    )
    
}