/*

*/
package MyPro02;

/**
 * 字符串运算符
 * @author 施克箭
 */
public class TestOperator05 {

    public static void main(String[]args) {
        String a = "3";
        int b = 4;
        int c = 5;
        char d = 'a';
        
        System.out.println(a+b);  //"34"
        System.out.println(a+c); //"35"
        System.out.println(b+c); //9
        System.out.println(a+b+c); //"345"
        System.out.println(b+c+a); //"93"
        System.out.println(d); //'a'
        System.out.println(d+4); //97+4  ---> 101
    }   
  
}
