/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro02;

/**
 *测试常量
 * @author 施克箭
 */
public class TestConstant {
    public static void main(String[] args) {
        int age = 18;
        final String NAME = "shikejian"; //final修饰的NAME称为符号常量，常量的命名规则要全部大写

        final double PI = 3.14;
        //PI = 3.15;//报错，final常量不能再被赋值！
        double r = 4;
        double area = PI * r * r;
        double circle = 2 * PI * r;
        System.out.println(area);
        System.out.println(circle);      
        
    }
}
