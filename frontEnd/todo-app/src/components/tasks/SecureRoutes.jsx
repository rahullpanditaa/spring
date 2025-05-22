import { Outlet, Navigate } from "react-router-dom";
import { useAuth } from "./security/AuthContext";

export default function SecureRoutes() {
    const authContext = useAuth()

    // if authenticated, render nested routes (Outlet), else navigate to root
    return authContext.isAuthenticated ? <Outlet/> : <Navigate to='/'/>
}