/*

*/
package MyPro02;

/**
 *测试关系运算符
 * @author 施克箭
 */
public class TestOperator02 {

    public static void main(String[] args) {
       
        int a = 3;
        System.out.println(a == 3); //true
        System.out.println(a != 3); //false
        System.out.println(a < 5); //true
       
        char b = 'a';
        char b2 = 'c';
        System.out.println((int)b); //97  强制转换
        System.out.println(0+b2);  //99   有int类型，就生成int类型
        System.out.println(b<b2);  //b<b2 ---> 97<99 ---> true
    }   
  
}
