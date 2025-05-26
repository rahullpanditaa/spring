import { useParams } from "react-router-dom"
import { RetrieveTodo } from "./api/TodoApiService"
import { useAuth } from "./security/AuthContext"
import { useEffect, useState } from "react"
import { Field, Form, Formik } from "formik"

export default function UpdateTodo() {

    const authContext = useAuth()
    const username = authContext.username
    const {id} = useParams()

    const [description, setDescription] = useState("")
    const [targetDate, setTargetDate] = useState("")

    function retrieveTodo() {
        RetrieveTodo(username, id).
        then(response => {setDescription(response.data.description)
                          setTargetDate(response.data.targetDate)
        }).catch(error => console.log(error))
    }

    function onSubmit(values) {
        console.log(values)
    }

    useEffect(() => retrieveTodo(),[id])

    return (
        <div className="UpdateTodoComponent">
            <h1>Updating todo with id : {id}</h1>
            {/* <div>description : {description}</div> */}
            <div>
                <Formik initialValues={{description, targetDate}} enableReinitialize={true}>
                    {(props) => (
                        <div>
                            <Form>
                                <div className="col-md-6 offset-md-3">
                                <fieldset className="form-group">
                                    <label>Description</label>
                                    <Field type="text" className="form-control" name="description"/>
                                    
                                </fieldset>
                                <fieldset className="form-group">
                                    <label>Target Date</label>
                                    <Field type="date" name="targetDate" className="form-control"/>
                                    
                                </fieldset>
                                </div>
                                <div>
                                    <button className="btn btn-success m-5" type="submit" onClick={onSubmit}>Save</button>
                                </div>
                            </Form>
                        </div>
                    )}
                </Formik>
            </div>
        </div>
    )
}