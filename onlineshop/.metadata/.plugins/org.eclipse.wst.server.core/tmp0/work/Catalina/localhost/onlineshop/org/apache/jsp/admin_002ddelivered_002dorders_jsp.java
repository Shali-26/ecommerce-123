/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-08-29 10:39:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.onlineshop.utility.DatabaseConnection;
import java.sql.*;

public final class admin_002ddelivered_002dorders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("com.onlineshop.utility.DatabaseConnection");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Shopping System</title>\r\n");
      out.write("        <!-- Importing all ui libs -->\r\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"js/jquery.easing.min.js\"></script>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            //Checking whether admin in session or not
            if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
        
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminHeader.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- MENU SECTION END-->\r\n");
      out.write("            <div class=\"content-wrapper\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row pad-botm\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <h4 class=\"header-line\">Delivered Orders</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                            <div class=\"panel panel-success\">\r\n");
      out.write("                                <div class=\"panel-heading\">Delivered Orders</div>\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        <table class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>#</th>\r\n");
      out.write("                                                    <th>Order No</th>\r\n");
      out.write("                                                    <th>Customer Details</th>\r\n");
      out.write("                                                    <th>Product</th>\r\n");
      out.write("                                                    <th>Qty</th>\r\n");
      out.write("                                                    <th>Total Amount</th>\r\n");
      out.write("                                                    <th>Status</th>\r\n");
      out.write("                                                    <th>Date</th>\r\n");
      out.write("                                                    <th>Payment Mode</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                        ");

                                            //Querying to the database
                                            ResultSet resultOrders = DatabaseConnection.getResultFromSqlQuery("select * from tblorders where order_status='Deliver'");
                                            while (resultOrders.next()) {
                                        
      out.write("\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>");
      out.print(resultOrders.getInt(1));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultOrders.getInt(2));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultOrders.getString(3));
      out.write('|');
      out.print(resultOrders.getString(4));
      out.write('|');
      out.print(resultOrders.getString(5));
      out.write('|');
      out.print(resultOrders.getString(6));
      out.write('|');
      out.print(resultOrders.getString(7));
      out.write('|');
      out.print(resultOrders.getString(8));
      out.write("</td>\r\n");
      out.write("                                                <td><img src=\"uploads/");
      out.print(resultOrders.getString(9));
      out.write("\"\r\n");
      out.write("                                                         alt=\"\" class=\"pro-image-front\"\r\n");
      out.write("                                                         style=\"width: 150px; height: 100px;\"><br>");
      out.print(resultOrders.getString(10));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultOrders.getString(11));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultOrders.getString(14));
      out.write("</td>\r\n");
      out.write("                                                ");

                                                    if (resultOrders.getString(15).equals("Deliver")) {
                                                
      out.write("\r\n");
      out.write("                                                <td><span class=\"label label-success\">Delivered</span></td>\r\n");
      out.write("                                                ");

                                                } else {
                                                
      out.write("\r\n");
      out.write("                                                <td><span class=\"label label-danger\">Pending</span></td>\r\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\r\n");
      out.write("                                                <td>");
      out.print(resultOrders.getString(16));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultOrders.getString(17));
      out.write("</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("            <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("            <script src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("            <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("        ");

            } else {
                response.sendRedirect("admin-login.jsp");
            }
        
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
