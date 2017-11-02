$(document).ready(
        function() {
        	        	 $('#result').on("click",".vc",function() {
        	        	            	
        	        	 $.getJSON('VehicleDisplayByIdJSON', {
        	                 vid:$(this).attr("vid"),
        	                 ajax : 'true'
        	             }, function(data) {
        	            	 
        	            	 
        	            	 
        	            	 $.each(data, function(i, item) {
        	            		$('#vhid').val(item.VEHICLEID);
        	            		$('#vt').val(item.VEHICLETYPE);
        	            		$('#vr').val(item.VEHICLEREGISTRATION);
        	            		$('#vn').val(item.VEHICLENAME);
        	            		$('#vco').val(item.VEHICLECOLOR);
        	            		$('#von').val(item.VEHICLEOWNERNAME);
        	            		$('#va').val(item.ADDRESS);
        	            		$('#vs').val(item.STATE);
        	            		$('#vc').val(item.CITY);
        	            		$('#vfon').val(item.PHONE);
        	            		$('#vmob').val(item.MOBILE);
        	            		$('#vmail').val(item.EMAILID);
        	            		$('#vpic').attr('src','pic/'+item.PHOTOGRAPH); 	
            	            
        	            	 });
        	                       });
        	        	            });
                $.getJSON('VehicleDisplayJSON', {
                   
                    ajax : 'true'
                }, function(data) {
                    
                    var html = '<table border=1>';
                   // var len = data.length;
                    html+="<tr><th>Vehicle ID</th><th>Vehicle Name</th><th>Edit/Delete</th></tr>" ;
                    $.each(data, function(i, item) {
                    	html += '<tr><td>' + item.VEHICLEID + '</TD><TD>' + item.VEHICLENAME + '</TD><TD><a href=# class=vc where vid='+item.VEHICLEID+'>Edit/Delete</a></TD></TR>'; 
                      });
                                
                    
                    html += '</TABLE>';
   
                    $('#result').html(html);
                });
         
            
            
        });
       
   