import axios from "axios";

const todoAppApiClient = axios.create (
    {
        baseURL : "http://localhost:8080"
    }
)

export function RetrieveAllTodosForUser(username) {
    return todoAppApiClient.get(`/users/${username}/todos`)
}