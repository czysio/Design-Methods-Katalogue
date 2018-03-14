document.addEventListener("DOMContentLoaded", function() {

	var submit = document.querySelector(".btn btn-dark");
	
	submit.addEventListener("click", checkIfPasswordsAreTheSame(event) {
		
		if(!$(("#password").val()).equals($("#passwordcheck").val())) {
			$("#passwordcheck").append("<p style='color: red'>Podane hasła nie są identyczne<p>");
			event.preventDefault()
		} 
		
	});
	
});







  	