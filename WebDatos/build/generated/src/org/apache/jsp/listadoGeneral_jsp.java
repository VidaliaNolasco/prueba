package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class listadoGeneral_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Generacion Listado de Estudiantes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row-fluid\">\n");
      out.write("       <div class=\"col-md-12\">\n");
      out.write("        ");

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps=null;
        String SQL = null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Universidad","root","jorge_perez100");
            conn.setAutoCommit(false);
            
            SQL = "select * from estudiantes";
            ps = conn.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            conn.commit(); 
            out.println("<h1 class=text-center>Lista de Estudiantes</h1>");
            out.println("<table class=table>");
            out.println("<thead class=bg-info>");
            out.println("<tr>");
            out.println("<td><h5> Carnet </h5></td>");
            out.println("<td><h5>Nombre </h5></td>");
            out.println("<td><h5> Apellidos </h5></td>");
            out.println("<td><h5> Fecha Nacimiento </h5></td>");
            out.println("<td><h5> Fecha Ingreso </h5></td>");
            out.println("<td><h5> Telefono </h5></td>");
            out.println("<td><h5> Direccion </h5></td>");
            out.println("</tr>");
            out.println("</thead>");
            
            while(rs.next()){
                out.println("<tr>");
                out.println("<td class=>"+rs.getString("CarnetID")+"</td>");
                out.println("<td>"+rs.getString("Nombre")+"</td>");
                out.println("<td>"+rs.getString("Apellidos")+"</td>");
                out.println("<td>"+rs.getString("FechaNacimiento")+"</td>");
                out.println("<td>"+rs.getString("FechaIngreso")+"</td>");
                out.println("<td>"+rs.getString("Telefono")+"</td>");
                out.println("<td>"+rs.getString("Direccion")+"</td>");
                out.println("</tr>");
            }out.println("</table>");
           
        }catch(SQLException exQL){
            out.println(exQL.toString());
        }catch (Exception ex){
            out.println(ex.toString());
        }finally{
            if(rs != null) rs.close();
            if(ps != null) ps.close();
            if(conn != null) conn.close();
        }
        
      out.write("\n");
      out.write("         </div>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
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
