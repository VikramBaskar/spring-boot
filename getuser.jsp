
<html>
<head>
    <title>User Details</title>
</head>
<body>
    <h1>User Details</h1>

    <c:if test="${not empty error}">
        <div style="color: red;">${error}</div>
    </c:if>

    <c:if test="${not empty user}">
        <p>User ID: ${user.id}</p>
        <p>First Name: ${user.Fname}</p>
        <p>Last Name: ${user.Lname}</p>
        <p>Parent/Guardian: ${user.pname}</p>
        <p>Address: ${user.add1}</p>
    </c:if>
</body>
</html>
