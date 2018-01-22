<%--
  Created by IntelliJ IDEA.
  User: HJL
  Date: 2018/1/19
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>添加公告</legend>
</fieldset>
    <form method="post" action="">

    </form>
<textarea class="layui-textarea" id="LAY_demo1" style="display: none">
     编辑器的初始内容
</textarea>

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
                alert(1);
            }
        };

        $('.site-demo-layedit').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });



</script>
