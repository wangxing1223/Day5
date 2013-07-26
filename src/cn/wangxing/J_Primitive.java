package cn.wangxing;

/**
 * Created by Administrator on 13-7-25.
 */
public class J_Primitive {

    private int a = 0;

    public static void mb_method(J_Primitive j_primitive){

        System.out.println("在a++之前方法参数 a = "+j_primitive.a);
        j_primitive.a++;
        System.out.println("在a++之后方法参数 a = "+ j_primitive.a);
    }

    public static void main(String[] args) {
        J_Primitive j_primitive = new J_Primitive();
        System.out.println("在方法调用之前 i = " + j_primitive.a);
        mb_method(j_primitive);
        System.out.println("在方法调用之后 i = " + j_primitive.a);
    }

//    public static void mb_method(int a){
//
//        System.out.println("在a++之前方法参数 a = "+a);
//        a++;
//        System.out.println("在a++之后方法参数 a = "+a);
//    }
//
//    public static void main(String[] args) {
//        int i = 0;
//        System.out.println("在方法调用之前 i = " + i);
//        mb_method(i);
//        System.out.println("在方法调用之后 i = " + i);
//    }
}
