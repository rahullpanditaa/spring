// import logo from './logo.svg';
import { Component } from 'react';
import './App.css';

function App() {
  return (
    <div className="App">
      <Header></Header>
      <p>3 components - Header, component one, footer</p>
      <ComponentOne></ComponentOne>
      <ClassComponent></ClassComponent>
      <Footer></Footer>
    </div>
  );
}

// whatever is returned from a component is what is shown as part/representation of that component
function ComponentOne() {
  return (
    <div className='FirstComponent'>First Component</div>
  )
}

function Header() {
  return (
    <h1>A Simple React UI</h1>
  )
}

function Footer() {
  return (
    <footer>blah blah blah</footer>
  )
}

class ClassComponent extends Component {

  render() {
    return (
      <div className='classComponet'>A Class Component</div>
    )
  }
}

export default App;
