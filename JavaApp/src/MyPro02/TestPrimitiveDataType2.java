/*

类型     占用存储空间      数字范围
char      2字节       -2*10e15 ~ 2*10e15 -1 （-32768 ~ 32767） 约三万左右
boolean   1位          true / false ---0/1

 */
package MyPro02;

/**
 *测试字符类型和布尔类型
 * @author 施克箭
 */
public class TestPrimitiveDataType2 {
    public static void main(String[] args) {
        char a = 'T';
        char b = '施';
        char c = '\u0061'; //u表示Unicode编码
        System.out.println(c);
        
        //转义字符
        System.out.println('a' + 'b'); //+自动把char转化为数字
        System.out.println(""+'a' + 'b'); //加空字符串，转为String
        System.out.println(""+'a' + '\t' + 'b'); //a    b
        System.out.println(""+'a' + '\'' + 'b'); //a'b
        
        //String 就是字符序列，字符组成的序列
        String d = "abc";
        
        
        //测试布尔类型
        boolean man = true;
        
        if (man) {  //极度不推荐 man == true这样的写法
            System.out.println("男性");
        }
    }
}
