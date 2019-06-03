<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
<body>
<h2>猜数游戏</h2>
<p>随机分给了一个1到100之间的数，请进行猜测！
<c:import var="data" url="/MainServlet?method=indexMethod" />
<br>输入猜测:
   <form action="/csyx/MainServlet?method=resultMethod" method="post" name=form>
       <input type="text" name="guess" > 
       <input type="submit" value="确认" name="submit">
   </form>
</body>
</HTML>
