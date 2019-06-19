package MyPro07.com.xzhao.arrays;

import java.util.Arrays;

/**
 * 测试java.util.Arrays工具类的使用
 * @author 施克箭
 */
public class TestArrays {
  public static void main(String[] args) {
    int[] a = {100,30,15,150,2,130};
    System.out.println(a);
    System.out.println(Arrays.toString(a)); //打印数组
    Arrays.sort(a); //使用二分查找，必须先对数组进行排序
    System.out.println(Arrays.toString(a));
    //返回排序后新的索引位置，若未扎到返回负数。
    System.out.println("该元素的索引："+Arrays.binarySearch(a, 2));
  }
  
}
