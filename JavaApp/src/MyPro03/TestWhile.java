package MyPro03;

/**
 * 测试while语句
 * @author 施克箭
 */
public class TestWhile {
    public static void main(String[] args) {
        //计算1+2+3+...+100的累计和.5050.
        //暴力！
        int i = 1;
        int sum = 0;
        while (i<=100) {            
            sum += i;
            i++;
        }
        System.out.println("1+2+3+...+100的累计和：" + sum);
        
        int i2 = 1;
        int sum2 = 0;
        do {            
            sum2 += i2;
            i2++;
        } while (i2<=100);        
        System.out.println("1+2+3+...+100的累计和：" + sum2);   
    }
}
