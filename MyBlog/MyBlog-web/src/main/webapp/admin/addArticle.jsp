<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
  <link rel="stylesheet" href="css/pintuer.css">
  <link rel="stylesheet" href="css/admin.css">
  <script src="${pageContext.request.contextPath}/js/bootstrap/jquery-3.2.1.min.js" type="text/javascript"></script>
</head>
  <body>
      <div class="panel admin-panel">
        <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加内容</strong></div>
        <div class="body-content">
          <form method="post" class="form-x" action="" id="addFrm">
            <div class="form-group">
              <div class="label">
                <label>标题：</label>
              </div>
              <div class="field">
                <input type="text" class="input w50"  name="article.articleTitle" data-validate="required:请输入标题" />
                <div class="tips"></div>
              </div>
            </div>

              <div class="form-group">
                <div class="label">
                  <label>分类：</label>
                </div>
                <div class="field">
                  <select name="article.articleType" class="input w50">
                    <option>java</option>
                    <option>数据库</option>
                    <option>前端</option>
                    <option>其他</option>
                  </select>
                  <div class="tips"></div>
                </div>
              </div>

            <div class="form-group">
              <div class="label">
                <label>描述：</label>
              </div>
              <div class="field">
                <textarea class="input" name="article.articleSummary" style=" height:60px;"></textarea>
                <div class="tips"></div>
              </div>
            </div>
            <div class="form-group">
              <div class="label">
                <label>内容：</label>
              </div>
              <div class="field">
                <textarea name="article.articleContent" class="input" style="height:160px; border:1px solid #ddd;"></textarea>
                <div class="tips"></div>
              </div>
            </div>
            <div class="form-group">
              <div class="label">
                <label></label>
              </div>
              <div class="field">
                <button class="button bg-main icon-check-square-o" type="button" onclick="doAddArticle()"> 提交</button>
                <div id="showMessage"></div>
              </div>
            </div>
          </form>
        </div>
      </div>

  </body>
</html>
<script type="text/javascript">
    //异步发布文章
    function doAddArticle(){
        var param=$("#addFrm").serialize();
        $.post("articleAction_addTbArticle",param,function(data){
            if(data.msg==1){
                $("#showMessage").css("color","green").html("添加成功！");
                $(".input w50").val("");    //添加成功后清空输入框
                $(".article.articleType").val("");
                $(".input").val("");
            }else{
                $("#showMessage").css("color","green").html("添加失败！");
            }
        });
    }

</script>