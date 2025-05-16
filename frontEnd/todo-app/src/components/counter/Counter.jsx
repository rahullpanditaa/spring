import { useState } from 'react'
import './Counter.css'

export default function Counter() {

    const [count, setCount] = useState(0) // returns the current state value and a function to change the state val

    function incrementCounter() {
        setCount(count + 1)
    }

    function decrementCounter() {
        setCount(count - 1)
    }

    return (
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                <button className="incrementCounterButton commonButtonStyle" onClick={incrementCounter}>+1</button>
                <button className='decrementCounterButton commonButtonStyle' onClick={decrementCounter}>-1</button>
            </div>
        </div>
    )
}