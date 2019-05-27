package MyPro03;

/**
 * 递归测试
 * @author 施克箭
 */
public class TestRecursion {
    public static void main(String[] args) {
        a();
    }
    static int count = 0;
    static void a(){
        System.out.println("a");
        count++;
        if (count < 10) { //递归头
            a(); //递归体
        }else{
            return;
        }
    }
    static void b(){
        System.out.println("b");
    }
}
