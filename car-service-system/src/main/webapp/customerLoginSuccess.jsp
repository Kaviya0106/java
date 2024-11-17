<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    font-family: 'Times New Roman', Times, serif;
    background-color: rgb(126, 176, 223);
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    color: #333;
  }

  div {
    background-color: #ffffff;
    padding: 40px;
    border-radius: 10px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    text-align: center;
    width: 300px;
  }
  a {
    text-decoration: none;
    color: #0056b3;
    font-size: 16px;
    font-weight: bold;
    display: inline-block;
    margin: 15px 0;
    padding: 10px 25px;
    border: 2px solid #0056b3;
    border-radius: 30px;
    transition: background-color 0.3s ease, color 0.3s ease;
  }

  a:hover {
    background-color: #0056b3;
    color: #ffffff;
  }
</style>
</head>
<body>
<center>
<%
out.println("Dear"+session.getAttribute("sname")+",you hava successfully logged in");
%></br>
</br>

<div>
<a href="carDetails.html">enter your car details</a></br>
<a href="">edit your car details</a></br>
<a href="serviceRequest.html">request for service</a></br>
<a href="serviceStatus.html">check service status</a></br>
</div>
</center>
</body>
</html>