<%-- 
    Document   : registerForm
    Created on : Mar 28, 2023, 12:46:16 PM
    Author     : hp
--%>

<%@page import="Modele.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    user u=new user();
    String action="adduser"; 
   %>     
         <div class="container">
             <h1>Register</h1>
             <form action="login?action=<%=action%>" method="post">
                 <div class="form-group">
                   <label >Nom</label>
                   <input value="<%=u.getNom()%>" name="nom" type="text" class="form-control" >
                 </div>
                  <div class="form-group">
                   <label >Email</label>
                   <input value="<%=u.getEmail()%>" name="email" type="email" class="form-control" >
                 </div>
                 <div class="form-group">
                   <label >Password</label>
                   <input value="<%=u.getPassword()%>" name="password" type="password" class="form-control" >
                 </div>
                
               </fieldset>
                  <button class="btn btn-primary" type="submit">Valide</button>
             </form>
         </div>
    </body>
</html>
