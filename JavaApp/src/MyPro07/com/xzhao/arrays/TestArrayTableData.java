package MyPro07.com.xzhao.arrays;

import java.util.Arrays;

/**
 * 测试数组存储表格数据
 * @author 施克箭
 */
public class TestArrayTableData {
  public static void main(String[] args) {    
    Object[] emp1 = {1001, "赵荣", 18, "技术员", "2014.2.4"};
    Object[] emp2 = {1002, "赵大荣", 19, "主管", "2024.2.4"};
    Object[] emp3 = {1003, "赵小荣", 22, "程序员", "2034.2.4"};
    
    Object[][] tableData = new Object[3][];
    tableData[0] = emp1;
    tableData[1] = emp2;
    tableData[2] = emp3;
    
    System.out.println(Arrays.toString(tableData));
    
    for (Object[] temp : tableData) {
      System.out.println(Arrays.toString(temp));
    }
    
  }
}
