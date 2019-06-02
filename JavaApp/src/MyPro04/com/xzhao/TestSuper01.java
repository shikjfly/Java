/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro04.com.xzhao;

/**
 * 测试super用法
 * @author 施克箭
 */
public class TestSuper01 {
  public static void main(String[] args) {
    new ChildClass().f();
  }
}

class FatherClass {
  public int value;
  
  public void f() {
    value = 100;
    System.out.println("FatherClass.value=" + value);
  }
}

class ChildClass extends FatherClass {
  public int value;
  
  public void f() {
    super.f(); //调用父类对象的普通方法
    value = 200;
    System.out.println("ChildClass.value=" + value);
    System.out.println(value);
    System.out.println(super.value);//调用父类对象的成员变量
  }
}

