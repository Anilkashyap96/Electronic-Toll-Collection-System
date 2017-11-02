$(document).ready(
        function() {
        	$("#myform").validate({
        		 rules:{
        			
        		   en:{required:true,lettersonly:true },
        		   emob:{required:true,minlength:10,maxlength:10,digitonly:true}
        		 },
        		 messages:{
        		   en:{required: "Please provide User Name"},	   
        		   emob:{
        		           required: "Please provide Mobile No",
        		           minlength: "Your mobile must be at least 10 Digit long"
        		   }},submitHandler: function(form) {
        		                    form.submit();
        		                }

        		 });
        	
        	
        });