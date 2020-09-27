import React from 'react';
import ParentComponent from './../ParentComponent';

class Footer extends ParentComponent{
render(){
    return (<footer className="page-footer font-small blue pt-4 theme-footer">

    <div className="container-fluid text-center text-md-left">

        <div className="row">

            <div className="col-md-6 mt-md-0 mt-3">

                <h5 className="text-uppercase">
                    <span text="${#servletContext.getAttribute('appName')}"></span></h5>
                <p>Keep in touch</p>
                <p><i className="fa fa-facebook btn btn-sm btn-primary"></i>
                    <i className="fa fa-youtube btn btn-danger btn-sm"></i>
                    <i className="fa fa-twitter btn btn-info btn-sm"></i></p>
                            </div>
            
                    <hr className="clearfix w-100 d-md-none pb-3"/>

                    <div className="col-md-3 mb-md-0 mb-3">

                        <h5 className="text-uppercase">Quick Links</h5>
                                    <ul className="list-unstyled">
                            <li>
                                <a href="/">Home</a>
                            </li>
                            <li>
                                <a href="/page/about-us">About Us</a>
                            </li>
                            <li>
                                <a href="/page/terms-and-conditions">Terms and Conditions</a>
                            </li>
                            <li>
                                <a href="/page/faq">FAQ</a>
                            </li>
                            <li>
                                <a href="/page/privacy-policy">Privacy Policy</a>
                            </li>
                        </ul>
                    </div>
                <div className="col-md-3 mb-md-0 mb-3">

                <h5 className="text-uppercase">Links</h5>
                            <ul className="list-unstyled">
                    <li>
                        <a href="#!">Contact Us</a>
                    </li>
                    <li>
                        <a href="#!">Our Partners</a>
                    </li>
                </ul>
                        </div>
            
                </div>
        
        </div>
    

    <div className="footer-copyright text-center py-3">© 2020 Copyright:
        <a href="#"> <span>TechRiders</span></a>
    </div>
    

</footer>)
}
}

export default Footer;