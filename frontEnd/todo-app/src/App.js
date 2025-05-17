import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
// import TodoApp from './components/tasks/TodoApp';
import LoginComponent from './components/tasks/LoginComponent';
import WelcomeComponent from './components/tasks/WelcomeComponent';


function App() {
  return (
    <div className="App">
      <BrowserRouter>
          <Routes>
            <Route path="/" element={<LoginComponent></LoginComponent>}></Route>
            <Route path="/welcome" element={<WelcomeComponent></WelcomeComponent>}></Route>
          </Routes>
      </BrowserRouter>
      {/* <TodoApp></TodoApp> */}
    </div>
  );
}

export default App;
