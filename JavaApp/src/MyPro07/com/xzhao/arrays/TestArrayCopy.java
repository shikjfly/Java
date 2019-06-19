package MyPro07.com.xzhao.arrays;

/**
 * 测试数组的拷贝
 * @author 施克箭
 */
public class TestArrayCopy {
  public static void main(String[] args) {
    String[] s1 = {"aa0", "bb1", "cc2", "dd3", "ee4"};
    testBasicCopy2(s1, 1);
    extendRange(s1);
  }
  
  public static void testBasicCopy(){
    String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
    String[] s2 = new String[10];
    System.arraycopy(s1, 2, s2, 6, 2); //要拷贝的数组对象， 拷贝的位置。。拷贝过去的数组，拷贝过去的位置，要拷贝多少个长度
//    for (String string : s2) {
//      System.out.println(string);
//    }
    for (int i = 0; i < s2.length; i++) {
      System.out.println(i + "---" + s2[i]);
    }
  }  
  //测试从数组中删除某个元素（本质上还是数组的拷贝）
  public static void testBasicCopy2(String[] s1 ,int index){
    
    String[] s2 = new String[s1.length-1];
    System.arraycopy(s1, 0, s2, 0, index-1); //要拷贝的数组对象， 拷贝的位置。。拷贝过去的数组，拷贝过去的位置，要拷贝多少个长度
    System.arraycopy(s1, index, s2, index-1, s1.length - index); //要拷贝的数组对象， 拷贝的位置。。拷贝过去的数组，拷贝过去的位置，要拷贝多少个长度

    for (int i = 0; i < s2.length; i++) {
      System.out.println(i + "---" + s2[i]);
    }
  }
  
  //数组的扩容（本质上：先定义一个更大的数组，然后将原来数组内容原封不动拷贝到新数组中）
  public static String[] extendRange(String[] s1) {
    String[] s2 = new String[s1.length + 10];
    System.arraycopy(s1, 0, s2, 0, s1.length);
    for (String string : s2) {
      System.out.println(string);
    }
    return s2;
  }
  
}
