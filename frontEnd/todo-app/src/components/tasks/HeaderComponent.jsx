import { Link } from "react-router-dom";

export default function HeaderComponent() {
    return (
        <header className="HeaderComponent">
            <nav>
                <ul>
                    <li><Link to='/welcome'>Home</Link></li>
                    <li><Link to='/todos'>Your tasks</Link></li>
                    <li><Link to='/logout'>Logout</Link></li>
                </ul>
            </nav>
        </header>
    )
}