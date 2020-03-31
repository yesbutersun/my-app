package com.yesbuter.demo;

import com.yesbuter.demo.annotation.Check;
import com.yesbuter.demo.annotation.ParamCheck;
import com.yesbuter.demo.vo.Account;

import java.io.*;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;
import java.util.Properties;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, IOException, NoSuchAlgorithmException {

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update("hello".getBytes(StandardCharsets.UTF_8));
        messageDigest.update("world".getBytes(StandardCharsets.UTF_8));
        messageDigest.update("java".getBytes(StandardCharsets.UTF_8));
        byte[] result = messageDigest.digest();
        System.out.println(new BigInteger(1, result).toString(16));
        System.out.println(result);

        String url = URLEncoder.encode("中文", "utf-8");
        System.out.println(url);
        byte[] bytes = {'1', 'a', 'A'};
        byte[] byte1;
        byte1 = Base64.getEncoder().encode(bytes);
        System.out.println(byte1);


/*        "AaAaAa".hashCode(); // 0x7460e8c0
        "BBAaBB".hashCode(); // 0x7460e8c0*/
        System.out.println("hello wold".hashCode());
        System.out.println("AaAaAa".hashCode());
        System.out.println("BBAaBB".hashCode());

        String path = Main.class.getResource("/test.properties").getPath();
        try (InputStream inputStream = new FileInputStream(path)) {
            int n;
            byte[] buffer = new byte[1000];
            while ((n = inputStream.read(buffer)) != -1) {
                System.out.println(n);
            }
        }

        try (OutputStream outputStream = new FileOutputStream(path)) {
            String str = "hello world";
            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(path))) {
            String str = "hello world";
            zipOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            zipOutputStream.flush();
        }

        Properties properties = new Properties();
        //String path = Main.class.getResource("/test.properties").getPath();
        File file = new File(path);
        properties.load(new FileInputStream(file));
        properties.getProperty("name");
        System.out.println(properties.getProperty("name"));
        System.out.println(Main.class.getClassLoader().getResource(""));
        System.out.println(Main.class.getResource("/").getPath());
        String path1 = Main.class.getResource("/").getPath();
        //System.out.println(path1);
        System.out.println(Objects.hash("yesbuter"));
        Account account = new Account();
        account.setId(3);
        account.setMoney(1000);
        Account account1 = new Account();
        account1.setId(3);
        account1.setMoney(1000);
        System.out.println(Objects.equals(account, account1));
        account.setUserName("xixi");
        account.getClass().isAnnotationPresent(ParamCheck.class);
        ParamCheck paramCheck = account.getClass().getAnnotation(ParamCheck.class);
        Check check = new Check();
        check.checkParam(account);
    }
}
