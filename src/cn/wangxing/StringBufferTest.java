package cn.wangxing; /**
 * Created by Administrator on 13-7-25.
 */
import java.lang.StringBuffer;
public class StringBufferTest {

    public static void main(String[] args) {

        StringBuffer buffer1 = new StringBuffer("hello,world!");

        System.out.println(buffer1.length());//length

        System.out.println(buffer1.capacity());//capacity

        buffer1.setLength(2400);//setLength

        System.out.println(buffer1.length());
        System.out.println(buffer1.charAt(1));//charAt

        buffer1.setCharAt(3,'a');//setCharAt
        System.out.println(buffer1);

        char[] ch = new char[]{'a','b','c','d','e'};
//        buffer1.getChars(1,4,ch,2);//getChars
//        System.out.println(ch);

//        buffer1.reverse();//reverse
//        System.out.println(buffer1);
//
//        buffer1.append('s');//append
//        System.out.println(buffer1);
//        buffer1.append(false);
//        System.out.println(buffer1);
//        buffer1.append("asdsfdsf");
//        System.out.println(buffer1);
//        buffer1.append(ch);
//        System.out.println(buffer1);//append

        buffer1.insert(3,true);//insert
        System.out.println(buffer1);
        buffer1.insert(2,ch,2,3);
        System.out.println(ch);
        System.out.println(buffer1);
        buffer1.insert(3,ch,0,3);
        System.out.println(buffer1);

//        buffer1.delete(3,4);//delete
//        System.out.println(buffer1);
//        buffer1.deleteCharAt(5);
//        System.out.println(buffer1);

    }
}
