package com.arto;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo2 {
    public static void main(String[] args) throws  Exception {
        String str= "hello java";
        FileOutputStream fos=new FileOutputStream("E:\\demo.txt",true);
        byte[] bytes=str.getBytes("UTF-8");
        System.out.println(bytes);
        fos.write(bytes);
        fos.close();
    }
}
