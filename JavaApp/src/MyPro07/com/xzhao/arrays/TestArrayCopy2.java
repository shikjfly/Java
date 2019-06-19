package MyPro07.com.xzhao.arrays;

import java.util.Arrays;

/**
 * 测试数组的拷贝
 * @author 施克箭
 */
public class TestArrayCopy2 {
  public static void main(String[] args) {
    String[] s1 = {"a","b","c","d","e"}; 
    
//    String[] s2 = deletedOneElement(s1, 1);
    String str = "zz";
    String[] s2 = addOneElement(s1, 4, str);
    
//    for (int i = 0; i < s2.length; i++) {
//      System.out.println(i + "---" + s2[i]);
//    }
    System.out.println(Arrays.toString(s2));
  }
  
  public static String[] deletedOneElement(String[] s, int index){    
    System.arraycopy(s, index + 1, s, index, s.length - index - 1);
    s[s.length - 1] = null;    
    return s;
  }
  
  public static String[] addOneElement(String[] s, int indexBefore, String str){    
    String[] s2 = new String[s.length + 1];
    System.arraycopy(s, 0, s2, 0, s.length);
    System.arraycopy(s2, indexBefore, s2, indexBefore+1, s2.length - indexBefore - 1);
    
    s2[indexBefore] = str;
    
    
    
    return s2;
  }
  
}
