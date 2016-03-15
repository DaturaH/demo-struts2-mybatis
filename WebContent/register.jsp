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
<form action="registerAction.action"  method="post">
<h4>user register</h4>
USERID:&nbsp;&nbsp;<input type="text" name="userInfo.userid"><br>
USERNAME:&nbsp;&nbsp;<input type="text" name="userInfo.username"><br>
PASSWORD:&nbsp;&nbsp;<input type="password" name="userInfo.userpwd"><br>
USERSTATUS:<input type="text" name = "userInfo.userStatus"><br>
        <input type="hidden" name ="userInfo.userTime">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit"  value="GO">

<s:fielderror></s:fielderror>
</form>
</div>
</body>
</html>