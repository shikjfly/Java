package MyPro04;
/**
 * 测试类
 * @author 施克箭
 */
public class Students {
  
  //field属性
  int id;
  String name;
  int age;
  
  Computer comp; //计算机
  
  //方法method
  void play(){
    System.out.println("我在玩游戏，JavaScript...使用电脑品牌："+comp.brand);
  }
  void study(){
    System.out.println("我在学习...");
  }
  
  //构造方法，用于创建这个类的对象，无参数的构造方法可以由系统自己创建。
  public Students() {
  }
  
  //程序执行的入口main方法，必须要有
  public static void main(String[] args) {
    Students stu = new Students();//通过构造方法，创建一个对象
    stu.id = 1001;
    stu.name = "施克箭";
    stu.age = 18;
    
    Computer c1 = new Computer();
    c1.brand = "联想";
    
    stu.comp = c1;
    
    stu.play();
  }
}

class Computer{
  String brand;
}