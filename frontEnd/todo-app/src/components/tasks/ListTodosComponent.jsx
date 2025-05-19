export default function ListTodosComponent() {

    const todos = [
        {id : 1, description : "Build a full stack application"},
        {id : 2, description : "Deploy full stack application"}
    ]

    return (
        <div className="ListTodosComponent">
            <h2>Your tasks</h2>
            <div>
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Description</th>
                        </tr>
                    </thead>
                    <tbody>
                        {todos.map(todo => (
                            <tr key={todo.id}>
                                <td>{todo.id}</td>
                                <tr>{todo.description}</tr>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </div>
    )
}