package com.arto;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


/**
 * 实现文件拷贝--收费版
 */
public class IODemo4 {
    public static void main(String[] args) throws  Exception {
       // InputStream fis=new FileInputStream("D:\\Hello.java");
        //在程序和水厂之间铺设一个管道
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream("D:\\Hello.java"));
        //在程序和E盘之间建立一个管道
        BufferedOutputStream bos=
                new BufferedOutputStream(new FileOutputStream("E:\\Hello.java",true));
        //创建一辆装砖头的车
        byte[] car =new byte[500];
        //防水，将数据装车，开车+

        int len = 0;
        for (;(len=bis.read(car))!=-1;) {
          //  System.out.println("len="+len);
            bos.write(car,0,len);
        }
        bis.close();
        bos.close();

    }
}
