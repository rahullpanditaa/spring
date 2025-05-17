import { useState } from 'react'
import PropTypes, { func } from 'prop-types'
import './Counter.css'

export default function Counter() {
    const [count, setCount] = useState(0) 

    function incrementCounter(by) {
        console.log("parent method called")
        setCount(prevCount => prevCount + by)
    }

    function decrementCounter(by) {
        console.log("parent method called")
        setCount(prevCount => (prevCount - by >=0 ? prevCount - by : 0))
    }

    return (
        <div>
            <span className="totalCount">{count}</span> {/*this state needs to be common for all counter buttons */}
            <CounterButton increment={incrementCounter} decrement={decrementCounter}></CounterButton>
            <CounterButton by={3} increment={incrementCounter} decrement={decrementCounter}></CounterButton>
            <CounterButton by={5} increment={incrementCounter} decrement={decrementCounter}></CounterButton>
        </div>
    )
}

function CounterButton({by = 1}) {

    const [count, setCount] = useState(0) // returns the current state value and a function to change the state val

    function incrementCounter() {
        setCount(prevCount => prevCount + by)
    }

    function decrementCounter() {
        setCount(prevCount => (prevCount - by >= 0 ? prevCount - by : 0))
    }

    return (
        <div className="Counter">            
            <div>
                <button className="incrementCounterButton commonButtonStyle" onClick={incrementCounter}>+{by}</button>
                <button className='decrementCounterButton commonButtonStyle' onClick={decrementCounter}>-{by}</button>
            </div>
        </div>
    )
}

CounterButton.propTypes = {
    by : PropTypes.number 
}

// Counter.defaultProps = {
//     by : 1
// }