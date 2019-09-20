package com.example.demo.UdpSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpSocketServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8080);
        byte[] receiveData= new byte[64];
        DatagramPacket datagramPacket = new DatagramPacket(receiveData,receiveData.length);
        datagramSocket.receive(datagramPacket);
        System.out.println("数据是："+new String(datagramPacket.getData(),0,datagramPacket.getData().length));
        datagramSocket.close();

    }
}
