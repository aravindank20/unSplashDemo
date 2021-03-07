<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Collections</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="container">
  <h2>Collections List</h2>
 <table class="styled-table">
    <thead>
        <tr>           
            <th>Collections</th>            
        </tr>
    </thead>
    <tbody>
    <c:forEach var="detailedRow" items="${collectionList}">
        <tr>           
            <td><img src="${detailedRow.collectionCoverPhoto.collectionUrl.collectionThumbUrl}">
            <p>${detailedRow.collectionTitle}</p></td>
        </tr>
     </c:forEach>        
    </tbody>
</table>
</div>
</body>
</html>