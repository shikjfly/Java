/*

类型     占用存储空间      数字范围
byte       1字节       -2*10e7 ~ 2*10e7 -1 （-128 ~ 127）  1字节是8位，为什么是2的7次方，因为有一个位数是用来放正负号，所以7位，那为什么是127呢，也就是-1说的是0
short      2字节       -2*10e15 ~ 2*10e15 -1 （-32768 ~ 32767） 约三万左右
int        4字节       -2*10e31 ~ 2*10e31 -1 （约21亿）
long       8字节       -2*10e63 ~ 2*10e63 -1 （）

 */
package MyPro02;

/**
 *测试基本数据类型
 * @author 施克箭
 */
public class TestPrimitiveDataType {
    public static void main(String[] args) {
        //测试整型变量
        int a = 15;
        int b = 015; //以数字0开头是八进制
        int c = 0x15; //以数字0x开头是十六进制
        int d = 0b1101; //以数字0b或者大写0B开头是二进制
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        byte age = 30;//整型常量默认是int类型，30是int类型，范围在byte内，所以会自动转化为byte，如果是300，那就不可以了，因为超出了byte范围
        short salary = 30000;
        int population = 2000000000; //整型常量默认是int类型
        long globalPopulation = 7400000000L; //后面加L就是说这是一个long类型
        
    }
}
