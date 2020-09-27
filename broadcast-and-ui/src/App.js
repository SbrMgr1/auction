import React from 'react';
import './css/bootstrap.min.css';
import './font-awesome/css/font-awesome.min.css';
import UserLayout from './layouts/UserLayout';
import ParentComponent from './ParentComponent';
import { BrowserRouter as Router} from 'react-router-dom';

class App extends ParentComponent{
 render() {
  return (
  	<Router>
  		<UserLayout/>
    </Router>
  );
}
}

export default App;
