<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Profile</title>
</head>
<body>
    <form action="processForm">
        <label for="firstName">First Name:</label>
        <input id="firstName" name="firstName" type="text"><br>

        <label for="lastName">Last Name:</label>
        <input id="lastName" name="lastName" type="text"><br>

        <label for="username">Username:</label>
        <input id="username" name="username" type="text"><br>

        <label for="avatar">Avatar:</label>
        <input id="avatar" name="avatar" type="text"><br>
        *Please type cat, deer, monkey, or raccoon for avatar<br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
