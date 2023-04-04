

<%@page import="DAO.livreImp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="Modele.Livre"%>
<%@page import="Service.servicelivreIMP"%>
<%-- 
    Document   : index
    Created on : Feb 23, 2023, 4:24:11 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center> <p class="h1">Liste Livres</p></center>
    
    
        <div class="container"> 
                    
            <a href="form.jsp?form=add">Ajouter</a>
            
            <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Titre</th>
      <th scope="col">Auteur</th>
      <th scope="col">Nombre de page</th>
      <th scope="col">Prix</th>
    </tr>
  </thead>

  <tbody>
   
  <c:forEach var="livre" items="${livres}">
     <tr>
       
    <th scope="row"><c:out value="${livre.getNum_livre()}"/> </th>
      <td> <c:out value="${livre.getTitre()}"/> </td>
      <td> <c:out value="${livre.getAuteur()}"/> </td>
      <td>  <c:out value="${livre.getN_page()}"/> </td>
      <td>  <c:out value="${livre.getPrix()}"/>  </td>
      <td> <a href="traitement?action=delete&num_livre=${livre.getNum_livre()}" method="post"> Delete </a> </td>
      <td><a href="form.jsp?&num_livre=${livre.getNum_livre()}&form=edit"> Edit </a></td>
    
   </tr>
    </c:forEach> 
  </tbody>
</table></div>
    </body>
</html>
