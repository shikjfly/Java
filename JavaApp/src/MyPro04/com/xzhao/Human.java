package MyPro04.com.xzhao;

/**
 * 测试封装
 * @author 施克箭
 */
public class Human{
  private int age;
  String name; //可以在同一个包下使用
  protected int height;
  
  void sayAge(){
    System.out.println(age);
  }
}
