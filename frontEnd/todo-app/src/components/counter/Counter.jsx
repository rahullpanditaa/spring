import { useState } from 'react'
import './Counter.css'
import { CounterButton } from './CounterButton'

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

    function reset() {
        setCount(0)
    }

    return (
        <div>
            <span className="totalCount">{count}</span> {/*this state needs to be common for all counter buttons */}
            <CounterButton increment={incrementCounter} decrement={decrementCounter}></CounterButton>
            <CounterButton by={3} increment={incrementCounter} decrement={decrementCounter}></CounterButton>
            <CounterButton by={5} increment={incrementCounter} decrement={decrementCounter}></CounterButton>
            <button onClick={reset} className='resetButton'>Reset</button>
        </div>
    )
}


