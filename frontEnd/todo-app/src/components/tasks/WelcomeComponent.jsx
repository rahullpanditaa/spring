import { useContext } from "react"
import { useLocation } from "react-router-dom"
import { AuthContext } from "./security/AuthContext"

export default function WelcomeComponent() {
    const location = useLocation()
    const {username} = location.state || {username : "Guest"}  // accessing location via use location hook

    const authContext = useContext(AuthContext)
    return (
        <div className="WelcomeComponent">
            <h1>Welcome, {username}</h1>
            {/* <p>current global state being stored in context is ${authContext.number}</p> */}
        </div>
    )
}