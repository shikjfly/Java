package MyPro04;
/**
 * 测试静态初始化块的使用
 * @author 施克箭
 */
public class User3 {
  int id; //id
  String name; //账户名
  String pwd; //密码
  static String company;//公司名字
  
  static { //类的初始化，只针对类，没有对象，所以不能调用非静态的成员
    System.out.println("执行类的初始化工作");
    company = "高速信息";
    printCompany();
  }

  public static void printCompany(){
    System.out.println(company);
  }
  
  public static void main(String[] args) {
    User3 u3 = null;
  }
}
