 $(document).ready(
        function() {

        	 $.getJSON("FetchStatesJSON", function(json){
                 $('#state').empty();
                 $('#state').append($('<option>').text("Select"));
                 $.each(json, function(i, item){
                         $('#state').append($('<option>').text(item.STATENAME).attr('value', item.STATEID));
                 });
             });
        	 
       
 
 $("#state").change(function(){
 	$.getJSON("FetchAllCitiesByStateIdJSON",{sid:$('#state').val()}, function(json){
         $('#city').empty();
         $('#city').append($('<option>').text("Select"));
         $.each(json, function(i, item){
                 $('#city').append($('<option>').text(item.CITYNAME).attr('value',item.CITYID));
         });
     }); 
});
        });