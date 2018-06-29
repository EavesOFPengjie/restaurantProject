<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/css/logincss.css" type="text/css" > 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆首页</title>
<link rel="stylesheet" href="https://jqueryvalidation.org/files/demo/site-demos.css">
 
 
</head>
<body>
 
           <div class="pageContainer" align="center" style=" width:400px;height:200px; background-color:#C0C0C0;margin:auto;" >
           <h5 align="center">登陆	</h5>
           <form id="myform" name="myform" action="/restaurantPro/login" method="POST" >
           
            <input type="text"   name="ename" placeholder="邮箱/用户名"/><br/>
            <br/>
           
            <input type="text" id="empno" name="empno" placeholder="密码"/><br/>
           
            <input type="text" class="left" id="password_again" name="password_again" placeholder="密码"/><br/>
            <br/>
            <input type="button" value="登陆" name="btn" onclick="sub();"/>  <input type="submit" value="Validate!">
            <input type="button" value="刷新"  onclick="refresh();"/>
           </form>
           </div>
            <p>敬语：${message} </p>
            <p>工号：${deptno}</p>
			<p>姓名:${ename}</p>
			<p>薪水:${sal}</p>
			
			
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
<script src="https://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>
<script>
// just for the demos, avoids form submit

$( "#myform" ).validate({
  rules: {
	  empno: "required",
    password_again: {
      equalTo: "#empno"
    }
  }
});

function sub() {
	var myform=window.document.getElementById("myform");
	if(myform.name.value=="")
	{
	  alert("姓名不能为空，请重新输入");
	  myform.action="";
	  myform.submit();
	 }else{
	  myform.submit();
	 }
	}
	
//这里是refresh方法
function refresh(){
    //刷新页面
    location.reload()

}
</script>
</body>
</html>