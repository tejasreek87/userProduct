
<html>

<script type="text/javascript">
function validation1() 
{
	var producttype=document.myfrom1.ptype.value;  
	var productname=document.myfrom1.pname.value;
	
	  
	  if (producttype==null || producttype==""){  
	  alert("producttype can't be blank");  
	  return false;  
	}else if(productname==null || productname==""){  
	  alert("productname can't be blank");  
	  return false;  
	  }  
	
	
}
</script>
<body>
<form  name="myfrom1" action="product.jsp" method="post" onsubmit="return validation1()">
<table border="1">
<tr>
<th><font color="red">ProductDetails page</font></th>
</tr>
<tr>
<td>Product Type<sup ><font color="red">*</font></sup>:
<input type="text" name="ptype" id="ptype" autocomplete="off"></td>
</tr>
<tr>
<td>Product Name<sup ><font color="red">*</font></sup>:
<input type="text" name="pname" id="pname" autocomplete="off"></td>
</tr>
<tr>
<td align="center"><input type="submit" value="Save"></td>
</tr>
</table>
</form>
</body>
</html>