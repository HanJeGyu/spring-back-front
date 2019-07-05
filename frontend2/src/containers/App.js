import React, {Component} from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom"
import '../assets/css/App.css';
import Home from './Home.js'
import Hello from '../componets/Hello'
import Login from './Login.js'
import Join from './Join.js'
import Mypage from './Mypage.js'
import MyNavbar from '../componets/MyNavbar.jsx'


class App extends Component{

  constructor(props){
    super()
  }
  render(){
    return (
      <div className='wrapper'>
        <Router>
        <MyNavbar/>

        <Route path="/home" exact component={Home} />
        <Route path="/login" exact component={Login} />
        <Route path="/join" exact component={Join} />
        <Route path="/mypage" exact component={Mypage} />
        </Router>
      </div>
    )
  }
}

export default App;
