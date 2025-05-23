import axios from "axios";

const apiClient = axios.create (
    {
        baseURL : 'http://localhost:8080'
    }
)

export function GetHelloWorldApiResponse() {
    apiClient.get('/hello-world')
}