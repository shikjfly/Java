package MyPro04;
/**
 * 测试构造函数重载
 * @author 施克箭
 */
public class User {
  int id; //id
  String name; //账户名
  String pwd; //密码

  public User() {
  }

  public User(int id, String name) {
    super(); //构造方法的第一句总是super()
    this.id = id; //this表示创建好的对象
    this.name = name;
  }

  public User(int id, String name, String pwd) {
    this.id = id;
    this.name = name;
    this.pwd = pwd;
  }
     
  public static void main(String[] args) {
    User u1 = new User();
    User u2 = new User(1001, "赵荣");
    User u3 = new User(1001, "赵荣", "123456");
  }
}
