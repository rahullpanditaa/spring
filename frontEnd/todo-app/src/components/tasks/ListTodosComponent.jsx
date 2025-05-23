import { useEffect, useState } from "react"
import { RetrieveAllTodosForUser } from "./api/TodoApiService"

export default function ListTodosComponent() {

    const [todos, setTodos] = useState([]) // state that holds list of todos recieved from rest api; default empty

    // tells react component needs to perform a certain activity after rendering jsx
    useEffect (
        () => RefreshTodos()
    )

    function RefreshTodos() {
        RetrieveAllTodosForUser("rahul").then(response => console.log(response)).catch(error => console.log(error))

    }

    

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