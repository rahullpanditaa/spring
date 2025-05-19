import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
// import TodoApp from './components/tasks/TodoApp';
import LoginComponent from './components/tasks/LoginComponent';
import WelcomeComponent from './components/tasks/WelcomeComponent';
import ErrorComponent from './components/tasks/ErrorComponent';
import ListTodosComponent from './components/tasks/ListTodosComponent';
import HeaderComponent from './components/tasks/HeaderComponent';
import FooterComponent from './components/tasks/FooterComponent';
import LogoutComponent from './components/tasks/LogoutComponent';


function App() {
  return (
    <div className="App">
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
      {/* <TodoApp></TodoApp> */}
    </div>
  );
}

export default App;
