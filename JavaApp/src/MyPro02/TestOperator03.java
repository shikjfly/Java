/*

*/
package MyPro02;

/**
 *用来测试逻辑运算符
 * @author 施克箭
 */
public class TestOperator03 {

    public static void main(String[]args) {
        
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2); //false
        System.out.println(b1 | b2); //true
        System.out.println(b1 ^ b2); //true  两个不一样为true
        System.out.println(! b2); //true
        
        //短路
        //int c = 3/0;
        boolean b3 = 1 > 2 && 2 < (3/0); //&&短路与，第一个操作数为false，则不需要再计算后面的操作数
        System.out.println(b3);
    }   
  
}
