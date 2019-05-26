/*

整数运算：
1、如果两个操作数有一个是Long，则结果也是Long。
2、没有Long时，结果为int，即使操作数全为short、byte，结果也是int。
浮点运算：
1、如果两个操作数，有一个为double，则结果为double。
2、如果两个数都是float，则结果为float。

*/
package MyPro02;

/**
 *用来测试算术运算符
 * @author 施克箭
 */
public class TestOperator01 {

    public static void main(String[]/* args是参数名，可以更改 */ args) {
       
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        //short ab = a + b; //报错，a+b是int类型，不能转化为short，会丢失精度
        //byte ac = a + c; //报错
        //int cd = c + d; //报错

        float f1 = 3.14F; //不加F会报错，因为3.14默认是double类型
        float f2 = f1 + 52;
        
        //float f3 = f1 + 5.2; //报错，因为5.2默认是double类型，float装不下double
        float f3 = (float)(f1 + 5.2); 
        
        System.out.println(-9%5);
        
        //测试自增和自减
        int x = 3;
        int y = x++; //执行完后，y=3。 x先给y赋值，然后再自增。
        System.out.println("x=" + x + "\ny=" + y);
        x = 3;
        y = ++x;   //执行完后，y=4。 x先自增，再给y赋值。     
        System.out.println("\nx=" + x + "\ny=" + y);
    }   
  
}
