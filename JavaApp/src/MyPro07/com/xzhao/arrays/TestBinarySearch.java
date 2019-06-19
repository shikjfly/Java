package MyPro07.com.xzhao.arrays;

import java.util.Arrays;

/**
 * 测试二分查找
 * @author 施克箭
 */
public class TestBinarySearch {
  public static void main(String[] args) {
    int[] values = {9,8,70,6,50,4,3,2,1};
    Arrays.sort(values); 
    System.out.println(Arrays.toString(values));
    
    System.out.println( binarySearch(values, 1) );
    
  }
  
  public static int binarySearch(int[] values, int num) {
        
    int low=0;
    int hight = values.length - 1;
    System.out.println("要查找的值:"+num);
    while (low <= hight) {      
      int mid = (low+hight)/2;
      System.out.printf("low:%d,hight:%d,mid:%d %n", low,hight,mid);
      if (values[mid] == num) {
        return mid;
      }
      if (values[mid] > num) {
        hight = mid - 1;
      }
      if (values[mid] < num) {
        low = mid + 1;
      }      
    }
    return -1;
  }
}
