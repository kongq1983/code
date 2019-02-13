package com.kq.base64;

import com.kq.code.util.StringCodeUtil;

/**
 * Created by qikong on 2019/2/10.
 */
public class Demo {


    public static void main(String[] args) throws Exception{
        String str = "a";
        String num = "1";
        // 97
        System.out.println(StringCodeUtil.stringToAscii(str));
        // 49
        System.out.println(StringCodeUtil.stringToAscii(num));



        System.out.println((char)97);


        String str1 = "国";

//        char[] str1.toCharArray();

//        byte[]  bs = str1.getBytes("gbk");

//        for(byte b : bs){
//            System.out.println(b);
//        }

        System.out.println(StringCodeUtil.stringToAscii(str1));

        int n = Integer.parseInt("B9FA",16);

        System.out.println("n="+n);

//        int n2 = Integer.parseInt("B9FA",2);
//        System.out.println("n2="+n2);

        //unicode 10进制 ：22269    gbk10进制：47610

        //1. 找到中文在操作系统中文字符编码的十进制代码
        //2. 十进制转换二进制
        //3. 对二进制进行重编码
        //4. 从base64编码表中查找其对应对字符

        // 101011011111101
        //转化前  0000 0000 0101 0110 1111 1101
        //转化中  000000 000101 011011  111101
        //转化后  00000000 00000101 00011011  00111101

        String b2 = Integer.toBinaryString(22269);
        System.out.println("b2="+b2);


        String strs = "00000000 00000101 00011011 00111101";

        String[] ss = strs.split(" ");

        for(String s : ss){

            int nn = Integer.parseInt(s,2);

            System.out.println("------"+s+"    nn="+nn );

        }




    }

}
