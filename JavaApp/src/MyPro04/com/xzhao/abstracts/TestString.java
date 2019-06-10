package MyPro04.com.xzhao.abstracts;

/**
 *测试字符串的基本用法
 * @author 施克箭
 */
public class TestString {
  public static void main(String[] args) {
    String str = "abc";
    String str2 = new String("def");
    String str3 = "abc" + "defg";
    String str4 = "18" + 19; // 不是加法，是字符连接符
    System.out.println(str4);
    
    System.out.println("##############");
    String str10 = "shi"; //常量池
    String str11 = "shi"; //常量池
    String str12 = new String("shi"); //新建对象
    System.out.println(str10 == str11);
    System.out.println(str12 == str11); //str11和str12不是同一个对象。
    
    //通常比较字符串的时候，使用equals
    System.out.println(str12.equals(str11));
  }
}
