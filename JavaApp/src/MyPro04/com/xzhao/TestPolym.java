/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro04.com.xzhao;

/**
 * 测试多肽
 * @author 施克箭
 */
public class TestPolym {
  public static void main(String[] args) {
    Animal a = new Animal();
    animalCry(a);
    
    //Dog d = new Dog(); //要点3：父类类型Animal指向了子类
    Animal d = new Dog(); //强制向上转型
    animalCry(d);
    //d.seeDoor(); //报错，seeDoor()方法不在Animal类中
    
    Dog d2 = (Dog) d; //强制向下转型
    d2.seeDoor();
    
    Animal c = new Cat();//强制向上转型
    animalCry(new Cat());
    
    Dog d3 = (Dog)c;
    //d3.seeDoor(); // 报错，java.lang.ClassCastException
    
    String st;
    
  }
  static void animalCry(Animal a){
    a.shout();
  }
  /*static void animalCry(Dog a){
    a.shout();
  }
  static void animalCry(Cat a){
    a.shout();
  }*/
}

class Animal{ //final加了，子类不能继承
  public void shout(){ //final加了，子类就不能重新
    System.out.println("叫了一声！");
  }
}

class Dog extends Animal{ //要点1：要有继承
  @Override //要点2：要有 重新，覆盖
  public void shout(){
    System.out.println("汪汪汪！");
  }  
  public void seeDoor(){
    System.out.println("看门！");
  }  
}

class Cat extends Animal{
  @Override
  public void shout(){
    System.out.println("喵喵喵！");
  }  
}
