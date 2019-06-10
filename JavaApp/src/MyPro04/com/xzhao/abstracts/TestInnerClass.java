package MyPro04.com.xzhao.abstracts;

/**
 *测试非静态内部类
 * @author 施克箭
 */
public class TestInnerClass {
  public static void main(String[] args) {
    //外部类的创建
    Outer outer = new Outer();
    outer.testOuter();
    
    //创建内部类的对象
    Outer.Inner inner = new Outer().new Inner();
    inner.show();
  }
}

class Outer{
  private int age = 10;
  public void testOuter(){
  }
  //内部类为外部类服务
  class Inner{
    int age = 20;
    public void show(){
      int age = 30;
      System.out.println("外部类的成员变量age：" + Outer.this.age);
      System.out.println("内部类的成员变量age：" + this.age);
      System.out.println("局部变量age：" + age);
    }
  }
  
}