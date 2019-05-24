package cc.openhome.trycatch;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) { 
        double sum = 0;
        int count = 0;
        while (true) {            
            int num = nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;                            
        }
        System.out.printf("平均 %.2f%n", sum/count);     
    }   
    static Scanner console = new Scanner(System.in);
    static int nextInt() {
        String input = console.next();
        while (!input.matches("\\d*")) {            
            System.out.println("请输入数字：");
            input = console.next();
        }
        return Integer.parseInt(input);
    }
}
