<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="order">
        <header align="center" style="color: red;">BOBBYS FRIED CHICKEN</header>
        <header align="center" style="color: red;">menu</header>
        <div>
        <h1>CRISPY LEGS</h1>
        <img src="cryspylegpc.jpg" height="100" width="100">
        <h2 style="color: red;">2pc rs.140</h2>
        quantity
        <select value="0" name="legsqty" style="color:blue">
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select>
    </div>
    <div>
        <h1>CHICKEN WINGS</h1>
        <img src="chickenwings.jpg"  alt=" " height="100" width="100">
        <h2 style="color: red;">4pc rs.99</h2>
        quantity
        <select value="0" name="wingsqty" style="color: blue;">
            <option value="0">0</option> 
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select>
    </div>
    <div>
        <h1>CHICKEN STRIPS</h1>
        <img src="chickenrips.jpg" height="100" width="100">
        <h2 style="color: red;">4pc rs.120</h2>
        quantity
        <select value="0" name="stripsqty" style="color: blue;">
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select>
    </div>
    <div>
        <h1>CHICKEN POPCORN</h1>
        <img src="chickenpopcorn.jpeg" height="100" width="100">
        <h2 style="color: red;">4pc rs.100</h2>
        quantity
        <select value="0" name="popcornqty" style="color: blue;">
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select>
    </div>
    <br/><br/>
    <button type="submit" align="center" style="color:blue;background-color: violet;"><h1>Enter</h1></button>
</form>
</body>
</html>