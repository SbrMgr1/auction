import React from 'react';

class ParentComponent extends React.Component{
	userServiceHost = "http://localhost:3000/";
	productServiceHost = "http://localhost:3000/";
	auctionServiceHost = "http://localhost:3000/";
	orderServiceHost = "http://localhost:3000/";
	systemSettingServiceHost = "http://localhost:3000/";

    userServiceApi = ()=>{

    }
    productServiceApi = ()=>{

    }
    auctionServiceApi = ()=>{

    }
    orderServiceApi = ()=>{

    }
    systemSettingServiceApi = ()=>{

    }

    getUserInfo = ()=>{
    		return {
    			userToken:""
    		};
    }

    request(params){

    		var ajaxParms = {};
    		if (typeof (params) === 'undefined') {
                alert('Empty parameter found.');
                return;

            }
            if (typeof (params.url) === 'undefined') {
                    alert('Api url is missing');
                    return;
            }
            var method = 'POST';
            if (typeof (params.type) !== 'undefined') {
                method = params.type;
            }

            var headers = {};
            if(typeof(params.auth) == 'undefined'){
                headers = {
                    'Authorization':'Bearer '+this.getUserInfo().userToken
                };
            }else if(params.auth == true){
                headers = {
                    'Authorization':'Bearer '+this.getUserInfo().userToken
                };
            }
            var data = {};
            if(typeof(params.withData) != 'undefined'){
                if(params.withData == 'json'){

                    data = JSON.stringify(params.data);
                    headers['Content-Type'] = 'application/json';
                }else{

                    data = params.data;
                }
            }else{//default is form data

                data = params.data;
            }

            // ajaxParms['xhr'] = function () {
            //     var myXhr = window.$.ajaxSettings.xhr();
            //     if (typeof(params.uploadProgress) == 'function') {
            //         if (myXhr.upload) {
            //             myXhr.upload.addEventListener('progress', function (e) {
            //                 var uploaded = e.loaded;
            //                 var total_size = e.total;
            //                 var percentage = (uploaded / total_size) * 100;
            //                 if (percentage > 100) {
            //                     percentage = 100;
            //                 }
            //                 var return_datas = {
            //                     uploaded: uploaded,
            //                     total_size: total_size,
            //                     uploading_percent: percentage,
            //                 };
            //                 params.uploadProgress(return_datas);
            //             }, false);
            //         }
            //     }
            //     return myXhr;
            // };

	        if (typeof(params.beforeSend) == 'function') {
	                    params.beforeSend();
	        }
		    fetch(params.url,{
		    	method:method,
		    	body:data,
		    	headers:headers
		    }).then(res => res.json())
	      .then((result) => {
	        	if (typeof(params.success) == 'function') {
	                    params.success(result);
	        	}
	        },
	        (error) => {

	        }
	      );
	  }
    

}

export default ParentComponent;