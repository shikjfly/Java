/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro07.com.xzhao.arrays;

/**
 * 测试数组的三种初始化的方式
 * @author 施克箭
 */
public class Test02 {
  public static void main(String[] args) {
    //静态初始化
    int[] a = {1,2,4};
    User[] b = {
                  new User(0, "这是你"),
                  new User(1, "这是我"),
                  new User(2, "这是他")
               };
    
    //默认初始化
    int[] c = new int[3]; //默认赋值规则和成员变量一致，数字是0，布尔是false和true，另外对象是null
    
    //动态初始化
    int[] a1 = new int[2]; //动态初始化数组，先分配空间
    a[0] = 1; // 给数组元素赋值
    a[1] = 2; // 给数组元素赋值
  }
}