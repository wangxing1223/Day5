package cn.wangxing;
//import java.lang.String;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-25.
 */
public class StringTest {

    public static void main(String[] args) {

        String s1 = new String("wangxing");
        char[] ch = new char[]{'a','b','c','d','e'};
        System.out.println(ch);
        System.out.println(s1.length());//length
        System.out.println(s1.charAt(3));//charAt
        s1.getChars(0,4,ch,0);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();

        String s3 = "lloeffdgdgsg";
        String s4 = "hello";
        String s5 = "AELLO";
        boolean b1 = s3.equals(s4);//equals
        boolean b2 = s3.equalsIgnoreCase(s5);//equalsIgnoreCase
        System.out.println("b1:    " + b1);
        System.out.println("b2:    " + b2);

        int number1 = s3.compareTo(s5);//compareTo
        int number2 = s3.compareToIgnoreCase(s5);//compareToIgnoreCase
        System.out.println("number1:    " + number1);
        System.out.println("number2:    " + number2);

        int number3 = s3.indexOf(97,-5);//indexOf
        System.out.println("number3:   " + number3);

        String s6 = s3.substring(3);//substring
        System.out.println("s6:    " + s6);
        String s7 = s3.substring(3,8);
        System.out.println("s7:    " + s7);

        String s8 = s3.concat(s4);//concat ：连接
        System.out.println("s8:    " + s8);

        String s9 = String.valueOf(ch);//valueOf
        String s10 = String.valueOf(ch,2,2);
        System.out.println("s9:    "+ s9 );
        System.out.println("s10:   " + s10 );


        String s11 = s3.replace( 'l', 'z' );//replace:替换
        System.out.println("s11:   " + s11);

        String s12 = s3.toUpperCase();//toUpperCase：变成大写
        System.out.println("s12:   " + s12);

        String s13 = s3.trim();//trim
        System.out.println("s13:  " + s13);

        String s14 = s3.toString();//toString
        System.out.println("s14  " + s14);

        ch = s3.toCharArray();//toCharArray
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();

        String s15 = s3.intern();//intern
        System.out.println("s15  " + s15);
    }


}
