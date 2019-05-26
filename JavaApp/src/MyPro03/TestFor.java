package MyPro03;

/**
 * 测试for循环
 * @author 施克箭
 */
public class TestFor {
    public static void main(String[] args) {
        //计算1+2+3+...+100的累计和.5050.
        //暴力！
//        int i = 1;
//        int sum = 0;
//        while (i<=100) {            
//            sum += i;
//            i++;
//        }

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+100的累计和：" + sum);
        
        for (int i = 0, j = 0; i < 10; i++,j = i*2) {
            System.out.println("i="+i+" j="+j);
        }
          
        for(;;){ //while(true){
            System.out.println("爱你到永远！！");
        }
    }
}
