import { Link, useLocation } from "react-router-dom"
import axios from "axios"

function callHelloWorldRestApi() {
    console.log("rest api endpoint")
    axios.get("http://localhost:8080/hello-world").then((response) => successfulResponse(response)).
    catch((error) => errorResponse(error)).finally(() => console.log("cleanup"))
}

function successfulResponse(response) {
    console.log(response)
}

function errorResponse(error) { 
    console.log(error)
}

export default function WelcomeComponent() {
    const location = useLocation()
    const {username} = location.state || {username : "Guest"}  // accessing location via use location hook

    return (
        <div className="WelcomeComponent">
            <h1>Welcome, {username}</h1>
            <p><Link to='/todos'>Manage your tasks</Link></p>
            <div>
                <button className="btn btn-success" onClick={callHelloWorldRestApi}>Call rest api endpoint</button>
            </div>
        </div>
    )
}