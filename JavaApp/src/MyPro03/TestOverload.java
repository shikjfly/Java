package MyPro03;

import javax.transaction.xa.XAResource;

/**
 * 测试方法重载
 * @author 施克箭
 */

public class TestOverload {
    public static void main(String[] args) {
        System.out.println(add(3, 5)); //8
        System.out.println(add(3, 5.0)); //8.0
        System.out.println(add(3.0, 5)); //8.0
        System.out.println(add(3, 5, 10)); //18
    }
    /*求和的方法*/
    public static int add(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }    
    /*编译报错：只是参数名称不一样，不构成重载
    public static int add(int n2, int n1){
        int sum = n1 + n2;
        return sum;
    }
    */   
    /*编译报错：只是返回值不一样，不构成重载
    public static double add(int n1, int n2){
        double sum = n1 + n2;
        return sum;
    }
    */
    //方法名相同，参数个数不通，构成重载
    public static int add(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }
    //方法名相同，参数类型不一样，构成重载
    public static double add(double n1, int n2){
        double sum = n1 + n2;
        return sum;
    }
    //方法名相同，参数顺序不一样，构成重载
    public static double add(int n1, double n2){
        double sum = n1 + n2;
        return sum;
    }
}
