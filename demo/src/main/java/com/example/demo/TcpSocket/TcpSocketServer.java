package com.example.demo.TcpSocket;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[64];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("server 接收到的数据 ".getBytes());
        socket.close();
    }
}
