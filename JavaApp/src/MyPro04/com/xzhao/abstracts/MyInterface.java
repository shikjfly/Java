package MyPro04.com.xzhao.abstracts;

/**
 * 接口语法
 * @author 施克箭
 */

interface MyInterface { 
  /*public static final*/ int MAX_AGE = 100;
  /*public static final*/ void test01();
}

class MyClass implements MyInterface{

  @Override
  public void test01() {
    System.out.println("MyClass.test01()");
  }
  
  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    myClass.test01();
  }
  
}