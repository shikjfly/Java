/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro07.com.xzhao.arrays;

/**
 * 测试数组的用法
 * @author 施克箭
 */
public class Test01 {
  public static void main(String[] args) {
    int[] arr1 = null; //声明数组
    arr1 = new int[10]; //给数组分配空间
    //通过循环给数组赋值
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = i+1;
    }
    //通过循环读取数组里面元素的值
    for (int i : arr1) {
      System.out.println(i);
    }
    //arr1[11] = 12;//java.lang.ArrayIndexOutOfBoundsException
    
    String[] arr2 = new String[5];
    User[] arr3 = new  User[3];
    arr3[0] = new User(100, "张三");
    arr3[1] = new User(100, "李四");
    arr3[2] = new User(100, "王五");
    for (User user : arr3) {
      System.out.println(user.getName());
    }
  }
}

class User{
  private int id;
  private String name;

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
