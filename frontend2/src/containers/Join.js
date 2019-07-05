import React, {Component} from 'react'
import {Form, Button} from 'react-bootstrap'

class Join extends Component{
    constructor(props){
        super(props)
        this.state = {
            customerId: '',
            password: '',
            customerName: '',
            phone: '',
            city: ''
        }
    }
    render(){
        return(
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
                    <Form.Group controlId="customerName">
                        <Form.Label>이름</Form.Label>
                        <Form.Control type="text" placeholder="Name" />
                    </Form.Group>
                    <Form.Group controlId="phone">
                        <Form.Label>휴대폰번호</Form.Label>
                        <Form.Control type="text" placeholder="010-0000-0000" />
                    </Form.Group>
                    <Form.Group controlId="city">
                        <Form.Label>주거도시</Form.Label>
                        <Form.Control type="text" placeholder="Seoul" />
                    </Form.Group>
                    <Button variant="info">가입하기</Button>
                    <Button variant="danger">취 소</Button>
                </Form>
            </div>
        )
    }
}

export default Join