<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<body>

	<a href="${pageContext.request.contextPath}/hello/greeting/toGreet">to greeta</a>
</body>
</html>
<!-- <html>
<body>
<h2>Hello World!</h2>
<a href="/hello/greeting/toGreet">to greet</a>
</body>
</html>
 -->