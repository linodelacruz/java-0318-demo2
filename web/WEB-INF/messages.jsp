<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${applicationScope.message}</h1>
        <h1>${requestScope.message}</h1>
        <h1>${sessionScope.message}</h1>     
    </body>
</html>
