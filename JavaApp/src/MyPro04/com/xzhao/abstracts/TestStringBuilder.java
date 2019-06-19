package MyPro04.com.xzhao.abstracts;

/**
 *测试StringBuilder、StringBuffer
 * @author 施克箭
 */
public class TestStringBuilder {
  public static void main(String[] args) {
    
    //StringBuilder 线程不安全，效率高（一般使用它） StringBufferStringBuilder 线程安全，效率低
    StringBuilder sb = new StringBuilder("abcdefg");
    
    System.out.println(Integer.toHexString(sb.hashCode()));
    System.out.println(sb);
    
    sb.setCharAt(2, 'M');    
    
    System.out.println(Integer.toHexString(sb.hashCode()));
    System.out.println(sb);
    
    String s2 = sb.substring(2, 4);
    System.out.println(Integer.toHexString(s2.hashCode()));
    System.out.println(s2);
    
   
  }
}
