<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h1>Registration form</h1>
<html:form action="reg" method="post" >

	<table>
		<tr><td>ID:</td>
			<td><html:text property="id"/></td><td><html:errors property="id_e"/></td></tr>
		<tr><td>NAME:</td>
			<td><html:text property="name"/></td><td><html:errors property="name_e"/></td></tr>
		<tr><td>EMAIL:</td>
			<td><html:text property="email"/></td><td><html:errors property="email_e"/></td></tr>
		<tr><td>ADDRESS:</td>
			<td><html:textarea property="address"/></td><td><html:errors property="address_e"/></td></tr>
		<tr><td>GENDER: MALE</td>
			<td><html:radio property="gender" value="Male"/></td><td><html:errors property="gender_e"/></td></tr>
		<tr><td>GENDER: FEMALE</td>
			<td><html:radio property="gender" value="Female"/></td><td></td></tr>
		<tr><td>HOBIES:</td>
			<td><html:checkbox property="hobies" value="hoby1"/>WATCHING FOOTBALL</td><td><html:errors property="hobies_e"/></td></tr>
		<tr>
			<td></td>
			<td><html:checkbox property="hobies" value="hoby2"/>READING BOOKS</td><td></td></tr>
		<tr><td></td>
			<td><html:submit value="Register"/></td></tr>
		<tr>
		
	</table>
	

</html:form>