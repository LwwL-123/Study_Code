package com.Lee.servlet;

import com.Lee.pojo.person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到Session
        HttpSession session = req.getSession();
        //在Session中存东西
        session.setAttribute("person1",new person("lzw",8));
        //获取session的id
        String sessionId = session.getId();
        //判断session是不是新创建
        if(session.isNew()){
            resp.getWriter().write("session创建成功,id+"+sessionId);
        }else {
            resp.getWriter().write("session已经在服务器中存在，id"+sessionId);
        }

        //session创建的时候做了什么事情
        Cookie cookie = new Cookie("JESSIONID", sessionId);
        resp.addCookie(cookie);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
