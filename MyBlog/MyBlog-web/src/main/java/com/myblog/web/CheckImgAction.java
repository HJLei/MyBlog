package com.myblog.web;

import com.myblog.entity.Users;
import com.myblog.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Random;

@Controller("checkImgAction")
@Scope("prototype")
public class CheckImgAction extends ActionSupport{
    private String mytime;
    /**定义属性，封装请求数据*/
    private Users user;
    private List ulist;
    private int msg;

    /**声明需要依赖的服务层*/
    @Resource(name="userService")
    private IUserService userService;
    @Override
    public String execute() throws Exception{
        int width = 120;
        int height = 30;

        // 步骤一 绘制一张内存中图片
        BufferedImage bufferedImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);

        // 步骤二 图片绘制背景颜色 ---通过绘图对象
        Graphics graphics = bufferedImage.getGraphics();// 得到画图对象 --- 画笔
        // 绘制任何图形之前 都必须指定一个颜色
        graphics.setColor(getRandColor(200, 250));
        graphics.fillRect(0, 0, width, height);

        // 步骤三 绘制边框
        graphics.setColor(Color.WHITE);
        graphics.drawRect(0, 0, width - 1, height - 1);

        // 步骤四 四个随机数字
        Graphics2D graphics2d = (Graphics2D) graphics;
        // 设置输出字体
        graphics2d.setFont(new Font("宋体", Font.BOLD, 18));

        String words ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Random random = new Random();// 生成随机数
        // 定义StringBuffer
        StringBuffer sb = new StringBuffer();
        // 定义x坐标
        int x = 10;
        for (int i = 0; i < 4; i++) {
            // 随机颜色
            graphics2d.setColor(new Color(20 + random.nextInt(110), 20 + random
                    .nextInt(110), 20 + random.nextInt(110)));
            // 旋转 -30 --- 30度
            int jiaodu = random.nextInt(60) - 30;
            // 换算弧度
            double theta = jiaodu * Math.PI / 180;

            // 生成一个随机数字
            int index = random.nextInt(words.length()); // 生成随机数 0 到 length - 1
            // 获得字母数字
            char c = words.charAt(index);
            sb.append(c);
            // 将c 输出到图片
            graphics2d.rotate(theta, x, 20);
            graphics2d.drawString(String.valueOf(c), x, 20);
            graphics2d.rotate(-theta, x, 20);
            x += 30;
        }

        // 将生成的字母存入到session中
        ServletActionContext.getRequest().getSession().setAttribute("checkcode", sb.toString());

        // 步骤五 绘制干扰线
        graphics.setColor(getRandColor(160, 200));
        int x1;
        int x2;
        int y1;
        int y2;
        for (int i = 0; i < 30; i++) {
            x1 = random.nextInt(width);
            x2 = random.nextInt(12);
            y1 = random.nextInt(height);
            y2 = random.nextInt(12);
            graphics.drawLine(x1, y1, x1 + x2, x2 + y2);
        }

        // 将上面图片输出到浏览器 ImageIO
        graphics.dispose();// 释放资源
        ImageIO.write(bufferedImage, "jpg", ServletActionContext.getResponse().getOutputStream());
        return null;
    }
    /**
     * 取其某一范围的color
     *
     * @param fc
     *            int 范围参数1
     * @param bc
     *            int 范围参数2
     * @return Color
     */
    private Color getRandColor(int fc, int bc) {
        // 取其随机颜色
        Random random = new Random();
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

    //接收验证码
    private String checkcode;
    /**
     * 用户注册方法：
     */
    public String regist(){
        //判断验证码程序
        //从Session中获得验证码的随机值
        String checkcode1 =(String)ServletActionContext.getRequest().getSession().getAttribute("checkcode");
       if(!checkcode.equalsIgnoreCase(checkcode1)){
            this.addActionError("验证码输入错误!");
            return "checkcodeFail";
        }else if(userService.addUser(user)){       //验证码通过则执行注册
            msg=1;
        }else {
            msg=-1;
        }
        return "addSuccess";
    }
    public String getMytime() {
        return mytime;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }
    public void setMytime(String mytime) {
        this.mytime = mytime;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List getUlist() {
        return ulist;
    }

    public void setUlist(List ulist) {
        this.ulist = ulist;
    }

    public int getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String getCheckcode() {
        return checkcode;
    }
}
