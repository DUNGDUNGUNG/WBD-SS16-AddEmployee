<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infor</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table>
    <tr>
        <td>Name :</td>
        <td>${requestScope['employee'].getName()}</td>
    </tr>
    <tr>
        <td>ID :</td>
        <td>${requestScope['employee'].getId()}</td>
    </tr>
    <tr>
        <td>Contact Number :</td>
        <td>${requestScope['employee'].getContactNumber()}</td>
    </tr>
</table>
</body>
</html>