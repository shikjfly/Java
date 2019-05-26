/*

*/
package MyPro02;

/**
 *位运算符
 * @author 施克箭
 */
public class TestOperator04 {

    public static void main(String[]args) {
        int a = 3;
        int b = 4;
        System.out.println(a&b); 
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        
        //移位
        int c = 3<<2;
        System.out.println(c);//3*2*2  = 12
        System.out.println(12>>1); //12/2 = 6
    }   
  
}
