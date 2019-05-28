package MyPro04;
/**
 * 测试构造函数
 * @author 施克箭
 */
public class TestConstructor {
  public static void main(String[] args) {
    Point p = new Point(3.0, 4);
    Point origin = new Point(0.0, 0.0);
    System.out.println(p.getDistance(origin));
  }
}

class Point{
  double x, y;
  
  //构造方法名称，必须和类名保持一致
  public Point(double _x, double _y) {
    x = _x;
    y = _y;
  }
  
  public double getDistance(Point p){
    return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
  }
}
