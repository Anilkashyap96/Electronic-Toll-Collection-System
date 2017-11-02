$(document).ready(
        function() {
        	jQuery.validator.addMethod("lettersonly", function(value, element) {
        		  return this.optional(element) || /^[a-z A-Z]+/.test(value);
        		}, "Letters only please");
        	
        		jQuery.validator.addMethod("digitonly", function(value, element) {
        		  return this.optional(element) || /^[0-9]/.test(value);
        		}, "Digits only please"); 	
        	
        	
        });