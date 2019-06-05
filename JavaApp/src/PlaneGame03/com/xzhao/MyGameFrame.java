package PlaneGame03.com.xzhao;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author 施克箭
 */
public class MyGameFrame extends JFrame{

  Image plane = Toolkit.getDefaultToolkit().getImage("images/plane.png");
  Image bg = Toolkit.getDefaultToolkit().getImage("images/bg.jpg");
  
  int planeX = 250, planeY = 250;
  
  @Override
  public void paint(Graphics g) { //自动被调用，g相当于一只画笔       
    g.drawImage(bg, 0, 0, null);
    g.drawImage(plane, planeX, planeY, null);   
    planeX++;    
  }
  
  //帮助我们反复的重画窗口！
  class PaintThread extends Thread { //内部类的好处，可以直接使用外部类的属性
    @Override
    public void run() {
      while (true) {      
        System.out.println("重画一次");
        repaint(); //重画
        try {
          Thread.sleep(40);//1秒 = 40毫秒 * 25次
        } catch (InterruptedException ex) {
          Logger.getLogger(MyGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    } 
  }
  
  /**
   * 初始化窗口
   */
  public void launchFrame(){
    this.setTitle("小赵的作品");
    this.setSize(500,500);
    this.setLocation(50,50);
    this.setVisible(true); //XXX这个必须放在最后面####
    
    this.addWindowListener(new WindowAdapter(){ // 添加监听事件
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }      
    });
    
    new PaintThread().start(); //启动线程
  }
  
  public static void main(String[] args) {
    MyGameFrame f = new MyGameFrame();
    f.launchFrame();            
  }
}
