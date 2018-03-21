//$(function() {
//	let submit = $(".btn btn-dark");
	$(".btn btn-dark").click(function(event) {		
		if(!$(("#password").val()) === $("#passwordcheck").val()) {
			$("#passwordcheck").append("<p style='color: red'>Podane hasła nie są identyczne<p>");
			event.preventDefault()
		} 
	});
});







  	