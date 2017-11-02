$(document).ready(function(){
	$('#result1').on("change","#ct",function(){
		var d=new Date();
		var cd=d.getFullYear()+'/'+(d.getMonth()+1)+'/'+d.getDate();
		$('#isd').val(cd);
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
	
	$('#btn').click(function(){
		$.getJSON("FetchVehicleAndCardDetailsJSON",{cid:$('#cn').val()
			,ajax:'true'},
			function(data){
				$.each(data,function(i,item){
					var htm='<table border=1><caption><h4>Owner Card Details</h4></caption>';
					htm+='<tr><td><b><i>Vehicle ID:</i></b></td><td><input type=text value='+item.VEHICLEID+' readonly=true></td><td><b><i>Vehicle Name:</i></b></td><td>'+item.VEHICLENAME+'</td></tr>';
					htm+='<tr><td><b><i>Registration No:</i></b></td><td>'+item.VEHICLEREGISTRATION+'</td><td><b><i>Owner Name:</i></b></td><td>'+item.VEHICLEOWNERNAME+'</td></tr>';
					htm+='<tr><td><b><i>Charge type:</i></b></td><td>'+item.CHARGETYPE+'</td><td><b><i>Issue Date:<br>Exipry Date:</i></b></td><td>'+item.ISSUEDATE+'<br>'+item.EXPDATE+'</td></tr>';
					htm+='<tr><td><b><i>Amount:</i></b></td><td>'+item.AMOUNT+'</td><td><b><i>Balance:</i></b></td><td>'+item.BALANCE+'</td></tr>';
					htm+='</table>';
					$('#result').html(htm);
					var b=parseInt(item.BALANCE);
					if(b<=0){
						var x='<input type=hidden value='+$('#cn').val()+' name=cn><table><caption><h4>Recharge Details</h4></caption>';
						x+='<tr><td><b><i>Charge Type:</i></b></td><td><select name=ct id=ct><option>-Select-</option><option value=\"Monthly\">Monthly</option><option value=\"Half Yearly\">Half Yearly</option><option value=\"Yearly\">Yearly</option></select></td></tr>';
						x+='<tr><td><b><i>Amount:</i></b></td><td><input type=text name=amt id=amt></td></tr>';
				        x+='<tr><td><b><i>Issue Date:</i></b></td><td><input type=text name=isd id=isd></td></tr>';
				        x+='<tr><td><b><i>Expiry Date:</i></b></td><td><input type=text name=expd id=expd></td></tr>';
				        x+='<tr><td><input type=submit></td></tr>';
				      $('#result1').html(x);
				      
					}
					else{
						$('#result1').html("<font size=5 color=red>No Need To The Recharge The Card....</font>");
					}
				});
				
			});
	});
});