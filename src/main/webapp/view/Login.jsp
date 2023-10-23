<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type = "module" src = "../js/signinModule.js"></script>
<link rel = "stylesheet" href = "../css/login.css">
</head>
<body>
	<div class = "container">
		<div class = "form-container">
			<h1>Sign in</h1>
			<form action = "../LoginServlet" method = "POST">
				<div class = "input-area">
					<input type = "text" name = "id" required autocomplete = "off" maxlength = 20 />
					<label for = "id">ID</label>
					<p id = "id-Message"></p>
				</div>
				<div class = "input-area">
					<input type = "password" name = "pw" required maxlength = 20/>
					<label for = "pw">Password</label>
					<p id = "pw-Message"></p>
				</div>
				
				<a href = #>아이디/비밀번호 찾기</a>
				
				<div class = "btn-area">
					<button id = "sign-in" type = "submit" disabled>Sign in</button>
				</div>
				
			</form>
		</div>
		
		<div class = "overlay-container">
			<h3>계정이 없으신가요?</h3>
			<div class = "btn-area">
				<button id = "sign-up" type = "button">Sign Up</button>
			</div>
		</div>
	</div>
</body>
</html>