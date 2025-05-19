import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
// import TodoApp from './components/tasks/TodoApp';
import LoginComponent from './components/tasks/LoginComponent';
import WelcomeComponent from './components/tasks/WelcomeComponent';
import ErrorComponent from './components/tasks/ErrorComponent';
import ListTodosComponent from './components/tasks/ListTodosComponent';


function App() {
  return (
    <div className="App">
      <BrowserRouter>
          <Routes>
            <Route path="/" element={<LoginComponent/>}></Route>
            <Route path="/welcome" element={<WelcomeComponent/>}></Route>
            <Route path='/todos' element={<ListTodosComponent/>}></Route>
            <Route path='*' element={<ErrorComponent/>}></Route>
          </Routes>
      </BrowserRouter>
      {/* <TodoApp></TodoApp> */}
    </div>
  );
}

export default App;
