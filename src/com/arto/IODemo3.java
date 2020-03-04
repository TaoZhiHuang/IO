package com.arto;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 实现文件拷贝--免费版
 */
public class IODemo3 {
    public static void main(String[] args) throws  Exception {
        long startName=System.currentTimeMillis();
        FileInputStream fio=new FileInputStream("D:\\dog.jpg");
        FileOutputStream fos=new FileOutputStream("E:\\dog.jpg",true);
        int data1;
        for(;(data1=fio.read())!=-1;){
          fos.write(data1);
        }
        fio.close();
        fos.close();
        long endName=System.currentTimeMillis();
        long time=endName-startName;
        System.out.println("共消耗"+time+"秒");
    }
}
