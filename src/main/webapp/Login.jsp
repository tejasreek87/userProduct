
<html>
<script type="text/javascript">
function validation() 
{
	var name=document.myform2.username.value;  
	
	var mobilenumber=document.myform2.mnumber.value;
	  
	  if (name==null || name==""){  
	  alert("Name can't be blank");  
	  return false;  
	
	  }  
	else if(mobilenumber==null || mobilenumber=="")
	{
		alert("Mobile number can't be blank");  
		  return false;  
	}
	
}

</script>
<body>
<form  name="myform2" action="login.jsp" method="post" onsubmit="return validation2()">
<h1>Login Page..</h1>
UserName:<input type="text" name="username" id="username"><br>
MobileNumber:<input type="text" name="mnumber" id="mnumber"><br>
<br><br>
<input type="submit" value="Login">
</form>
</body>
</html>