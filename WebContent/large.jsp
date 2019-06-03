<%@ page contentType="text/html;charset=gb2312" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
<body bgcolor=yellow>
<p>${guess }数大了，请再猜：
   <form action="/csyx/MainServlet?method=resultMethod" method="post" name=form >
       <input type="text" name="guess" > 
       <input type="submit" value="送出" name="submit">
   </form>
</body>
</HTML>
