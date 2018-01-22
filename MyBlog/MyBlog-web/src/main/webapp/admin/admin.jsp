<%--
  Created by IntelliJ IDEA.
  User: HJL
  Date: 2018/1/15
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博文后台管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/js/bootstrap/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/layui/layui.js" type="text/javascript"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">个人博客后台管理</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/index.jsp">前台界面</a></li>
            <li class="layui-nav-item"><a href="">信息管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    君无戏言
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">博文</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" id="jsPswEdit">添加文章</a></dd>
                        <dd><a href="javascript:;" id="reviewReview">评论审核</a></dd>
                        <dd><a href="javascript:;">文章列表</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">个人中心</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:revisingPersonalData();">个人资料</a></dd>
                        <dd><a href="javascript:notice();">公告</a></dd>
                        <dd><a href="javascript:test();">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="" target="">菜单3</a></li>
                <!--<li class="layui-nav-item"><a href="demo2.html" target="myframe">云市场</a></li>-->
                <li class="layui-nav-item"><a href="">菜单4</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;" id="myBody">个人博客后台管理界面</div>
        <!--<iframe name="myframe" width="1160" height="500"></iframe>-->

    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © 万场快乐千场醉，世上闲人地上仙。
    </div>
</div>
</body>
</html>
<script>
    //JavaScript代码区域
    var carousel;
    var form;
    var layedit,$;
    layui.use(['element','carousel','form','layedit'], function(){
        var element = layui.element;
        carousel = layui.carousel;
        form = layui.form;

        layedit = layui.layedit,$ = layui.jquery;
    });

    //加载添加文章界面
    $('#jsPswEdit').bind("click", function(){
        //$("#myBody").load("demo2.html");
        $("#myBody").load("addArticle.jsp");
    });
    //加载评论审核界面
    $('#reviewReview').bind("click", function(){
        $("#myBody").load("reviewReview.jsp");

        $("#tab tr:not(:first)").remove();
        $.post("commentAction_commentList","",function(data){
            $.each(data.commentList,function(i,v){
                var tr="<tr>";
                tr+="<td>"+v[0]+"</td>";
                tr+="<td>"+v[1].substring(0,10)+"</td>";
                tr+="<td>"+v[2]+"</td>";
                tr+="<td>"+(v[3]==1?"通过":"<a href='javascript:doAdopt("+v[4]+");' class=cls"+v[4]+" ><span>点击可通过审核</span><a>")+"</td>";
                $("#tab").append(tr);
            });
        },"json");
    });
    //异步审核评论
    function doAdopt(id){
        if ($(".cls"+id+" span").text()==="点击可通过审核"){
            if(confirm("确定要通过审核吗？")) {
                $.post("commentAction_updateComment","comment.cno="+id,function(data){
                    if(data.msg==1){
                        $(".cls"+id+" span").text("通过").css("color","#666666");
                    }else{
                        alert("审核不通过！");
                    }
                },"json");
                return true;
            } else {
                return false;
            }
        }
    }
    //加载修改个人资料界面
    function revisingPersonalData() {
        $("#myBody").load("revisingPersonalData.jsp");
        $.post("userAction_findMyInfo","",function(data){
            $.each(data.ulist,function(i,v){
                $("#bname").val(v.bname);
                $("#bemail").val(v.bemail);
                $("#bAddress").val(v.bAddress);
                $("#bsign").val(v.bsign);
                $("#state").val(v.state);
               // $("#myImage").val(v.bimage);
                $("#bno").val(v.bno);
                $("#bpwd").val(v.bpwd);
                $("#bnickName").val(v.bnickName);
                var hobby = v.bhobby.split(',');
                var hobbys = $(":checkbox");//所有复选框
                for (var i = 0; i < hobbys.length; i++) {
                    if(hobby.indexOf(hobbys[i].title)>=0){
                        hobbys[i].checked=true;
                        form.render('checkbox');
                    }
                }

                var bSex=v.bSex;
                var sex=$(":radio").val();
                if (bSex===sex){
                    $("input[type='radio'][name='user.bSex']").get(0).checked = true;
                    form.render('radio');
                }else {
                    $("input[type='radio'][name='user.bSex']").get(1).checked = true;
                    form.render('radio');
                }
            });
        },"json");
    }
//    function updateUser() {
//        var param=$("#updateUser").serialize();
//        $.post("userAction_updateUser",param,function(data){
//            if(data.msg==2){
//                alert("OK");
//            }else{
//                alert("error");
//            }
//        });
//    }
    function updateUser() {
        var formData = new FormData($( "#updateUser" )[0]);
        $.ajax({
            url: 'userAction_updateUser' ,
            type: 'POST',
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (returndata) {
                alert("操作成功！");
            },
            error: function (returndata) {
                alert("操作失败！");
            }
        });
    }
    function notice() {
        $("#myBody").load("layedit.jsp");
    }

    function test() {
        $("#myBody").load("test.jsp");
        $.post("noticeAction_noticeList","",function(data){
            $.each(data.noticeList,function(i,v){
                var cody=v.code;
                var title=v.title;
                $("#mTitle").html(title);
                $("#myCody").html(cody);
            });
        },"json");
    }


</script>