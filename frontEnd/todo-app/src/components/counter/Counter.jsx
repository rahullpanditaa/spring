import './Counter.css'

export default function Counter() {

    function incrementCounter() {
        console.log("increment button clicked")
    }
    return (
        <div className="Counter">
            <span className="count">0</span>
            <div>
                <button className="counterButton" onClick={incrementCounter}>+1 </button>
            </div>
        </div>
    )
}