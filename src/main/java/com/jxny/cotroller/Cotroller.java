package com.jxny.cotroller;

import com.jxny.service.impl.UserServiceImpl;
import com.jxny.userForm.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

@Controller
public class Cotroller {
    Cotroller(){
        System.out.println("构建完成");
    }
    @RequestMapping(value = "user/do")
    @ResponseBody
    public Boolean frist(String phnum, String username, String password) throws IOException {
      User user=new User(phnum,username,password);
        UserServiceImpl impl = new UserServiceImpl();
       if( impl.register(user)){
           impl.add(user);
           return true;
       }
        return false;
    }
@RequestMapping(value = "users")
public String frist1(String username, String password, HttpServletRequest request,HttpServletResponse response) throws IOException {
    request.setCharacterEncoding("utf-8");//由于数据传输名原因username=phnum  name1=username
    response.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=UTF-8");
    String name1 = request.getParameter("username");
    String pwd = request.getParameter("pwd");
    PrintWriter out = response.getWriter();
    String scode=(String)request.getSession().getAttribute("scode");
    String code=request.getParameter("code");
    System.out.println("xxxxxxxx"+scode);
    System.out.println("---------"+code);
    System.out.println("xxxxxxxx"+username);
    System.out.println("---------"+password);
    User user=new User(username,password);
    UserServiceImpl impl = new UserServiceImpl();
    if(impl.islogin(user)){
        if(scode.equalsIgnoreCase(code)){
            HttpSession session = request.getSession();
            session.setAttribute("login", name1);//
            return "/index";
        }else{
            request.setAttribute("msg", "msg");
            return "/login1";
        }
    }
    request.setAttribute("error","false");
    return "/login1";
}
@RequestMapping(value = "code")
    public void  frist2(HttpServletResponse response,HttpServletRequest request) throws IOException {
//    response.setHeader("pragma", "no-cache");
//    response.setHeader("cache-control", "no-cache");
//    response.setIntHeader("expires", 0);
//    ValidateCode vc = new ValidateCode(110, 25, 4, 9);
//    String scode = vc.getCode();
//    request.getSession().setAttribute("scode", scode);
//    vc.write(response.getOutputStream());
    int width = 110;
    int height = 25;
    //在内存中创建一个图像对象
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    //创建一个画笔
    Graphics g = img.getGraphics();

    //给图片添加背景色
    g.setColor(Color.PINK);//设置一个颜色
    g.fillRect(1, 1, width-2, height-2);//填充颜色

    //给边框一个色
    g.setColor(Color.RED);
    g.drawRect(0, 0, width-1, height-1);//设置边框的显示坐标

    //设置文本样式
    g.setColor(Color.BLUE);
    g.setFont(new Font("宋体", Font.BOLD|Font.ITALIC, 15));

    //给图片添加文本
    Random rand = new Random();
    int position = 20;
    String scope="";
    for (int i = 0; i < 4; i++) {
       int j= rand.nextInt(10);
        g.drawString(j+"", position, 20);//给图片填充文本
        position+=20;
        scope=scope+j;
    }

    //添加9条干扰线
    for (int i = 0; i < 9; i++) {
        g.drawLine(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height));
    }

    request.getSession().setAttribute("scode",scope);
    //将图片对象以流的方式输出的客户端
    ImageIO.write(img, "jpg", response.getOutputStream());
    }
}
