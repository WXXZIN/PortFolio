function performLogin() {
    $("#login").click(function(e) {
        e.preventDefault();
        var id = $("input[name='id']").val();
        var pw = $("input[name='pw']").val();

        $.post("../Login", { id: id, pw: pw }, function(response) {
		    if (response.success) {
		        alert("Login successful!");
		    } else {
		        alert("Login failed. Please check your credentials.");
		    }
		}, 'json');
    });
}

export { performLogin };