package MyPro04.com.xzhao.abstracts;

/**
 * 测试接口和实现类
 * @author 施克箭
 */

public class TestInterface { 
  public static void main(String[] args) {
    Volant v = new Angle();
    v.fly();
    //v.helpOther(); //报错，虽然Angele有helpOher方法，但是Volant只有fly，而v是Volant类型
  }
}
/*
飞机接口
*/
interface Volant{
  int FLY_HEIGHT = 1000;
  void fly();
}

//善良接口
interface Honest{
  void helpOther();
}

class Angle implements Volant, Honest{ //可实现多个父接口

  @Override
  public void fly() {
    System.out.println("Angel.fly()");
  }

  @Override
  public void helpOther() {
    System.out.println("Angel.helpOther()");
  }
}

class  GoodMan implements Honest{

  @Override
  public void helpOther() {
    System.out.println("GoodMan.helpOther()");
  }
  
}

class BirdMan implements Volant{

  @Override
  public void fly() {
    System.out.println("BirdMan.fly()");
  }
  
}