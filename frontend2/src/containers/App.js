import React, {Component} from 'react';
import '../assets/css/App.css';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import Hello from '../componets/Hello'
import Login from './Login.js'
import Join from './Join.js'
import MyNavbar from '../componets/MyNavbar.jsx'


class App extends Component{

  constructor(props){
    super()
  }
  render(){
    return (
      <div className='wrapper'>
        <MyNavbar/>
        <Login/>
        <Join/>
        <Hello name='한제규'></Hello>
      </div>
    )
  }
}

export default App;
