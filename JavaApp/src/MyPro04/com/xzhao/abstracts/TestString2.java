package MyPro04.com.xzhao.abstracts;

/**
 *测试字符串的常用用法
 * @author 施克箭
 */
public class TestString2 {
  public static void main(String[] args) {
    String s1 = "core Java";
    String s2 = "Core Java";
    System.out.println(s1.charAt(3));//提取下标为3的字符
    System.out.println(s2.length());//字符串的长度
    System.out.println(s1.equals(s2));//比较两个字符串的内容是否相等
    System.out.println(s1.equalsIgnoreCase(s2));//比较两个字符串的内容是否相等（忽略大小写）
    System.out.println(s1.indexOf("Java"));//字符串s1中是否包含Java
    System.out.println(s1.indexOf("Apple"));//字符串s1中是否包含Apple
    
    String s = s1.replace(' ', '@'); //将s1中的空格替换为@
    System.out.println("result is :" + s);
  }
}
