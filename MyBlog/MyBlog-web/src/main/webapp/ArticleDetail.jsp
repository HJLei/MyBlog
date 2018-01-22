<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/10
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>夏随枫散尽</title>
<link href="css/index.css" rel="stylesheet">

<link href='http://fonts.googleapis.com/css?family=La+Belle+Aurore'
	rel='stylesheet' type='text/css'>
	<script type="text/javascript" src="js/bootstrap/jquery-3.2.1.min.js"></script>
</head>
<body>
	<figure>
	<p>
		<a class="emails" target="_blank"
			href="http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&amp;email=HHh9cn95b3F1cHVye1xtbTJ-c3E"
			title="email"></a> <a class="rssdy" target="_blank"
			href="/e/web/?type=rss2" title="rss订阅"></a> <a class="fav"
			target="_blank"
			onClick="window.external.addFavorite('http://www.yangqq.com')"
			title="加入收藏"></a>
	</p>
	</figure>
	<header>
	<h1>
		<a href="/">人生如只如初见</a>
	</h1>
	<p>如果没有为陌上悄然伫立并为陌上风情所陶醉的人，那么花开也寂寞,风情也苍白...</p>
	</header>
	<!--nav begin-->
	<div id="nav">
		<ul>
			<li><a href="index.jsp">网站首页</a></li>
			<li><a href="photoDetail" title="相册">相册</a></li>

			<s:if test="#session.LoginUser != null">
				<li><a href=""
					   title="注销" onclick="removeLongName()">注销</a></li>
			</s:if>
			<s:else>
				<li><a href="login.jsp" title="登录">登录</a></li>
			</s:else>
			<s:if test="#session.LoginUser.state == 2">
				<li><a href="${pageContext.request.contextPath}/admin/admin.jsp">后台管理</a></li>
			</s:if>
<%-- 			<s:elseif test="#session.user.userPower == 0">
			<li><a href="doUser.action?userId=<s:property value="userId" />" title="个人中心">个人中心</a></li>
			</s:elseif> --%>
		</ul>
	</div>
	<!--nav end-->
	<div class="lace_hd_ft"></div>
	<article>
	<div class="blog">
		<h3>
			<p>
				博文<span>Blog</span>
			</p>
		</h3>
		<div class="bloglist">
			<h2>
				<a href=""><s:property value="article.articleTitle" />
				</a>
			</h2>
			<p>
				<s:property value="article.articleType" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<s:date name="article.articleTime" format="yyyy年MM月dd日 " />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 点击量：
				<s:property value="article.clickCount" />
			</p>
			<br />
			<ul class="content">
				<s:property value="article.articleContent" />
			</ul>
		</div>


		<h3>
			<p>
				评论区<span>comment</span>
			</p>
		</h3>
		<div class="bloglist">
			<s:iterator value="#request.commentList" var="comment" status="ids">
				<fieldset style="background-color: #d0ecf8; ">
					<p>
						<a>评论者：${comment[0]}</a> <a
							style="float: right;">评论时间： ${comment[1]}
						</a>
					</p>
					<br />
					<ul class="content">
						评论内容：${comment[2]}
					</ul>
				</fieldset>
				</br>
			</s:iterator>
			</br>
			<s:if test="#session.LoginUser != null">
				<form id="addFrm" action="">
					<div class="label">
						<label id="showMessage">内容：</label>
					</div>
					<div class="field">
						<textarea name="comment.content" class="input"
							style="height:100px; width:680px; border:1px solid #ddd;" id="tx"></textarea>
						<input type="hidden" value="${sessionScope.LoginUser.bno}" name="comment.blogger.bno"> <!--隐藏记录登陆人-->
						<input type="hidden" value="${sessionScope.ArticleId}" name="comment.comments.articleId">
						<div class="tips"></div>
					</div>
					<br>
					<div class="field">
						<button class="button bg-main icon-check-square-o" type="button" onclick="doAddComment()">发表评论</button>
					</div>
			</s:if>
			<s:if test="#session.LoginUser == null">
			<p>您还没登录请先<a href="login.jsp">登录</a></p>
			</s:if>
			</form>
		</div>

	</div>

	<aside>
		<h2>个人档案</h2>	
	<div class="vcard">
		<p class="nickname">博主：君无戏言</p>
		<p class="address">手机号：12345678910</p>
		<p class="address">住址：广西</p>
		<p class="address">邮箱：595729806@qq.com</p>
		<p class="address">爱好：音乐，旅行</p>
	</div>
	<h2>热文推荐</h2>
	<ul>
		<s:iterator value="clickList" status="st">
			<s:if test="#st.Count <= 5">
				<li><a
					href=""><s:property
							value="articleTitle" /> </a><a style="float: right;">(<s:property
							value="clickCount" />)</a>
			</s:if>
		</s:iterator>
	</ul>

	<h2>近期文章</h2>
	<ul>
		<s:iterator value="articleList" status="st">
			<s:if test="#st.Count <= 5">
				<li><a
					href=""><s:property
							value="articleTitle" /> </a>
			</s:if>
		</s:iterator>
	</ul>
	<!-- <h2>文章归档</h2>
	<ul>
		<s:iterator value="timeList">
			<li><a href="/"><s:date name="articleTime" format="yyyy年MM月 " /></a></li>
		</s:iterator>
	</ul> -->
		<h2>友情链接</h2>
	<ul>
			<li><a href="">个人博客</a></li>
	</ul>
		<!-- Baidu Button BEGIN -->
		<div id="bdshare"
			class="bdshare_t bds_tools_32 get-codes-bdshare share">
			<a class="bds_tsina"></a> <a class="bds_qzone"></a> <a
				class="bds_tqq"></a> <a class="bds_renren"></a> <span
				class="bds_more"></span>
		</div>
		<script type="text/javascript" id="bdshare_js"
			data="type=tools&amp;uid=6574585"></script>
		<script type="text/javascript" id="bdshell_js"></script>
		<script type="text/javascript">
			document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion="
					+ Math.ceil(new Date() / 3600000)
		</script>
		<!-- Baidu Button END -->
	</aside> </article>
	<div class="blank"></div>
	<div id="copright">© 万场快乐千场醉，世上闲人地上仙。</div>
	<script src="js/silder.js"></script>
</body>
</html>
<script type="text/javascript">
		//yibu
        function doAddComment(){
            var param=$("#addFrm").serialize();
            $.post("commentAction_ReleaseComments",param,function(data){
                if(data.msg==1){
                    $("#showMessage").css("color","green").html("评论成功！需要后台管理员审核通过才会显示");
                    $("#tx").val("");
                }else{
                    $("#showMessage").css("color","green").html("评论失败！");
                }
            });
        }
        //注销登录
        function removeLongName(){
            if(confirm("确定要退出登录吗？")) {
                $.post("userAction_removeLongName",null,function(data){
					if(data.msg==1){
						alert("退出登录成功！");
					}else{
                        alert("退出失败！");
					}
           		 });
                return true;
            }
            else {
                return false;
            }
        }
</script>