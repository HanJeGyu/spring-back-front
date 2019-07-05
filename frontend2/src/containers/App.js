import React, {Component} from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import Hello from '../componets/Hello.js'
import MyNavbar from '../componets/MyNavbar.jsx/index.js.js'


class App extends Component{

  constructor(props){
    super()
  }
  render(){
    return (
      <div className='wrapper'>
        <MyNavbar></MyNavbar>
        <Hello name='홍길동'></Hello>
      </div>
    )
  }
}

export default App;
