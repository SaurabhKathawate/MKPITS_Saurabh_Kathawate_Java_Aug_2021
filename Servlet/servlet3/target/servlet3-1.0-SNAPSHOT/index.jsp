<html>
<head>
    <title>Student Registration</title>
</head>
<body>
<h1>Student Registration</h1>
<br/>
<form action="saurabh">
    <table>
        <tr>
            <td>Full Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><input type="radio" name="gender" value="Male">Male</td>
            <td><input type="radio" name="gender" value="Female">Female</td>
        </tr>
        <tr>
            <td>Course</td>
            <td><input type="checkbox" name="course" value="C">C</td>
            <td><input type="checkbox" name="course" value="C++">C++</td>
            <td><input type="checkbox" name="course" value="Java">Java</td>
        </tr>
        <tr>
            <td>City</td>
            <td>
                <select name="city">
                    <option>select city</option>
                    <option>Nagpur</option>
                    <option>Nashik</option>
                </select>
            </td>
        <tr>
            <td>DOB</td>
            <td><input type="date" name="dob"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><textarea rows="5" cols="20" name="description"></textarea></td>
        </tr>
        <tr>
            <td><input type="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>