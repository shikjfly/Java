package MyPro04.com.xzhao;

/**
 * 测试封装
 * @author 施克箭
 */
public class TestEncapsulation {
  public static void main(String[] args) {
    Human h = new Human();
    //h.age = 13; //同一个包，不同类，也不可以使用私有类
    h.name = "xzhao";
    h.height = 123;
  }
}

class Boy extends Human {
  void sayHello(){
    //System.out.println(age); //子类无法使用父类的私有属性和方法
    System.out.println(height);
  }
}