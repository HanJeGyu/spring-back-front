import React, {Component} from 'react'
import {Figure, Table} from 'react-bootstrap'
import pic from '../assets/images/cris.png'

class Mypage extends Component{

    render(){
        return (
            <div>
                <Figure>
                    <Figure.Image
                        width={171}
                        height={180}
                        alt="171x180"
                        src={pic}
                    />
                    <Figure.Caption>
                        Nulla vitae elit libero, a pharetra augue mollis interdum.
                    </Figure.Caption>
                </Figure>
                <Table striped bordered hover>
                    <tbody>
                    <tr>
                        <td rowSpan='2' colSpan='2'>사진</td>
                        <td>ID</td>
                        <td>이름</td>
                    </tr>
                    <tr>
                        <td>han</td>
                        <td>hans</td>
                    </tr>
                    <tr>
                        <td colSpan='2'>전화번호</td>
                        <td colSpan='2'>010-1234-5678</td>
                    </tr>
                    <tr>
                        <td colSpan='2'>주소</td>
                        <td colSpan='2'>seoul</td>
                    </tr>
                    </tbody>
                </Table>
            </div>
        )
    }
}

export default Mypage