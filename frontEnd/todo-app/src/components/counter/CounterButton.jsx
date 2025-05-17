import PropTypes from 'prop-types';

export function CounterButton({ by = 1, increment, decrement }) {

    return (
        <div className="CounterButton">
            <div>
                <button className="incrementCounterButton commonButtonStyle" onClick={() => increment(by)}>+{by}</button>
                <button className='decrementCounterButton commonButtonStyle' onClick={() => decrement(by)}>-{by}</button>
            </div>
        </div>
    );
}
CounterButton.propTypes = {
    by: PropTypes.number
};
