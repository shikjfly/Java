/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro04.com.xzhao;

/**
 *测试重写override
 * @author Administrator
 */
public class TestOverride {
  public static void main(String[] args) {
    Horse h = new Horse();
    h.run();
    h.stop();
  }
}


class Vehicle{
  public void run(){
    System.out.println("跑...");
  }
  public void stop(){
    System.out.println("停止...");
  }
  public Person whoIsPsg(){
    return new Person();
  }
}

class Horse extends Vehicle{
  @Override
  public void run(){
    System.out.println("重写过的跑...");
  }
  
  @Override
  public Student whoIsPsg(){ //返回值的类型，小于等于父类的类型
    return new Student();
  }
  
}

