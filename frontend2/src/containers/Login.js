import React, {Component} from 'react'
import {Form, Button} from 'react-bootstrap'

class Login extends Component{
    constructor(props){
        super(props)
        this.state = {
            customerId: '',
            password: ''
        }
    }
    render(){
        return (
            <div>
                <Form onSubmit="{this.handleSubmit}">
                    <Form.Group controlId="customerId">
                        <Form.Label>아이디</Form.Label>
                        <Form.Control type="text" placeholder="ID" />
                    </Form.Group>
                    <Form.Group controlId="password">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>
                    <Button variant="info">전 송</Button>
                    <Button variant="danger">취 소</Button>
                </Form>
            </div>
        )
    }
}

export default Login