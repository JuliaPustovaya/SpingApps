<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>JOBS</title>

    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>

</head>


<body>
<h2>List of jobs</h2>
<table>
    <tr>
        <td>Company name</td><td>Company adress</td>
    </tr>
    <c:forEach items="${jobs}" var="jobs">
        <tr>
            <td>${jobs.nameOfCompany}</td>
            <td>${jobs.adressOfCompany}</td>

        </tr>
    </c:forEach>
</table>
<br/>
</body>
</html>