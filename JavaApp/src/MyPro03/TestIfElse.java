/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro03;

/**
 * 测试if else双选择结构
 * @author 施克箭
 */
public class TestIfElse {
    public static void main(String[] args) {
        double d = Math.random(); //返回【0,1)之间的随机数  0=<x<1
        System.out.println(d);
        
        int h = (int)(6*Math.random()) + 1; //0-6的随机数
        System.out.println(h);
        if (h<=3) {
            System.out.println("小");
        }else{
            System.out.println("大");
        }
        
        System.out.println("#######################");
        //随机产生一个【0,4）区间的半径，然后计算周长和面积
        double r = 4 * Math.random();
        double area = Math.PI * Math.pow(r, 2);
        double circle = 2 * Math.PI * r;
        System.out.printf("半径：%f；面积：%f；周长：%f；%n", r, area, circle);
        if (area >= circle) {
            System.out.println("面积大于等于周长");
        }else{
            System.out.println("周长大于面积");
        }
        
    }
}
