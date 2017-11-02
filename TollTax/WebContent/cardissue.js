$(document).ready(
		function(){
			var d=new Date();
			var cd=d.getFullYear()+'/'+(d.getMonth()+1)+'/'+d.getDate();
			$('#isd').val(cd);
			$('#ct').change(function(){
				var c=$('#ct').val();
				var exp=new Date();
				if(c=="Monthly"){
					$('#amt').val('200');
					exp.setMonth(exp.getMonth()+1);
				}
				else if(c=="Half Yearly"){
					var a=200*6;
					$('#amt').val(a);
					exp.setMonth(exp.getMonth()+6);
				}
				else if(c=="Yearly"){
					var a=200*12;
					$('#amt').val(a);
					exp.setMonth(exp.getMonth()+12);
				}
				var e=exp.getFullYear()+'/'+(exp.getMonth()+1)+'/'+exp.getDate();
				$('#expd').val(e);
			});
			
			$.getJSON('VehicleDisplayJSON',{
				ajax:'true'
			},function(data){
				$("#vidc").empty();
				$("#vidc").append($('<option>').text('-Select-'));
				$.each(data,function(i,item){
					$("#vidc").append($('<option>').text('['+item.VEHICLEID+']'+item.VEHICLEOWNERNAME).attr('value',item.VEHICLEID));
				});
			});
	
});