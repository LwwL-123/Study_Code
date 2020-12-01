package com.Lee.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements javax.servlet.Filter {
    //初始化
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化了");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/hrml;charset=utf-8");

        System.out.println("CharacterEncodingFilter执行前。。。");
        //让我们的请求继续走，如果不写，程序到这里就停止了
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("CharacterEncodingFilter执行后。。。");

    }
    //销毁
    public void destroy() {
        System.out.println("CharacterEncodingFilter销毁了");
    }
}
