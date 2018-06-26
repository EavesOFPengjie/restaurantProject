<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<link rel="stylesheet" href="/css/logincss.css" type="text/css" > 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆首页</title>
</head>
<body>
           
           <div class="pageContainer" align="center" style=" width:400px;height:200px; background-color:#C0C0C0;margin:auto;" >
           <h5 align="center">登陆	</h5>
           <form action="/restaurantPro/login" method="POST">
            <input type="text" name="ename" placeholder="邮箱/用户名"/><br/>
            <br/>
            <input type="text" name="empno" placeholder="密码"/><br/>
            <br/>
            <input type="submit" value="登陆"/>
           </form>
           </div>
            <p>敬语：${message} </p>
            <p>工号：${deptno}</p>
			<p>姓名:${ename}</p>
			<p>薪水:${sal}</p>
</body>
</html>