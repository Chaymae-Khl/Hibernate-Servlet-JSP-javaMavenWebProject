<%-- 
    Document   : form
    Created on : Feb 23, 2023, 5:23:24 PM
    Author     : hp
--%>

<%@page import="Modele.Livre"%>
<%@page import="Service.servicelivreIMP"%>
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
   Livre livre;
   livre=new Livre();
   servicelivreIMP service=new servicelivreIMP();   
   String form=request.getParameter("form");
    String action="add";
    String titre="d'ajout";
   if(form.equals("edit")){
    livre=service.get(Integer.valueOf(request.getParameter("num_livre")));
    action="update";
    titre="de modification";
       }
       else{
   livre.setTitre("");}
   %>     
   
   <div class="container">
             <h1>Formulaire <%=titre%></h1>
             <form action="traitement?action=<%=action%>" method="post">
               <fieldset>
                   <div class="form-group">
                <input value="<%=livre.getNum_livre()%>"type="hidden" name="num_livre" >
                   </div>
                 <div class="form-group">
                   <label >Titre</label>
                   <input value="<%=livre.getTitre()%>" name="titre" type="text" class="form-control" >
                 </div>
                 <div class="form-group">
                   <label >Auteur</label>
                   <input value="<%=livre.getAuteur()%>" name="auteur" type="text" class="form-control" >
                 </div>
                  <div class="form-group">
                   <label >Nombre de pages</label>
                   <input value="<%=livre.getN_page()%>" name="n_page" type="text" class="form-control" >
                 </div>
                 <div class="form-group">
                   <label >Prix</label>
                   <input value="<%=livre.getPrix()%>" name="prix" type="text" class="form-control" >
                 </div>
                
               </fieldset>
                  <button class="btn btn-primary" type="submit">Valide</button>
             </form>
         </div>
    </body>
</html>
