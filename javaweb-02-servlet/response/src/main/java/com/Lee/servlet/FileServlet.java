package com.Lee.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1. 要获取下载文件的路径
        String realPath = "C:\\Users\\Administrator\\IdeaProjects\\javaweb-02-servlet\\response\\target\\classes\\2.jpg";
        System.out.println("下载文件的路径：" + realPath);
//        2. 下载的文件名是什么
        String fileName = realPath.substring(realPath.indexOf("\\") + 1);
//        3. 设置想办法让浏览器支持我们需要下载的东西
        resp.setHeader("Content-Disposition", "attachment;filename" + fileName);
//        4. 获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
//        5. 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
//        6. 获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
//        7. 将FileOutputStream流写入到buffer缓冲区,使用OutputStream将缓冲区中的数据输出到客户端
        while ((len=in.read(buffer))!=-1){
            out.write(buffer,0,len);
        }

        out.close();
        in.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
