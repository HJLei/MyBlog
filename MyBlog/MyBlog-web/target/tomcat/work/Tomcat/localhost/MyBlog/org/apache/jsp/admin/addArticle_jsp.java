/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-01-21 12:27:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("<title></title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/pintuer.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/admin.css\">\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("  <body>\r\n");
      out.write("      <div class=\"panel admin-panel\">\r\n");
      out.write("        <div class=\"panel-head\" id=\"add\"><strong><span class=\"icon-pencil-square-o\"></span>增加内容</strong></div>\r\n");
      out.write("        <div class=\"body-content\">\r\n");
      out.write("          <form method=\"post\" class=\"form-x\" action=\"\" id=\"addFrm\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <div class=\"label\">\r\n");
      out.write("                <label>标题：</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"field\">\r\n");
      out.write("                <input type=\"text\" class=\"input w50\"  name=\"article.articleTitle\" data-validate=\"required:请输入标题\" />\r\n");
      out.write("                <div class=\"tips\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"label\">\r\n");
      out.write("                  <label>分类：</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"field\">\r\n");
      out.write("                  <select name=\"article.articleType\" class=\"input w50\">\r\n");
      out.write("                    <option>java</option>\r\n");
      out.write("                    <option>数据库</option>\r\n");
      out.write("                    <option>前端</option>\r\n");
      out.write("                    <option>其他</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                  <div class=\"tips\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <div class=\"label\">\r\n");
      out.write("                <label>描述：</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"field\">\r\n");
      out.write("                <textarea class=\"input\" name=\"article.articleSummary\" style=\" height:60px;\"></textarea>\r\n");
      out.write("                <div class=\"tips\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <div class=\"label\">\r\n");
      out.write("                <label>内容：</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"field\">\r\n");
      out.write("                <textarea name=\"article.articleContent\" class=\"input\" style=\"height:160px; border:1px solid #ddd;\"></textarea>\r\n");
      out.write("                <div class=\"tips\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <div class=\"label\">\r\n");
      out.write("                <label></label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"field\">\r\n");
      out.write("                <button class=\"button bg-main icon-check-square-o\" type=\"button\" onclick=\"doAddArticle()\"> 提交</button>\r\n");
      out.write("                <div id=\"showMessage\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //异步发布文章\r\n");
      out.write("    function doAddArticle(){\r\n");
      out.write("        var param=$(\"#addFrm\").serialize();\r\n");
      out.write("        $.post(\"articleAction_addTbArticle\",param,function(data){\r\n");
      out.write("            if(data.msg==1){\r\n");
      out.write("                $(\"#showMessage\").css(\"color\",\"green\").html(\"添加成功！\");\r\n");
      out.write("                $(\".input w50\").val(\"\");    //添加成功后清空输入框\r\n");
      out.write("                $(\".article.articleType\").val(\"\");\r\n");
      out.write("                $(\".input\").val(\"\");\r\n");
      out.write("            }else{\r\n");
      out.write("                $(\"#showMessage\").css(\"color\",\"green\").html(\"添加失败！\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
