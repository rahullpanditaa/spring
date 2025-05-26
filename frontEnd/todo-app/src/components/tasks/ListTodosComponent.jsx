import { useEffect, useState } from "react"
import { DeleteTodoForUserWithGivenID, RetrieveAllTodosForUser } from "./api/TodoApiService"
import { useAuth } from "./security/AuthContext"

export default function ListTodosComponent() {

    const [todos, setTodos] = useState([]) // state that holds list of todos recieved from rest api; default empty
    const [message, setMessage] = useState(null)

    const authContext = useAuth()

    const username = authContext.username

    // tells react component needs to perform a certain activity after rendering jsx
    useEffect (() => RefreshTodos(), [])

    function RefreshTodos() {
        RetrieveAllTodosForUser(username).then(response => 
            {  setTodos(response.data)
            }).catch(error => console.log(error))

    }
    
    function DeleteTodo(id) {
        DeleteTodoForUserWithGivenID(username,id).then(
            () => {
                setMessage(`Deleted todo with id = ${id}`)
                RefreshTodos()
            }
        ).catch(error => console.log(error))
    }

    return (
        <div className="container ListTodosComponent">
            <h2>Your tasks</h2>
            {message && <div className="alert alert-warning">{message}</div>}
            <div>
                <table className="table">
                    <thead>
                        <tr>
                            <th>Description</th>
                            <th>Target Date</th>
                            <th>Completed</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {todos.map(todo => (
                            <tr key={todo.id}>
                                <td>{todo.description}</td>
                                <td>{todo.targetDate.toString()}</td>
                                <td>{todo.done ? "Yes" : "No"}</td>
                                <td><button className="btn btn-warning" onClick={() => DeleteTodo(todo.id)}>Delete</button></td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </div>
    )
}