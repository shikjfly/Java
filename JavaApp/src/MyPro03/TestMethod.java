package MyPro03;

import javax.transaction.xa.XAResource;

/**
 * 测试方法的使用
 * @author 施克箭
 */

public class TestMethod {
    public static void main(String[] args) {
        //通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.printSt();
        int c = tm.add(30, (byte)40, 50) + 1000;
        System.out.println(c);
    }
    
    void printSt(){ //普通方法,没有返回值必须用void
        System.out.println("****");
        System.out.println("####");
    }
    
    int add(int a, byte b, int c){ //返回值要和返回类型一致
        int sum = a + b + c;
        System.out.println(sum);
        return sum; //return两个作用：①结束方法的运行；②返回值
    }
}
