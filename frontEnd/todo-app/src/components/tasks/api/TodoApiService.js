import axios from "axios";

const todoAppApiClient = axios.create (
    {
        baseURL : "http://localhost:8080"
    }
)

export function RetrieveAllTodosForUser(username) {
    return todoAppApiClient.get(`/users/${username}/todos`)
}

export function DeleteTodoForUserWithGivenID(username, id) {
    // sending a DELETE request 
    return todoAppApiClient.delete(`/users/${username}/todos/${id}`)
}

export function RetrieveTodo(username, id) {
    return todoAppApiClient.get(`/users/${username}/todos/${id}`)

}