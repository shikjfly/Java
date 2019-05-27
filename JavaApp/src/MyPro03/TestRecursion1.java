package MyPro03;

/**
 * 递归测试
 * @author 施克箭
 */
public class TestRecursion1 {
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n", 10, factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归耗时：%sms%n", d2-d1);
        
        System.out.println("#################");
        
        long d3 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n", 10, factorialLoop(10));
        long d4 = System.currentTimeMillis();
        System.out.printf("for循环耗时：%sms%n", d4-d3);
        
    }
    /*求阶乘的方法*/
    static long factorial(int n){
        if (n == 1) { //递归头
            return 1;
        }else{ //递归体
            return n * factorial(n-1); //n! = n * (n-1)!
        }
    }
    /*求阶乘的方法2*/
    static long factorialLoop(int n){
        int SumOfMultiplication = 1;
        for (int i = 2; i < n; i++) {
            SumOfMultiplication *= i;
        }
        return SumOfMultiplication;
    }
}
