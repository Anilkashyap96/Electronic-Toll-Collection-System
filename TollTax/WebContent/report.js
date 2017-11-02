$(document).ready(function(){
	$('#btn1').click(function(){
	$.getJSON("RechargeReportJSON",{cid:$('#cn1').val(),
			     ajax:true},
			function(data){
			    	 var htm="<html>";
			    	 htm+="<table width=70% border=1 align=center>";
					 htm+="<tr><th>Transaction Id</th><th>Card Id</th><th>Recharge Date</th><th>Amount</th></tr>";
					
				$.each(data,function(i,item){
					 htm+="<tr align=center><td>"+item.TRANSACTIONID+"</td><td>"+item.CARDID+"</td><td>"+item.RECHARGEDATE+"</td><td>"+item.AMOUNT+"</td></tr>";			
					 
				});
				htm+="</table></html>";
				$('#result').html(htm);
			});
	});
});