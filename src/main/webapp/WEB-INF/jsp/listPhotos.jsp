<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Photos</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="container">
  <h2>Photos List</h2>
 <table class="styled-table">
    <thead>
        <tr>
            <th>Select To Add</th>
            <th>Image</th>
            <!--  <th>Photo Description</th>-->       
        </tr>
    </thead>
    <tbody>
    <c:forEach var="detailedRow" items="${photoList}">
        <tr>
            <td><input type="radio" name="photoid" value="${detailedRow.photoId}"></td>
            <td><img src="${detailedRow.photoUrls.photoThumbUrl}">
            <p>${detailedRow.photoAltDesc}</p></td>
        </tr>
     </c:forEach>       
    </tbody>
</table>
</div>
</body>
</html>