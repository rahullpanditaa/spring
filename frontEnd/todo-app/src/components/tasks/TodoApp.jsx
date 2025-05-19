import LoginComponent from './LoginComponent';
import WelcomeComponent from './WelcomeComponent';
import ErrorComponent from './ErrorComponent';
import ListTodosComponent from './ListTodosComponent';
import HeaderComponent from './HeaderComponent';
import FooterComponent from './FooterComponent';
import LogoutComponent from './LogoutComponent';
import './TodoApp.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { AuthProvider } from './security/AuthContext';


export default function TodoApp() {
    return (
        <div className="TodoApp">
            <AuthProvider>
            <BrowserRouter>
                <HeaderComponent/>
                    <Routes>
                        <Route path="/" element={<LoginComponent/>}></Route>
                        <Route path="/welcome" element={<WelcomeComponent/>}></Route>
                        <Route path='/todos' element={<ListTodosComponent/>}></Route>
                        <Route path='*' element={<ErrorComponent/>}></Route>
                        <Route path='/logout' element={<LogoutComponent/>}></Route>
                    </Routes>
                <FooterComponent/>
            </BrowserRouter>
            </AuthProvider>
        </div>
    )
}