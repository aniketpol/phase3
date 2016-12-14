<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" errorPage="error.jsp"%>

<html>

<head>
          
     <style>
     body {
	margin: 0;
	padding: 0;
}
h1 {
	
	text-align : center;
	font-family: "SIMPSON";
}
form {
	    padding-top: 20%;
    padding-left: 7%;
}

#centerDiv{
    background-color : #D3D3D3;
    border: 1px solid black;
    font-size: 24px;
    margin-top: 10%;
    margin-right: 30%;
    margin-left: 30%;
    height: 50%;
    
	}

#call{

 font-size: 17px;
}
#titleBar{
     margin-left: 20%;
}

     </style>
        <title>Phase III </title>
    </head>
<body background="fizzbuzz.png">

<div id="centerDiv">
 <span id="titleBar">Phase-III PhoneBuzz with Delay</span>
<form action="/phase3/index" method="POST">
Please enter valid phone no with country code: <input type="text" name="phone_number" style="width: 100px;" maxLength="12" required>
<br>
Enter delay in seconds :<br><input type="number" name="delay" style="width: 100px;" required>
<input id ="call" type="submit" value="Call" />

</form>
</div>

</body>
</html>
