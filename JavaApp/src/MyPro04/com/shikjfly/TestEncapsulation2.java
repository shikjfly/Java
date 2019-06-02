package MyPro04.com.shikjfly;

import MyPro04.com.xzhao.Human;

/**
 * 测试封装
 * @author 施克箭
 */
public class TestEncapsulation2 {
  public static void main(String[] args) {
    Human h = new Human();
    //h.name = "xzhao"; //不同包，不可以使用default的成员变量
    //h.heigth = 123;//不同包，不可以使用protected的成员变量
  }
}

class Girl extends Human{
  void sayHi(){
    System.out.println(height); //protected可以在不通包的子类中使用
  }
}