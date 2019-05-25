/*
类型     占用存储空间      数字范围
float       4字节       -3.403E38 ~ 3.403E38
double      8字节       -1.798E308 ~ 1.798E308
 */
package MyPro02;

import java.math.BigDecimal;

/**
 *测试浮点型
 * @author 施克箭
 */
public class TestPrimitiveDataType1 {
    public static void main(String[] args) {
        float a = 3.14F; //默认是double类型，要转化为float，必须加F
        double b = 6.28;
        double c = 628E-2;
        System.out.println(c);
        
        //浮点数是不精确的，一定不要用于比较
        float f = 1.0F;
        double d = 1.0/10;
        System.out.println(f==d); //结果为false
        
        float d1 = 42888245f;
        float d2 = d1 + 1;
        if (d1 == d2) {
            System.out.println("d1 == d2");
        }else{            
            System.out.println("d1 != d2");
        }
        
        System.out.println("###############");
        //使用精确浮点运行，推荐：BigDecimal
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd); //0.5
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); //0.5000000000000001
        
        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0/10);
        System.out.println(bd2.equals(bd3));
    }
}
