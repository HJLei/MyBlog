<%--
  Created by IntelliJ IDEA.
  User: HJL
  Date: 2018/1/19
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <div id="showMessage"></div>
    <form method="post" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">标题:</label>
            <div class="layui-input-block">
                <input type="text" id="myTitle"  required lay-verify="required"  autocomplete="off" class="layui-input" id="bemail">
            </div>
        </div>
        <textarea class="layui-textarea" id="LAY_demo1" style="display: none">

        </textarea>
    </form>


<div class="site-demo-button" style="margin-top: 20px;">
    <%--<button class="layui-btn site-demo-layedit" data-type="content">获取编辑器内容</button>--%>
    <%--<button class="layui-btn site-demo-layedit" data-type="text">获取编辑器纯文本内容</button>--%>
    <%--<button class="layui-btn site-demo-layedit" data-type="selection">获取编辑器选中内容</button>--%>
        <button class="layui-btn site-demo-layedit" data-type="submit">提交</button>
</div>

<script>

        //构建一个默认的编辑器
        var index = layedit.build('LAY_demo1');

        //编辑器外部操作
        var active = {
//            content: function(){
//                alert(layedit.getContent(index)); //获取编辑器内容
//            }
//            ,text: function(){
//                alert(layedit.getText(index)); //获取编辑器纯文本内容
//            }
//            ,selection: function(){
//                alert(layedit.getSelection(index));
//            }
            submit:function () {
                var title=$("#myTitle ").val();
                //异步添加公告
                $.post("noticeAction_addNotices","notice.title="+title+"&notice.notices="+layedit.getText(index)+"&notice.code="+layedit.getContent(index),function(data){
                        if(data.msg==1){
                            $("#showMessage").css("color","green").html("发布公告成功！");
                        }else{
                            $("#showMessage").css("color","green").html("发布公告失败！");
                        }
                 },"json");
            }
        };

        $('.site-demo-layedit').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });



</script>
