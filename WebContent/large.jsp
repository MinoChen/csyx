<%@ page contentType="text/html;charset=gb2312" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
<body bgcolor=yellow>
<p>${guess }�����ˣ����ٲ£�
   <form action="/csyx/MainServlet?method=resultMethod" method="post" name=form >
       <input type="text" name="guess" > 
       <input type="submit" value="�ͳ�" name="submit">
   </form>
</body>
</HTML>
