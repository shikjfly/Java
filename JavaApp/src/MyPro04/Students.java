package MyPro04;

/**
 * 测试类
 * @author 施克箭
 */
public class Students {
  int id;
  String name;
  int age;
  
  void play(){
    System.out.println("我在玩游戏，JavaScript...");
  }
  void study(){
    System.out.println("我在学习...");
  }
  //程序执行的入口main方法，必须要有
  public static void main(String[] args) {
    Students stu = new Students();
    stu.play();
    stu.study();
  }
}
