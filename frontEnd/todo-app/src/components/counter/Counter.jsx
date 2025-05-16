export default function Counter() {

    function incrementCounter() {
        console.log("increment button clicked")
    }
    return (
        <div className="Counter">
            <span className="count">0</span>
            <button className="counterButton" onClick={incrementCounter}>increment</button>
        </div>
    )
}