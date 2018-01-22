<%--
  Created by IntelliJ IDEA.
  User: HJL
  Date: 2018/1/18
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<i class="layui-icon" style="font-size: 30px; color: #1E9FFF;">&#xe609;</i>
<form class="layui-form" id="updateUser" enctype="multipart/form-data" >
    <input type="hidden" name="user.bno" id="bno">
    <input type="hidden" name="user.bpwd" id="bpwd">
    <input type="hidden" name="user.state" id="state">
    <input type="hidden" name="user.bnickName" id="bnickName">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名:</label>
        <div class="layui-input-block">
            <input type="text" name="user.bname" required  lay-verify="required"  autocomplete="off" class="layui-input" id="bname">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">头像:</label>
        <div class="layui-input-block">
            <input type="file" name="file">
           <input type="hidden" name="user.bimage" id="myImage">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">邮箱:</label>
        <div class="layui-input-block">
            <input type="text" name="user.bemail" required  lay-verify="required"  autocomplete="off" class="layui-input" id="bemail">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">地址:</label>
        <div class="layui-input-block">
            <input type="text" name="user.bAddress" required  lay-verify="required"  autocomplete="off" class="layui-input" id="bAddress">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">爱好：</label>
        <div class="layui-input-block">
            <input type="checkbox" name="user.bhobby" title="写作" value="写作">
            <input type="checkbox" name="user.bhobby" title="阅读" value="阅读">
            <input type="checkbox" name="user.bhobby" title="发呆" value="发呆">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">性别：</label>
        <div class="layui-input-block">
            <input type="radio" name="user.bSex" value="男" title="男">
            <input type="radio" name="user.bSex" value="女" title="女" >
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">个性签名：</label>
        <div class="layui-input-block">
            <textarea name="user.bsign" class="layui-textarea" id="bsign"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo" onclick="updateUser()">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>

        form.render();
        //监听提交
        form.on('submit(formDemo)', function(data){
    //        layer.msg(JSON.stringify(data.field));
            return false;
        });

</script>