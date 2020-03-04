package com.arto;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws Exception {
//可能会有乱码问题 InputStream处理
      /*  FileReader fr1=new FileReader("D:\\Hello.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fr1, "utf-8");*/

        BufferedReader br=new BufferedReader(new FileReader("D:\\Hello.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Cry.txt"));

        String str;
        for(;(str=br.readLine())!=null;){
            bw.write(str);

        }

        br.close();
        bw.close();




      /*  FileReader fr=new FileReader("D:\\Hello.txt");
        char[] c1=new char[1024];
        int len;
        for(;(len=fr.read(c1))!=-1;){
            System.out.println(new String(c1,0,len));
        }
        fr.close();*/


     /*   BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\Hello.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\Cry.txt",true));
        byte[]b1=new byte[20];
        int a1;
        while ((a1=bis.read())!=-1){
            bos.write(a1);
        }
        bis.close();
        bos.close();*/

/*

           //文件copy
        FileInputStream fis=new FileInputStream("D:\\Hello.txt");
        FileOutputStream fos=new FileOutputStream("D:\\Cry.txt",true);
        int data;
        while((data=fis.read())!=-1){
         fos.write(data);
        }
        fis.close();
        fos.close();
*/


    /* //字节输出流
        try {
            byte[] b1={1,2};
            FileOutputStream fos=new FileOutputStream("D:\\copy.txt");
            fos.write(b1);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
*/

  /*      //字节输入流
        try {
            FileInputStream fps=new FileInputStream("D:\\Hello.txt");
            int a=fps.read();
            System.out.println((char)a);
        } catch (IOException e) {
            e.printStackTrace();
        }
              fps.close();
            */
    }
}
