import { useParams } from "react-router-dom"
import { RetrieveTodo } from "./api/TodoApiService"
import { useAuth } from "./security/AuthContext"
import { useEffect, useState } from "react"

export default function UpdateTodo() {

    const authContext = useAuth()
    const username = authContext.username
    const {id} = useParams()

    const [description, setDescription] = useState("")

    function retrieveTodo() {
        RetrieveTodo(username, id).then(response => setDescription(response.data.description)).catch(error => console.log(error))
    }

    useEffect(() => retrieveTodo(),[id])

    return (
        <div className="UpdateTodoComponent">
            <h1>Updating todo with id : {id}</h1>
            <div>description : {description}</div>
        </div>
    )
}