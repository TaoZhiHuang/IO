package com.arto;

import java.io.FileInputStream;
import java.io.FileReader;

public class IODemo5 {
    public static void main(String[] args) throws  Exception {
       //1.D：\\Hello.java 与程序之间铺设管道
        FileReader fr=new FileReader("D:\\Hello.java");
       //2.放水
        char[]car=new char[1024];
        int len;
        for(;(len=fr.read(car))!=-1;){
            System.out.println(new String(car,0,len));
        }
        fr.close();

    }
}
