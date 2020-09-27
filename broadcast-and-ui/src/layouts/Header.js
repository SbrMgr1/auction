import React from 'react';
import ParentComponent from './../ParentComponent';

class Header extends ParentComponent{
		  constructor(props) {
		    super(props);
		    this.state = {hidden_gp: "btn-group"};
		  }
		handleClick = ()=>{
			if(this.state.hidden_gp == "btn-group"){
					this.setState({
						hidden_gp: "btn-group open"
					});
			}else{
					this.setState({
						hidden_gp: "btn-group"
					});
			}
			
		}
		render() {
				return (
				<nav className="navbar navbar-default navbar-fixed-top">
				    <div className="">
				        <div className="container theme-header-top">
				            <div className="col-sm-2 col-sm-text-center"><a href="/"><img src={process.env.PUBLIC_URL + '/images/logo.png'}/></a></div>
				            <div className="col-sm-9">
				                <form action="/" className="set-at-middle">
				                    <div className="input-group">
				                        <div className="input-group-btn">
				                            <div className={this.state.hidden_gp}>
				                                <button className="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown" onClick={(e)=>this.handleClick(e)}>
				                                    <span >Search Options</span> <span
				                                        className="caret"></span>
				                                </button>
				                                <ul className="dropdown-menu criteria" role="menu">
				                                    <li>
				                                        <label><input type="radio" name="priceSort" value="asc"/> <span >Price Low To High</span> </label>
				                                    </li>
				                                    <li>
				                                        <label><input type="radio" name="priceSort" value="desc"/> <span >Price High To Low</span></label>
				                                    </li>
				                                </ul>
				                            </div>
				                        </div>
				                        <input type="text" name="param" className="form-control" placeholder="Search By Name"/>
				                        <span className="input-group-addon theme-input-group-addon">
				                            <button type="submit">
				                                <i className="glyphicon glyphicon-search"></i>
				                            </button>
				                        </span>
				                    </div>
				                </form>
				            </div>
				            <div className="col-sm-1">
				                <div className="item-indicate set-at-middle">
				                    <a href="@{/account/cart-details}"><span className="glyphicon glyphicon-shopping-cart"></span>
				                        <span className="item-count" text="${(session.cart_item != null)?session.cart_item.size():0}">0</span>
				                    </a>
				                </div>
				            </div>
				        </div>
				        <div className="container-fluid theme-header-top-second">
				            <div className="container">
				                <div className="row">
				                    <div className="navbar-header">
				                        <button type="button" className="navbar-toggle collapsed" data-toggle="collapse"
				                                data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				                            <span className="sr-only">Toggle navigation</span>
				                            <span className="icon-bar"></span>
				                            <span className="icon-bar"></span>
				                            <span className="icon-bar"></span>
				                        </button>
				                        <a className="navbar-brand active" href="/"><span className="fa fa-home"></span> <span >Home</span> </a>
				                    </div>
				                    <div className="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				                        <ul className="nav navbar-nav">
				                            <li><a href="/page/about-us"><span className="fa fa-info-circle"></span> <span>About Us</span></a></li>
				                        </ul>
				                        <ul className="nav navbar-nav navbar-right" authorize="isAuthenticated()">
				                            <li className="dropdown">
				                                <a href="#" className="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
				                                    <span authentication="name">John</span>
				                                    <span className="caret"></span>
				                                </a>
				                                <ul className="dropdown-menu">
				                                    <li><a href="#" href="@{/account/favourite-addr}">Favourite Address</a></li>
				                                    <li><a href="#" href="@{/account/order-history}">Order History</a></li>
				                                    <li><a href="#" href="@{/logout}">SignOut</a></li>
				                                </ul>
				                            </li>
				                        </ul>
				                        <ul authorize="!isAuthenticated()" className="nav navbar-nav navbar-right">
				                            <li>
				                                <a href="/login" href="@{/signin}"><span className="fa fa-sign-in"></span> <span>Sign in</span></a>
				                            </li>
				                            <li className="dropdown">
				                                <a href="#" href="@{/signup}">
				                                    <span className="fa fa-user"></span> <span >Signup</span>
				                                </a>
				                            </li>
				                        </ul>
				                    </div>
				                </div>
				            </div>
				        </div>
				    </div>
				</nav>
				)
		}
}export default Header;