package com.example.demo.UdpSocket;


import java.io.IOException;
import java.net.*;

public class UdpSocketClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] sendData = "yesbuter".getBytes();
        InetAddress inetAddress  = InetAddress.getLocalHost();
        DatagramPacket datagramPacket= new DatagramPacket(sendData,sendData.length,inetAddress,8080);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();

    }
}
