package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pagInsercion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Inclusion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   <div class=\"container-fluid\" align=\"center\">\n");
      out.write("      <div class=\"row-fluid\">\n");
      out.write("        <div class=\"col-md-6\" align=\"left\">\n");
      out.write("        <h1 class=\"text-center bg-info\">Inclusion de Estudiantes</h1>\n");
      out.write("        <form method=\"get\" action=\"pagInsertar.jsp\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               <label for=\"carnet\">Carnet: </label>\n");
      out.write("               <input  type=\"text\" class=\"form-control\" size=\"10\" width=\"20\" name=\"carnet\"/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"nombre\">Nombre: </label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" width=\"20\" name=\"nombre\" value=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"apellidos\">Apellidos: </label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" size=\"40\" width=\"20\" name=\"apellidos\" value=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"fechaNacimiento\">Fecha de nacimiento: </label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" size=\"10\" width=\"20\" name=\"fechanacimiento\" value=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"fechaIngreso\">Fecha de Ingreso: </label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" size=\"10\" width=\"20\" name=\"fechaingreso\" value=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"telefono\">Telefono: </label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" size=\"10\" width=\"20\" name=\"telefono\" value=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"direccion\">Direccion: </label>\n");
      out.write("            <textarea class=\"form-control\" name=\"direccion\" rows=\"4\" cols=\"20\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <input class=\"btn btn-success\" type=\"submit\" value=\"Incluir\"/>\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("      </div>  \n");
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
