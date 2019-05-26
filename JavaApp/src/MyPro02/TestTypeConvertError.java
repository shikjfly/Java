package MyPro02;

/**
 *  测试类型转换常见问题-溢出
 * @author 施克箭
 */
public class TestTypeConvertError {
    public static void main(String[]args) {
        int money = 1000000000; //10亿
        int years = 20;
        //返回是total是负数，超过了int的范围
        int total = money * years;
        System.out.println("total="+total);
        //返回是total任然是负数，默认是int，因此结果也是int，再转换long，但是已经发生了数据丢失。
        long total1 = money * years;
        System.out.println("total1="+total1);
        //返回是total2正确，先将一个因子提升为long，整个表达式发生提升，全部用long来计算。
        long total2 = money * (long)years;
        System.out.println("total2="+total2);
        
        //命名问题
        int l = 2; //分不清楚是L还是l
        long a = 2345l; //long类型建议用大写L
        System.out.println(l+1);
    }   
  
}
