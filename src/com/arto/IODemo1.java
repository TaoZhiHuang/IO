package com.arto;

import java.io.FileInputStream;

public class IODemo1 {
    public static void main(String[] args) throws  Exception {
        FileInputStream  fio =new FileInputStream("D:\\Hello.java");
        int data1;
        for(;(data1=fio.read())!=-1;){
                System.out.println((char)data1);
        }
        fio.close();


    }
}
