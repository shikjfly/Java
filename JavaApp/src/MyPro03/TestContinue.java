package MyPro03;

/**
 * 测试循环语句中的continue
 * @author 施克箭
 */
//把100-150之间，不能被3整除的数输出，并且每行输出5个
public class TestContinue {
    public static void main(String[] args) {
        int k = 0; //计数器
        for (int i = 100; i <= 150; i++) {
            if (i%3 == 0) {
                continue;
            }
            System.out.print(i + "\t");
            k++;
            if (k == 5) { // if (k%5 == 0) {
                System.out.println();//5个之后换行
                k=0;
            }
        }
        System.out.println();
    }
}
