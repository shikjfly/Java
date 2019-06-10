/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro04.com.xzhao.abstracts;

/**
 *测试匿名内部类
 * @author 施克箭
 */
public class TestAnonymousInnerClass {
  public static void test01(AA a){
    System.out.println("MyPro04.com.xzhao.abstracts.TestAnonymousInnerClass.test01()");
    a.aa();
  }
  public static void main(String[] args) {
    TestAnonymousInnerClass.test01(new AA(){
      @Override
      public void aa() {
        System.out.println(".aa()");
      }
    });
  }
}

interface AA{
  void aa();
}
