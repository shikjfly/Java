package MyPro08.com.xzhao.commomClass;

/**
 *测试自动装箱、自动拆箱
 * @author 施克箭
 */
public class TestAutoBox {
  public static void main(String[] args) {
    Integer a = 234; // 自动装箱。 Integer a = Integer.valueOf(234); 
    int b = a;  //自动拆箱。编译器会自动修改成int b = a.intValue();
    
    Integer c = null;
    if (c != null) {
      int d = c; //自动拆箱。调用了：c.intValue()
    }   
    //缓存了[-128,127]之间的数字,实际就是系统初始化的时候，创建了[-128,127]之间的缓存数组
    //当我们调用valueOf的时候，首先检查是否在[-128,127]之间，如果在这个范围，则直接从缓存数组中已经建好的对象。
    //如果不在这个范围，则创建新的对象。
    Integer int1 = Integer.valueOf(-128);
    Integer int2 = -128;
    System.out.println(int1 == int2); //在缓存区
    System.out.println(int1.equals(int2));
    
    System.out.println("###########");
    Integer int3 = 1234;
    Integer int4 = 1234;
    System.out.println(int3 == int4);//不在缓冲区
    System.out.println(int3.equals(int4));
    
  }
}
