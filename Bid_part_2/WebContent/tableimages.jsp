<table width="600px">
<%
int cnt=1;
for(int i=1;i<=3;i++){ //for row
out.print("<tr>");
for(int j=1;j<=3;j++){//for columns
%>

   <td>
<img src="images/<%=cnt++ %>.jpg" width="200px" height="200px"/>
</td>
<%
}
out.print("</tr>");//one row completed
}
%>
</table>