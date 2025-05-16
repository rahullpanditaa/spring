import { useState } from 'react'
import './Counter.css'

export default function Counter() {

    const [count, setCount] = useState(0) // returns the current state value and a function to change the state val

    function incrementCounter() {
        setCount(count + 1)
        // console.log(count, setCount);
        
        // console.log("increment button clicked")
    }
    return (
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                <button className="counterButton" onClick={incrementCounter}>+1 </button>
            </div>
        </div>
    )
}