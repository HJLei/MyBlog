<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/8
  Time: 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户登录</title>
      <!-- 包含头部信息用于适应不同设备 -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- 包含 bootstrap 样式表 -->
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script type="text/javascript" src="js/bootstrap.min.js"></script>

      <link href="css/common.css" rel="stylesheet" type="text/css" />
      <link href="css/style.css" rel="stylesheet" type="text/css" />

      <script type="text/javascript" src="js/bootstrap/jquery-3.2.1.min.js"></script>
      <script type="text/javascript" src="js/login.js"></script>

      <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
      <script src="${pageContext.request.contextPath}/layui/layui.js" type="text/javascript"></script>
      <!--注册弹出层css样式-->
      <style type="text/css">
          /*css样式表达方式: 属性:值; 身高:1.7m;  px像素*/
          #tc{width:600px;/*宽度*/ height:370px;/*高度*/ background:#fff;/*背景颜色*/display:none;/*隐藏*/
              box-shadow:10px 10px 15px #000;/*css3技术*/ position:absolute; top:100px; left:350px;}
          #tc #title{width:600px; height:48px; background:#FF9900;  color:#fff; font-size:18px;
              font-family:"微软雅黑"; text-indent:45px; line-height:48px; position:relative;}
          #tc #title .close{width:17px;height:18px; background:green; display:block; position:absolute;
              top:13px; right:10px; background:url("images/close.png");}
          #tc #title .close:hover{background:url("images/close.png") 0px -18px;}

          #tc p{font-size:14px; color:#666;font-family:"微软雅黑"; padding:0px 40px;}
          #login {width:340px;height:200px; margin:0px auto;/*水平距中*/}

          #login p{ padding:0px; font-size:16px; color:#000;font-family:"微软雅黑"; }
          #login p input{width:260px; height:38px;margin-top: 6px;}
          #login p.but{padding-left:35px;}
          #login p.but input{width:263px; height:40px; background-color: lime; border:0px;}
          .gray{width:100%; height:100%; background:rgba(0,0,0,0.4); position:absolute; top:0px; left:0px;
              display:none;/*隐藏*/}
      </style>

  </head>

<body  style="background-image:url('images/login_img.jpg');">
<div class="wrap" >
<!-- main begin-->
 <div class="main">
   <div class="sidebarg">

   <form action=""  id="yibuLogin">
    <%--<input type="hidden" name="action" value="doLogin"/>--%>
    <div class="login">
      <dl>
		<dt class="blues">个人博客系统用户登录</dt>
          <h3 style="color:red"><s:actionerror/></h3>
          <h3>
              <div id="showMessage"></div>
              <s:if test="#parameters.msg[0]==1">
                  <p style="color:green">注册成功!</p>
              </s:if>
              <s:elseif test="#parameters.msg[0]==-1">
                  <p style="color:red">注册失败!</p>
              </s:elseif>
          </h3>
        <dd><label>用户名:</label>
        	<input type="text" name="user.bname" class="inputh"  id="name" placeholder="请输入用户名"/></dd>
        <dd><label>密 码:</label>
        	<input type="password" name="user.bpwd" class="inputh"  id="password" placeholder="请输入密码"/></dd>
        <dd class="buttom">
           <input type="button"  onclick="userLogin()" value="登 录" class="spbg buttombg f14 lf" />
           <span class="blues  lf" style="font-size: 26px">
               <span id="dl" style="position: relative;top: 10px;">注册</span>
           </span>
           <div class="cl"></div>
        </dd>
       
      </dl>
    </div>
    </form>
   </div>
  <div class="cl"></div>
 </div>
<!-- 注册层-->
    <div class="gray"></div>
    <div id="tc">
        <div id="title">用户注册<a href="#" class="close" onclick="doExit()"></a></div>
        <p><img src="images/new.png"  width='40' height='40' align="absmiddle"/>欢迎来到本博客注册页面！</p>
        <div id="login">
            <form method="post" action="checkImgAction_regist" class="layui-form" onsubmit="return checkPwd();" id="addFrm">
                <p>&nbsp;&nbsp;&nbsp;
                    用户名:<input lay-verify="required" type="text" name="user.bname" placeholder="请输入3-12位数字字母的用户名" pattern="^[a-zA-Z0-9_]{3,12}"/></p>
                <p>&nbsp;&nbsp;&nbsp;
                    验证码:<input type="text" lay-verify="required" id="checkcode" placeholder="请输入验证码" name="checkcode" class="text captcha" maxlength="4" autocomplete="off"/></p>
                <p>&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <img id="checkImg" class="captchaImage" src="${pageContext.request.contextPath}/checkImgAction_execute" onclick="change()" title="点击更换验证码"></p>
                <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    密码:<input type="password" lay-verify="required" name="user.bpwd" id="bpwd" placeholder="请输入6-16位数字字母的密码" pattern="^[a-zA-Z0-9_]{6,16}"/></p>
                <p>重复密码:<input type="password" id="repwd" placeholder="请再次输入密码"/></p><br/>
                <p class="but">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input lay-submit lay-filter="formDemo" type="submit" value="注册" class="btn btn-success" style="font-size: 20px;" /></p>
            </form>
        </div>
    </div>

    <!-- footer begin-->
</div>
 <!--footer end-->
</body>
</html>
<script type="text/javascript">
    //layui框架验证非空
    layui.use('form', function(){
        var form = layui.form;
        监听提交
        form.on('submit(formDemo)', function(data){
            //layer.msg(JSON.stringify(data.field));
            return false;
        });
    });

    //操作注册层
    $("#dl").click(function(){
        $(".gray").show();//显示
        $("#tc").show();
    });
//    $(".close").click(function(){
//        $(".gray").hide();//关闭
//        $("#tc").hide();
//    });
    function doExit() {
        $(".gray").hide();//关闭
        $("#tc").hide();
    }

    function checkPwd(){
        var pwd=document.getElementById("bpwd").value;
        var repwd=document.getElementById("repwd").value;
        if(pwd==repwd){
            //doAddUser();
            return true;
        }else{
            alert("密码和确认密码不一致");
            return false;
        }
    }

    //异步登陆
    function userLogin() {
        var param=$("#yibuLogin").serialize();
        $.post("userAction_doLogin",param,function(data){
            if(data.msg==1){
                $("#showMessage").css("color","green").html("登陆成功！");
                window.parent.parent.location.href='index.jsp';
            }else{
                $("#showMessage").css("color","red").html("登陆失败！用户名或密码错误。");
            }
        });

    }
    //执行异步注册onclick="doAddUser()"
//    function doAddUser(){
//        var param=$("#addFrm").serialize();
//        $.post("userAction_addUser",param,function(data){
//            if(data.msg==1){
//                $("#showMessage").css("color","green").html("注册成功！");
//            }else{
//                $("#showMessage").css("color","red").html("注册失败！");
//            }
//        });
//    }

    //切换验证码
    function change(){
        var img1=document.getElementById("checkImg");
        img1.src="${pageContext.request.contextPath}/checkImgAction_execute?mytime="+new Date().getTime(); //加时间戳防止缓存
    }
</script>