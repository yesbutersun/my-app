package com.example.demo.IOStream;

import sun.nio.cs.ext.GBK;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteStream {
    public static void main(String[] args) throws IOException {

        String str = "中国";
        byte[] bytes1 = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(new String(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(new String(bytes2));

        ByteStream byteStream = new ByteStream();
        byteStream.read();
        byteStream.write();
    }

    private void read() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("123.txt")) ;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] bytes = new byte[64];
        //fileInputStream.read(bytes);
        while((bufferedInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,64));
        }
        fileInputStream.close();
    }

    private void write() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("123.txt")) ;
        byte[] bytes = new byte[64];
        fileOutputStream.write(bytes);
        System.out.println(new String(bytes,0,64));
        fileOutputStream.close();
    }
}
