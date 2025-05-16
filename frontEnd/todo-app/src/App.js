import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      Application update
      <ComponentOne></ComponentOne>
    </div>
  );
}

// whatever is returned from a component is what is shown as part/representation of that component
function ComponentOne() {
  return (
    <div className='FirstComponent'>First Component</div>
  )
}

export default App;
