import { Link } from "react-router-dom";
import { AuthContext, useAuth } from "./security/AuthContext";
import { useContext } from "react";

export default function HeaderComponent() {

    // const authContext = useContext(AuthContext)
    // console.log(authContext.number)

    const authContext = useAuth()

    const authenticationStatus = authContext.isAuthenticated

    return (
        <header className="border-bottom border-light border-5 mb-5 p-2">
            <div className="container">
                <div className="row">
                    <nav className="navbar navbar-expand-lg">
                        
                            <a href="https://www.youtube.com/watch?v=xvFZjo5PgG0" target="blank" rel="noopener noreferrer" className="navbar-brand ms-2 fs-2 fw-bold text-black">DON'T CLICK</a>
                            <div className="collapse navbar-collapse">
                        <ul className="navbar-nav">
                            {authenticationStatus && (
                                <li className="nav-item fs-5"><Link to='/welcome' className="nav-link">Home</Link></li>
                            )}
                            {authenticationStatus && (
                                <li className="nav-item fs-5"><Link to='/todos' className="nav-link">Your tasks</Link></li>
                            )}                           
                        </ul>
                        </div>
                        <ul className="navbar-nav">
                            {/* render login link if authentication status (recieved from context as part of global state is false) */}
                            {!authenticationStatus && (
                                <li className="nav-item fs-5"><Link to='/' className="nav-link">Login</Link></li>
                            )}
                            {authenticationStatus && (
                                <li className="nav-item fs-5"><Link to='/logout' className="nav-link">Logout</Link></li>
                            )}                           
                        </ul>                        
                    </nav>
                </div>
            </div>
        </header>
    )
}