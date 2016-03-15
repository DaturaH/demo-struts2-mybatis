<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="global">
<s:actionmessage/>
<s:fielderror></s:fielderror>
<form action="loginAction.action"  method="post">
USERNAME:<input type="text" name="userInfo.username">
PASSWORD:<input type="password" name="userInfo.userpwd"><br>
<input type="submit"  value="LOGIN">
<input type="reset" value="reset"><br>
<a href="register.action">register</a><br>
<a href="modifyPwd.action">Change the password</a><br>
<a href ="deleteUser.action">Delete the User</a>
</form>
</div>
</body>
</html>