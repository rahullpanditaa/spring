import { useState } from 'react'
import PropTypes from 'prop-types'
import './Counter.css'

export default function Counter({by}) {

    const [count, setCount] = useState(0) // returns the current state value and a function to change the state val

    function incrementCounter() {
        setCount(prevCount => prevCount + by)
    }

    function decrementCounter() {
        setCount(prevCount => (prevCount - by >= 0 ? prevCount - by : 0))
    }

    return (
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                <button className="incrementCounterButton commonButtonStyle" onClick={incrementCounter}>+{by}</button>
                <button className='decrementCounterButton commonButtonStyle' onClick={decrementCounter}>-{by}</button>
            </div>
        </div>
    )
}

Counter.propTypes = {
    by : PropTypes.number 

}