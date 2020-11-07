
<%
java.util.Calender c= java.util.Calender.getInstance();
String date= day+"-"+ month + "-" +year;
String time=hour+ " : "+minute + " :" +seconds +" " +ampn;

out.print(" date:"+date);
out.print("<br>");
out.print(" time:"+time);
%>
