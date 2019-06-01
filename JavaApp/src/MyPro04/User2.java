package MyPro04;
/**
 * 测试static关键字的用法
 * @author 施克箭
 */
public class User2 {
  int id; //id
  String name; //账户名
  String pwd; //密码
  static String company = "高速信息";//公司名字

  public User2(int id, String name) {
    super(); //构造方法的第一句总是super()
    this.id = id; //this表示创建好的对象
    this.name = name;
  }
  
  public void login(){
    System.out.println("登录：" + name);
  }
  public static void printCompany(){
    //login();//调用非静态成员，编译会报错
    System.out.println(company);
  }
  
  public static void main(String[] args) {
    User2 u = new User2(1001, "李苗");
    User2.printCompany();
    User2.company = "天津理工";
    User2.printCompany();
  }
}
