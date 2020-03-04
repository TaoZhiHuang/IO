package com.arto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IODemo7 {
    public static void main(String[] args) throws  Exception {
       //1.D：\\Hello.java 与程序之间铺设管道
        BufferedReader br=new BufferedReader(new FileReader("D:\\Hello.java"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\aaa.java"));
       //2.放水
        String str;
        for(;(str=br.readLine())!=null;){
            bw.write(str);
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
