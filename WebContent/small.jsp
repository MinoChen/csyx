<%@ page contentType="text/html;charset=gb2312" %>
<HTML>
<body bgcolor=pink>
<p>${guess }��С�ˣ����ٲ£�
   <form action="/csyx/MainServlet?method=resultMethod" method="post" name=form >
       <input type="text" name="guess" > 
       <input type="submit" value="�ͳ�" name="submit">
   </form>
</body>
</HTML>
