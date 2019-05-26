package MyPro03;

/**
 * 测试嵌套循环
 * @author 施克箭
 */
public class TestNested {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + " " + i + " " + i + " " + i + " " + i);
//        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
        //九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%2d  ", i, j, i*j);
            }
            System.out.println();
        }
        System.out.println("###########练习###############");
        //用while循环分别计算100以内的奇数和偶数和，并输出
        int i = 1;
        int sumEven = 0;
        int sumOdd = 0;
        while (i<=100) {            
            if (i%2 == 1) { 
                sumOdd += i; //奇数和
            }else{
                sumEven += i; //偶数和
            }
            i++;
        }
        System.out.printf("奇数和：%d；偶数和：%d %n", sumOdd,sumEven);
        //用while循环活其它循环输出1-1000之间，可以被5整除的数，且每行输出5；
        System.out.println("###########练习###############");
        int k=0;
        for (int j = 1; j <= 1000; j++) {
            if (j%5==0) {
                System.out.printf("%5d", j);
                k++;
            }
            if (k == 5) {
                System.out.println();
                k = 0;
            }
        }
    }
}
