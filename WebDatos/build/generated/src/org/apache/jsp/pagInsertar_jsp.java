package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import clases.ProcesosEstudiantes;
import clases.Estudiante;

public final class pagInsertar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Insertar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row-fluid\">\n");
      out.write("       <div class=\"col-md-12\">\n");
      out.write("        <h1 class=\"text-center\">Datos Registrados</h1>\n");
      out.write("         <table class=\"table\">\n");
      out.write("            <thead class=\"bg-info\">\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">Carnet</th>\n");
      out.write("                <th scope=\"col\">Nombre</th>\n");
      out.write("                <th scope=\"col\">Apellidos</th>\n");
      out.write("                <th scope=\"col\">Direccion</th>\n");
      out.write("                <th scope=\"col\">Telefono</th>\n");
      out.write("                <th scope=\"col\">Fecha de Nacimiento</th>\n");
      out.write("                <th scope=\"col\">Fecha de Ingreso</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            ");

            String pCarnet = request.getParameter("carnet");
            String pNombre = request.getParameter("nombre");
            String pApellidos = request.getParameter("apellidos");
            String pTelefono = request.getParameter("telefono");
            String pDireccion = request.getParameter("direccion");
            String fecha1 = request.getParameter("fechanacimiento");
            String fecha2 = request.getParameter("fechaingreso");
           
            String fechaNac = fecha1.substring(6,10)+"-"+fecha1.substring(3,5)+"-"+fecha1.substring(0,2);
            String fechaIng = fecha2.substring(6,10)+"-"+fecha2.substring(3,5)+"-"+fecha2.substring(0,2);
            
            String SQL = "insert into estudiantes (CarnetID,Nombre,Apellidos,FechaNacimiento,FechaIngreso,Telefono,Direccion)"
                    + "values('"+pCarnet+"','"+pNombre+"','"+pApellidos+"','"+fechaNac+"','"+fechaIng+"','"+pTelefono+"','"+pDireccion+"')";
           
            String proceso = ProcesosEstudiantes.actualizar(SQL);
            
            out.println("<tr>");
            out.println("<td>"+pCarnet+"</td>");
            out.println("<td>"+pNombre+"</td>");
            out.println("<td>"+pApellidos+"</td>");
            out.println("<td>"+pDireccion+"</td>");
            out.println("<td>"+pTelefono+"</td>");
            out.println("<td>"+fecha1+"</td>");
            out.println("<td>"+fecha2+"</td>");
            out.println("</tr>");
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("        <h3 class=\"text-center\">\n");
      out.write("            ");

            out.println(proceso);
            
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <input class=\"btn btn-success\" type=\"submit\" value=\"Regresar\" onclick=\"location.href='pagInsercion.jsp'\" />\n");
      out.write("        </h3>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
