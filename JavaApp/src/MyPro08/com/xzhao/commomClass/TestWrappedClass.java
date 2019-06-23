package MyPro08.com.xzhao.commomClass;

/**
 *测试包装类
 * @author 施克箭
 */
public class TestWrappedClass {
  public static void main(String[] args) {
    //基本数据类型转成包装类对象
    Integer a = new Integer(3);
    Integer b = Integer.valueOf(32);
    
    //把包装类对象转成基本数据
    int c = b.intValue();
    double d = b.doubleValue();
    
    //把字符串转成包装类对象
    Integer e = new Integer("999");
    Integer f = Integer.parseInt("998");
    
    //把包装类对象转成字符串
    String str = f.toString(); //"" + f
    
    //常见的常量
    System.out.println("int类型最大的整数："+ Integer.MAX_VALUE);
    
  }
}
