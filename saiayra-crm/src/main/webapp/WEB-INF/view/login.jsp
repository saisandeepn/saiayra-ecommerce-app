<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Static content -->
<link href="css/style.css" rel="stylesheet">
<script type="text/javascript" src="js/int.js"></script>
<title>Sai Ayra CRM - Spring Boot Web MVC Application</title>
</head>
<body>
	<h1>Sai Ayra CRM - Spring Boot Web MVC Application</h1>
	<hr>
	<div class="form">
		<form action="welcome" method="post" onsubmit="return validate()">
			<table>
				<tr>
					<td>Please specify Your name</td>
					<td><input id="name" name="name"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit"></td>
					<td></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>