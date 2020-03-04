package com.arto;

import java.io.BufferedReader;
import java.io.FileReader;

public class IODemo6 {
    public static void main(String[] args) throws  Exception {
       //1.D：\\Hello.java 与程序之间铺设管道
       // FileReader fr=new FileReader("D:\\Hello.java");
        BufferedReader br=new BufferedReader(new FileReader("D:\\Hello.java"));
       //2.放水
        char[]car=new char[1024];
        int len;
        for(;(len=br.read(car))!=-1;){
            System.out.println(new String(car,0,len));
        }
        br.close();

    }
}
