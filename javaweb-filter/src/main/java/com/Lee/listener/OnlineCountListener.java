package com.Lee.listener;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCountListener implements HttpSessionListener {
    //创建session监听:看你的一举一动
    //一旦创建一个session，就会触发一个事件
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext ctx =se.getSession().getServletContext();
        Integer onlieCount = (Integer) ctx.getAttribute("onlieCount");

        if(onlieCount==null){
            onlieCount = new Integer(1);
        }else{
            int count = onlieCount.intValue();
            onlieCount = new Integer(count+1);
        }

        ctx.setAttribute("onlieCount",onlieCount);
    }
    //销毁session监听
    //一旦session销毁，就会触发一个事件
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext ctx =se.getSession().getServletContext();
        Integer onlieCount = (Integer) ctx.getAttribute("onlieCount");

        if(onlieCount==null){
            onlieCount = new Integer(1);
        }else{
            int count = onlieCount.intValue();
            onlieCount = new Integer(count-1);
        }

        ctx.setAttribute("onlieCount",onlieCount);
    }
}
