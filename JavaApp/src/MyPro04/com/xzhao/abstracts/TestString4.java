package MyPro04.com.xzhao.abstracts;

/**
 *测试字符串的常用用法
 * @author 施克箭
 */
public class TestString4 {
  public static void main(String[] args) {
    
    String s1 = new String("abcdefg");
    String s2 = s1.substring(2, 4);
      
    
    System.out.println(Integer.toHexString(s1.hashCode()));
    System.out.println(Integer.toHexString(s2.hashCode()));
    
    //编译器做了优化，直接在编译的时候将字符串进行拼接
    String a1 = "hello" + " java"; //相当于 a1 = "hello java";
    String a2 = "hello java";
    
    System.out.println("a1: " + a1 + "----" + Integer.toHexString(a1.hashCode()));  
    System.out.println("a2: " + a2 + "----" + Integer.toHexString(a2.hashCode()));  

    System.out.println("a1==a2:           " + (a1 == a2));
    
    
    String a3 = "hello";
    String a4 = " java";
    String a5 = a3 + a4;
    System.out.println("a3: " + a3 + "----" + Integer.toHexString(a3.hashCode()));   
    System.out.println("a4: " + a4 + "----" + Integer.toHexString(a4.hashCode()));   
    System.out.println("a5: " + a5 + "----" + Integer.toHexString(a5.hashCode()));   
    
    //编译的时候，不知道变量中存储的是什么，所以没办法在编译的时候优化
    System.out.println("a1==a5:           " + (a1 == a5));
    
    //做字符串比较的时候，使用equals不要使用==
    System.out.println("a1.equals(a5):    " + (a1.equals(a5)));
    
    
  }
}
