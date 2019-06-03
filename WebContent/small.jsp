<%@ page contentType="text/html;charset=gb2312" %>
<HTML>
<body bgcolor=pink>
<p>${guess }数小了，请再猜：
   <form action="/csyx/MainServlet?method=resultMethod" method="post" name=form >
       <input type="text" name="guess" > 
       <input type="submit" value="送出" name="submit">
   </form>
</body>
</HTML>
