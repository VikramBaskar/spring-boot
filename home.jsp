<html>
<head>
    <title>Employee Form</title>
    <link rel="stylesheet" href="/css/index.css"> 
</head>
<body>
	<h1>Register Form For Employee </h1>
    <!-- Form for Adding User -->
    <form action="/addUser" method="POST">
        <label for="id">User ID :</label>
        <input type="text" name="id" id="id" placeholder="Enter The Id" /><br>

        <label for="fname">First Name :</label>
        <input type="text" name="fname" id="fname" placeholder="Enter First Name" /><br>  

        <label for="lname">Last Name :</label>
        <input type="text" name="lname" id="lname" placeholder="Enter Last Name" /><br>  

        <label for="pname">Parent/Guardian :</label>
        <input type="text" name="pname" id="pname" placeholder="Enter The Name" /><br>

        <label for="add1">Address :</label>
        <textarea name="add1" id="add1" placeholder="Enter Primary Address"></textarea><br>

        <button type="submit">Add User</button> <br>

        <!-- Correct Cancel Button -->
        <button type="button" onclick="window.location.href='/index';">Cancel</button><br>
    </form>

    <!-- Form for Displaying User Information -->
    <h2>Display User Information</h2>
    <form action="/getUser" method="GET">
        <label for="getId">Enter Your ID :</label>
        <input type="text" name="id" id="getId" placeholder="Enter your Id"/><br>
        <button type="submit">Submit</button> <br>
    </form>
</body>
</html>
