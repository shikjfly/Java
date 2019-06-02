package MyPro04.com.xzhao;

/**
 * 测试super用法
 * @author 施克箭
 */
public class TestSuper02 {
  public static void main(String[] args) {
    System.out.println("开始创建一个对象...");
    new ChildClass2();
  }
}

class FatherClass2 {
  public FatherClass2() {
    System.out.println("构造方法，创建FatherClass的对象");
  }  
}

class ChildClass2 extends FatherClass2 {
  public ChildClass2() {
    System.out.println("构造方法，创建ChildClass的对象");
  }  
}

