package com.company.bio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class QQServer {
    static byte[] bytes = new byte[1024];
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();//socket
        serverSocket.bind(new InetSocketAddress(80));
        //阻塞（当前线程放弃cpu资源，得不到cpu，代码不会向下执行，操作系统内核就不会管它，一直等待
        //直到有连接连接到，操作系统会解阻塞，会执行以下方法
        System.out.println("wait");
        //服务器端的第二个socket，用来向客户端发送数据
        Socket accept = serverSocket.accept();
        System.out.println("连接成功");
        System.out.println("等待发送数据");
        //read 会发生阻塞
        int read = accept.getInputStream().read(bytes);
        String content = new String(bytes);
        System.out.println("发送数据成功"+content);

    }
}
