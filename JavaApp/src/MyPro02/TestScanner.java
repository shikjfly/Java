package MyPro02;

import java.util.Scanner;

/**
 *  测试获得键盘输入
 * @author 施克箭
 */
public class TestScanner {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.nextLine();
        System.out.println("请输入爱好：");
        String favor = scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        
        System.out.println("################");
        System.out.printf("姓名：%s；%n爱好：%s；%n年龄：%d%n" ,name, favor, age);
    }   
  
}
