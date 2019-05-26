/*
                     char
                      |
                      |
byte ---> short ---> int ---> long                     
                      |*     *  |
                      |   *     |                    
                      | *    *  |
                    float ---> double

*/
package MyPro02;

/**
 * 测试自动类型转化 强制类型转换
 * @author 施克箭
 */
public class TestTypeConvert {
    public static void main(String[]args) {
        int a = 324;
        long b = a;
        double c = b;
        //a = b; //报错
        //long e = 3.23f; //报错
        float f = 234556L;
        
        //特例
        byte b2 = 123; //123是int类型，在byte范围
        //byte b3 = 1230; 报错，超出范围
        
        //强制类型转换
        double x = 3.14;
        int nx = (int)x; //值为3，直接去掉小数点，不用四舍五入
        char y = 'a';
        int  ny = y+1;
        System.out.println(nx); //3
        System.out.println(ny); // 98
        System.out.println((char)ny); //b
    }   
  
}
