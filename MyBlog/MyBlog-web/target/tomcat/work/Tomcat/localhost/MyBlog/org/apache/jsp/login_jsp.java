/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-01-21 10:54:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>用户登录</title>\r\n");
      out.write("      <!-- 包含头部信息用于适应不同设备 -->\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("      <!-- 包含 bootstrap 样式表 -->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("      <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("      <link href=\"css/common.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("      <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("      <script type=\"text/javascript\" src=\"js/bootstrap/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"js/login.js\"></script>\r\n");
      out.write("\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layui/css/layui.css\">\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layui/layui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("      <!--注册弹出层css样式-->\r\n");
      out.write("      <style type=\"text/css\">\r\n");
      out.write("          /*css样式表达方式: 属性:值; 身高:1.7m;  px像素*/\r\n");
      out.write("          #tc{width:600px;/*宽度*/ height:370px;/*高度*/ background:#fff;/*背景颜色*/display:none;/*隐藏*/\r\n");
      out.write("              box-shadow:10px 10px 15px #000;/*css3技术*/ position:absolute; top:100px; left:350px;}\r\n");
      out.write("          #tc #title{width:600px; height:48px; background:#FF9900;  color:#fff; font-size:18px;\r\n");
      out.write("              font-family:\"微软雅黑\"; text-indent:45px; line-height:48px; position:relative;}\r\n");
      out.write("          #tc #title .close{width:17px;height:18px; background:green; display:block; position:absolute;\r\n");
      out.write("              top:13px; right:10px; background:url(\"images/close.png\");}\r\n");
      out.write("          #tc #title .close:hover{background:url(\"images/close.png\") 0px -18px;}\r\n");
      out.write("\r\n");
      out.write("          #tc p{font-size:14px; color:#666;font-family:\"微软雅黑\"; padding:0px 40px;}\r\n");
      out.write("          #login {width:340px;height:200px; margin:0px auto;/*水平距中*/}\r\n");
      out.write("\r\n");
      out.write("          #login p{ padding:0px; font-size:16px; color:#000;font-family:\"微软雅黑\"; }\r\n");
      out.write("          #login p input{width:260px; height:38px;margin-top: 6px;}\r\n");
      out.write("          #login p.but{padding-left:35px;}\r\n");
      out.write("          #login p.but input{width:263px; height:40px; background-color: lime; border:0px;}\r\n");
      out.write("          .gray{width:100%; height:100%; background:rgba(0,0,0,0.4); position:absolute; top:0px; left:0px;\r\n");
      out.write("              display:none;/*隐藏*/}\r\n");
      out.write("      </style>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("<body  style=\"background-image:url('images/login_img.jpg');\">\r\n");
      out.write("<div class=\"wrap\" >\r\n");
      out.write("<!-- main begin-->\r\n");
      out.write(" <div class=\"main\">\r\n");
      out.write("   <div class=\"sidebarg\">\r\n");
      out.write("\r\n");
      out.write("   <form action=\"\"  id=\"yibuLogin\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"login\">\r\n");
      out.write("      <dl>\r\n");
      out.write("\t\t<dt class=\"blues\">个人博客系统用户登录</dt>\r\n");
      out.write("          <h3 style=\"color:red\">");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("          <h3>\r\n");
      out.write("              <div id=\"showMessage\"></div>\r\n");
      out.write("              ");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              ");
      if (_jspx_meth_s_005felseif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          </h3>\r\n");
      out.write("        <dd><label>用户名:</label>\r\n");
      out.write("        \t<input type=\"text\" name=\"user.bname\" class=\"inputh\"  id=\"name\" placeholder=\"请输入用户名\"/></dd>\r\n");
      out.write("        <dd><label>密 码:</label>\r\n");
      out.write("        \t<input type=\"password\" name=\"user.bpwd\" class=\"inputh\"  id=\"password\" placeholder=\"请输入密码\"/></dd>\r\n");
      out.write("        <dd class=\"buttom\">\r\n");
      out.write("           <input type=\"button\"  onclick=\"userLogin()\" value=\"登 录\" class=\"spbg buttombg f14 lf\" />\r\n");
      out.write("           <span class=\"blues  lf\" style=\"font-size: 26px\">\r\n");
      out.write("               <span id=\"dl\" style=\"position: relative;top: 10px;\">注册</span>\r\n");
      out.write("           </span>\r\n");
      out.write("           <div class=\"cl\"></div>\r\n");
      out.write("        </dd>\r\n");
      out.write("       \r\n");
      out.write("      </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("   </div>\r\n");
      out.write("  <div class=\"cl\"></div>\r\n");
      out.write(" </div>\r\n");
      out.write("<!-- 注册层-->\r\n");
      out.write("    <div class=\"gray\"></div>\r\n");
      out.write("    <div id=\"tc\">\r\n");
      out.write("        <div id=\"title\">用户注册<a href=\"#\" class=\"close\" onclick=\"doExit()\"></a></div>\r\n");
      out.write("        <p><img src=\"images/new.png\"  width='40' height='40' align=\"absmiddle\"/>欢迎来到本博客注册页面！</p>\r\n");
      out.write("        <div id=\"login\">\r\n");
      out.write("            <form method=\"post\" action=\"checkImgAction_regist\" class=\"layui-form\" onsubmit=\"return checkPwd();\" id=\"addFrm\">\r\n");
      out.write("                <p>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    用户名:<input lay-verify=\"required\" type=\"text\" name=\"user.bname\" placeholder=\"请输入3-12位数字字母的用户名\" pattern=\"^[a-zA-Z0-9_]{3,12}\"/></p>\r\n");
      out.write("                <p>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    验证码:<input type=\"text\" lay-verify=\"required\" id=\"checkcode\" placeholder=\"请输入验证码\" name=\"checkcode\" class=\"text captcha\" maxlength=\"4\" autocomplete=\"off\"/></p>\r\n");
      out.write("                <p>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <img id=\"checkImg\" class=\"captchaImage\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkImgAction_execute\" onclick=\"change()\" title=\"点击更换验证码\"></p>\r\n");
      out.write("                <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    密码:<input type=\"password\" lay-verify=\"required\" name=\"user.bpwd\" id=\"bpwd\" placeholder=\"请输入6-16位数字字母的密码\" pattern=\"^[a-zA-Z0-9_]{6,16}\"/></p>\r\n");
      out.write("                <p>重复密码:<input type=\"password\" id=\"repwd\" placeholder=\"请再次输入密码\"/></p><br/>\r\n");
      out.write("                <p class=\"but\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <input lay-submit lay-filter=\"formDemo\" type=\"submit\" value=\"注册\" class=\"btn btn-success\" style=\"font-size: 20px;\" /></p>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- footer begin-->\r\n");
      out.write("</div>\r\n");
      out.write(" <!--footer end-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //layui框架验证非空\r\n");
      out.write("    layui.use('form', function(){\r\n");
      out.write("        var form = layui.form;\r\n");
      out.write("        监听提交\r\n");
      out.write("        form.on('submit(formDemo)', function(data){\r\n");
      out.write("            //layer.msg(JSON.stringify(data.field));\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //操作注册层\r\n");
      out.write("    $(\"#dl\").click(function(){\r\n");
      out.write("        $(\".gray\").show();//显示\r\n");
      out.write("        $(\"#tc\").show();\r\n");
      out.write("    });\r\n");
      out.write("//    $(\".close\").click(function(){\r\n");
      out.write("//        $(\".gray\").hide();//关闭\r\n");
      out.write("//        $(\"#tc\").hide();\r\n");
      out.write("//    });\r\n");
      out.write("    function doExit() {\r\n");
      out.write("        $(\".gray\").hide();//关闭\r\n");
      out.write("        $(\"#tc\").hide();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function checkPwd(){\r\n");
      out.write("        var pwd=document.getElementById(\"bpwd\").value;\r\n");
      out.write("        var repwd=document.getElementById(\"repwd\").value;\r\n");
      out.write("        if(pwd==repwd){\r\n");
      out.write("            //doAddUser();\r\n");
      out.write("            return true;\r\n");
      out.write("        }else{\r\n");
      out.write("            alert(\"密码和确认密码不一致\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //异步登陆\r\n");
      out.write("    function userLogin() {\r\n");
      out.write("        var param=$(\"#yibuLogin\").serialize();\r\n");
      out.write("        $.post(\"userAction_doLogin\",param,function(data){\r\n");
      out.write("            if(data.msg==1){\r\n");
      out.write("                $(\"#showMessage\").css(\"color\",\"green\").html(\"登陆成功！\");\r\n");
      out.write("                window.parent.parent.location.href='index.jsp';\r\n");
      out.write("            }else{\r\n");
      out.write("                $(\"#showMessage\").css(\"color\",\"red\").html(\"登陆失败！用户名或密码错误。\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    //执行异步注册onclick=\"doAddUser()\"\r\n");
      out.write("//    function doAddUser(){\r\n");
      out.write("//        var param=$(\"#addFrm\").serialize();\r\n");
      out.write("//        $.post(\"userAction_addUser\",param,function(data){\r\n");
      out.write("//            if(data.msg==1){\r\n");
      out.write("//                $(\"#showMessage\").css(\"color\",\"green\").html(\"注册成功！\");\r\n");
      out.write("//            }else{\r\n");
      out.write("//                $(\"#showMessage\").css(\"color\",\"red\").html(\"注册失败！\");\r\n");
      out.write("//            }\r\n");
      out.write("//        });\r\n");
      out.write("//    }\r\n");
      out.write("\r\n");
      out.write("    //切换验证码\r\n");
      out.write("    function change(){\r\n");
      out.write("        var img1=document.getElementById(\"checkImg\");\r\n");
      out.write("        img1.src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkImgAction_execute?mytime=\"+new Date().getTime(); //加时间戳防止缓存\r\n");
      out.write("    }\r\n");
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

  private boolean _jspx_meth_s_005factionerror_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionerror_005f0.setParent(null);
    int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
    if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /login.jsp(66,14) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#parameters.msg[0]==1");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                  <p style=\"color:green\">注册成功!</p>\r\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f0 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f0.setParent(null);
    // /login.jsp(69,14) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f0.setTest("#parameters.msg[0]==-1");
    int _jspx_eval_s_005felseif_005f0 = _jspx_th_s_005felseif_005f0.doStartTag();
    if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                  <p style=\"color:red\">注册失败!</p>\r\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f0);
    return false;
  }
}