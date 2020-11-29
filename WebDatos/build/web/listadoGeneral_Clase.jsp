<%-- 
    Document   : listadoGeneral_Clase
    Created on : 28-ago-2020, 0:02:23
    Author     : Vidalia Nolasco
--%>
<%@page import="clases.ProcesosEstudiantes"%>
<%@page import="clases.Estudiante"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        
    </head>
    <body>
     <div class="container-fluid">
      <div class="row-fluid">
       <div class="col-md-12">
        <h1 class="text-center">Listado General de Estudiantes</h1>
        <table class="table">
          <thead class="bg-info">
            <tr>
                <td align="center">Carnet</td>
                <td align="center">Nombre</td>
                <td align="center">Apellidos</td>
                <td align="center">Fecha Nacimiento</td>
                <td align="center">Fecha Ingreso</td>
                <td align="center">Direccion</td>
                <td align="center">Telefono</td>
            </tr>
          </thead>  class='table table-dark'
            <%
            String SQL = "select * from estudiantes";
            LinkedList<Estudiante> lista = ProcesosEstudiantes.getEstudiante(SQL);
            out.println("<align=\"center\">");
            for(int i = 0; i<lista.size(); i++){
                out.println("<tr>");
                out.println("<td>"+lista.get(i).getCarnet()+"</td>");
                out.println("<td>"+lista.get(i).getNombre()+"</td>");
                out.println("<td>"+lista.get(i).getApellidos()+"</td>");
                out.println("<td>"+lista.get(i).getFechaNac()+"</td>");
                out.println("<td>"+lista.get(i).getFechaIng()+"</td>");
                out.println("<td>"+lista.get(i).getTelefono()+"</td>");
                out.println("<td>"+lista.get(i).getDireccion()+"</td>");
                out.println("</tr>");
            }
             
            %> 
            </table> 
            <h4 class="text-center"> 
            <%      
            out.println("total: " + lista.size() + " estudiantes encontrados!");
            %>
            </h4> 
        </div>
       </div>
      </div>
    </body>
</html>
