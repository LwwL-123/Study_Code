package com.Lee.lesson2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

public class TcpClientDemo02 {
    public static void main(String[] args) throws IOException {
        //1.创建一个socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        //2.创建一个输出流
        OutputStream os = socket.getOutputStream();

        //3.读取文件
        FileInputStream fis = new FileInputStream(new File("2.jpg"));
        //4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }

        //确定


        //5.关闭
        fis.close();
        os.close();
        socket.close();

    }
}
