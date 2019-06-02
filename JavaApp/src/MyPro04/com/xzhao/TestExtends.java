package MyPro04.com.xzhao;

/**
 * 测试继承
 * @author 施克箭
 */
public class TestExtends {
  public static void main(String[] args) {
    Student stu = new Student();
    stu.name = "施克箭";
    stu.height = 172;
    stu.rest();
    
    Student stu2 = new Student("赵荣", 18, "心理学");
    System.out.printf("%d, %s, %s", stu2.height, stu2.name, stu2.major);
    stu2.rest();
    
    System.out.println(stu2 instanceof Student);
    System.out.println(stu2 instanceof Person);
    System.out.println(stu2 instanceof Object);
  }
}


class Person { // extends Object
  String name;
  int height;
  
  public void rest(){
    System.out.println("休息一会儿!");
  }
}


class  Student extends Person{
  String major;
  
  public void study(){
    System.out.println("学习两个小时！");
  }

  public Student(String name, int height, String major) {
    this.name = name;
    this.height = height;
    this.major = major;
  }  

  public Student() {
  }
  
   
}
