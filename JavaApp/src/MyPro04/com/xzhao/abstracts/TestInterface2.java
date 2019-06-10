package MyPro04.com.xzhao.abstracts;

/**
 * 接口语法
 * @author 施克箭
 */

public class TestInterface2 {
  
}

interface A{
  void testa();
}
interface B{
  void testb();
}

//接口可以多继承：接口C继承接口A和B。。。。//类没有多继承
interface C extends A, B{
  void testc();
}

class MySubclass implements C{

  @Override
  public void testc() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void testa() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void testb() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}