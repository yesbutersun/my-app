package com.example.demo.TcpSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpSocketClient {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        Socket socket = new Socket(inetAddress.getHostAddress(), 8080);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("TCP client".getBytes());

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[64];
        int len = inputStream.read(bytes);
        System.out.println("接收到的数据是：" + new String(bytes,0,len));
        socket.close();
    }
}
