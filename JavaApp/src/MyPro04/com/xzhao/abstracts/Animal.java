package MyPro04.com.xzhao.abstracts;

/**
 *抽象类的意义就在于：为子类提供统一的、规范的模板。子类必须实现相关的抽象方法！
 * @author 施克箭
 */
public abstract class Animal { //有抽象类的方法，只能定义为抽象类
  //第一，没有实现。第二，子类必须实现
  abstract public void shout();
  
  public void run(){
    System.out.println("跑呀跑！");
  }
  
  public static void main(String[] args) {
    Animal d = new Dog();
    d.shout();
    d.run();
  }
}

class Dog extends Animal {

  @Override
  public void shout() {
    System.out.println("汪汪汪!");
  }
  
}
