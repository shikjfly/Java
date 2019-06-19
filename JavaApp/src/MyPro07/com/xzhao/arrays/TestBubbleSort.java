package MyPro07.com.xzhao.arrays;

import java.util.Arrays;

/**
 * 测试冒泡排序
 * @author 施克箭
 */
public class TestBubbleSort {
  public static void main(String[] args) {
    int[] values = {9,8,70,6,500,4,3,2,1};
    //Arrays.sort(values);    
    bubbleSort(values);
    
  }
  
  public static void bubbleSort(int[] values) {
    int temp ;        
    
    for (int j = 0; j < 10; j++) {
      
      System.out.println("j等于" + j);
      for (int i = 0; i < values.length - 1 - j; i++) {      
        System.out.println("i等于" + i + "，第" + (i+1) + "次循环--前"+Arrays.toString(values));
        if(values[i] > values[i+1]){
          temp = values[i];
          values[i] = values[i+1];
          values[i+1] = temp;
        }
        System.out.println("----------------后"+Arrays.toString(values));
      }
      
    }   
    
  }
}
