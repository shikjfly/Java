package MyPro03;

/**
 * 测试带标签的break和continue
 * @author 施克箭
 */
//把101-150之间之间所有的质数，也就是只能被自己和1整除的数
public class TestLabelContinue {
    public static void main(String[] args) {
        outer:for (int i = 101; i <= 150; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    continue outer; //如果没有加laber，那么continue跳转的只是内部循环
                }
            }
            System.out.println(i+"\t");
        }
    }
}
