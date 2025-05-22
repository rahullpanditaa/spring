import { useLocation } from "react-router-dom"

export default function WelcomeComponent() {
    const location = useLocation()
    const {username} = location.state || {username : "Guest"}  // accessing location via use location hook
    return (
        <div className="WelcomeComponent">
            <h1>Welcome, {username}</h1>
        </div>
    )
}