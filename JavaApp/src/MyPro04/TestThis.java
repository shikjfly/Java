package MyPro04;

import javafx.scene.paint.Color;

/**
 * 测试this的用法
 * @author 施克箭
 */
public class TestThis {
  int a, b, c;

  TestThis(int a, int b) {
    //a = a;
    this.a = a; //在程序中产生二义性之处，应使用this来指明当前对象，普通方法中，this总是指向调用该方法的对象。构造方法中，this总是指向正要初始化的对象。
    this.b = b;
  }
  TestThis(int a, int b, int c) {
    //this.a = a;
    //this.b = b;
    //TestThis();
    this(a, b); //使用this关键字调用重载的构造方法，避免相同的初始化代码。但只能在构造方法中用，并且必须位于构造方法的第一句。
    this.c = c;
  }
  void  sing(){
    
  }
  void eat(){
    this.sing();
    System.out.println("妈妈喊你回家吃饭！");
  }
  public static void main(String[] args) {
    TestThis hi = new TestThis(2, 3);
    hi.eat();
    //this不能放在static静态方法内。
  }
  
}
