export default function ListTodosComponent() {

    const todos = [
        {id : 1, description : "Build a full stack application", targetDate : new Date(), done : false},
        {id : 2, description : "Deploy full stack application", targetDate : new Date(), done : false}
    ]

    return (
        <div className="container ListTodosComponent">
            <h2>Your tasks</h2>
            <div>
                <table className="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Description</th>
                            <th>Target Date</th>
                            <th>Completed</th>
                        </tr>
                    </thead>
                    <tbody>
                        {todos.map(todo => (
                            <tr key={todo.id}>
                                <td>{todo.id}</td>
                                <td>{todo.description}</td>
                                <td>{todo.targetDate.toDateString()}</td> {/* return date as string value*/}
                                <td>{todo.done ? "Yes" : "No"}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </div>
    )
}