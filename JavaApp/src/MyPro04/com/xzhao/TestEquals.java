/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPro04.com.xzhao;

/**
 * equals方法的重写
 *
 * @author Administrator
 */
public class TestEquals {

  public static void main(String[] args) {
    Object obj;
    String str;
    User u1 = new User(1001, "施克箭", "123456");
    User u2 = new User(1001, "赵荣", "123456");

    System.out.println(u1 == u2);
    System.out.println(u1.equals(u2));
    
    String str1 = new String("xzhao");
    String str2 = new String("xzhao");
    
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
    
  }
}

class User {

  int id;
  String name;
  String psd;

  public User(int id, String name, String psd) {
    super();
    this.id = id;
    this.name = name;
    this.psd = psd;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final User other = (User) obj;
    if (this.id != other.id) {
      return false;
    }
    return true;
  }

}
