import React from 'react';
import ParentComponent from './../ParentComponent';
import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';

import Header from './../layouts/Header';
import Home from './../UserComponents/Home';
import Footer from './../layouts/Footer';
import './../css/style.css';


class UserLayout extends ParentComponent{
render() {
  return (
    <div className="UserLayout">
    <Header/>
    <div className="container" style={{marginTop:"146px"}}>
    	<Switch>
			<Route path='/' component={Home} />
		</Switch>
    </div>
    <Footer/>
    </div>
  );
}
}

export default UserLayout;