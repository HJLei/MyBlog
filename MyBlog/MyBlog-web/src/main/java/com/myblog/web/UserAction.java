package com.myblog.web;
import com.myblog.entity.Users;
import com.myblog.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{
    /**定义属性，封装请求数据*/
    private Users user;
    private List ulist;
    private String msg;
    //定义属性封装上传文件信息
    private File file;
    private String fileFileName;
    private String fileContentType;
    /**声明需要依赖的服务层*/
    @Resource(name="userService")
    private IUserService userService;
    /**
     * 同步处理用户登录请求
     * @return
     */
//    public String doLogin(){
//        System.out.print(user.getBname());
//        //调用服务层方法处理用户登录操作
//        user=userService.doLogin(user);
//        if(user==null){
//            addActionError("用户名和密码错误!");
//            return "input";
//        }else{
//            //登录成功，记录登录状态
//            ActionContext.getContext().getSession().put("LoginUser", user);
//        }
//      return "main";
//    }
    //异步登陆
    public String doLogin(){
        //调用服务层方法处理用户登录操作
        user=userService.doLogin(user);
        if(user==null){
            msg="-1";
        }else{
            msg="1";
            ActionContext.getContext().getSession().put("LoginUser", user);
        }
        return "login";
    }

    //注销
    public String removeLongName(){
        ActionContext.getContext().getSession().put("LoginUser", null);
        msg="1";
        return "removeLongName";
    }
    /**
     * 同步注册
     * @return
     */
//    public String addUser(){
//        if(userService.addUser(user)){
//            msg=1;
//        }else {
//            msg=-1;
//        }
//        return "addSuccess";
//    }

    /**
     * 查询主页个人简介
     * @return
     */
    public String findMyInfo(){
        ulist=userService.findMyInfo();
        return "myinfo";
    }

    /**
     * 根据id查询用户
     * @return
     */
    public String findMy(){
        user=userService.getUserById(user.getBname());
        return "findMy";
    }


    //文件上传方法
    private void fileUpLoad(){
        if(file!=null&&file.getName()!=null){
            //获取要上传到的服务器目录
            String path= ServletActionContext.getServletContext().getRealPath("/upload");
            path=path+"/"+fileFileName;
            //执行上传
            try {
                FileUtils.copyFile(file, new File(path));
                //记录下保存路径
                user.setBimage(null);
                user.setBimage("upload/"+fileFileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String updateUser(){
        fileUpLoad();
        if (userService.updateUser(user)){
            msg="2";
        }else {
            msg="3";
        }
        return "updateUser";
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List getUlist() {
        return ulist;
    }

    public void setUlist(List ulist) {
        this.ulist = ulist;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
}
