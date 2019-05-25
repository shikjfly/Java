/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro02;

/**
 *测试变量
 * @author 施克箭
 */
public class TestVariable {
    int a; //成员变量member variable,也叫实例变量（对象创建，成员变量也跟着创建，对象消失，成员变量也消失）,对象成员的变量,从属于对象,成员变量会自动被初始化,int默认值为0;
    static int size; //静态变量static variable,也叫类变量,从属于类.类加载，静态变量就有效，类卸载，静态变量就消失
    public static void main(String[] args) {       
        {
            int age; //局部变量local variable, 从属于语句块，语句块执行结束，局部变量消失
            age = 18;
        }                
        int salary = 3000; //局部变量, 从属于方法,方法执行结束，局部变量消失
        int gao=13;
        System.out.println(gao);
        
        int i;
        //int j = i + 5; //编译出错,变量还未被初始化,局部变量必须初始化
        
        
    }   
}
