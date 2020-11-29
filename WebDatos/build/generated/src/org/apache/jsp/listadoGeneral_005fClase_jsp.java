package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clases.ProcesosEstudiantes;
import clases.Estudiante;
import java.util.LinkedList;

public final class listadoGeneral_005fClase_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listado</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Listado General de Estudiantes</h1>\n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\">Carnet</td>\n");
      out.write("                <td align=\"center\">Nombre</td>\n");
      out.write("                <td align=\"center\">Apellidos</td>\n");
      out.write("                <td align=\"center\">Fecha Nacimiento</td>\n");
      out.write("                <td align=\"center\">Fecha Ingreso</td>\n");
      out.write("                <td align=\"center\">Direccion</td>\n");
      out.write("                <td align=\"center\">Telefono</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

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
            out.println("total"+lista.size()+"estudiantes encontrados!");
            
      out.write("\n");
      out.write("        </table>\n");
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
