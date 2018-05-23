<html>
<script type="text/javascript">
function validation() 
{
	var name=document.myform.username.value;  
	var email=document.myform.email.value;
	var mobilenumber=document.myform.mnumber.value;
	  
	  if (name==null || name==""){  
	  alert("Name can't be blank");  
	  return false;  
	}else if(email==null || email==""){  
	  alert("Email can't be blank");  
	  return false;  
	  }  
	else if(mobilenumber==null || mobilenumber=="")
	{
		alert("Mobile number can't be blank");  
		  return false;  
	}
	
}

</script>
<body >
${msg}
<div align="center">
<form  name="myform" action="index.jsp" method="post" onsubmit="return validation()">
<table border="1">
<tr>
<th><font color="red">Registration page</font></th>
</tr>
<tr>
<td>User Name<sup ><font color="red">*</font></sup>:
<input type="text" name="username" id="username" autocomplete="off" ></td>
</tr>
<tr>
<td>Email<sup ><font color="red">*</font></sup>:
<input type="text" name="email" id="email" autocomplete="off"></td>
</tr>
<tr>
<td>Mobile Number<sup ><font color="red">*</font></sup>:
<input type="text" name="mnumber" id="mnumber" autocomplete="off"></td>
</tr>
<tr>
<td align="center"><input type="submit" value="Save"></td>
</tr>
</table>
</form>
</div>
</body>
</html>
