package PlaneGame08.com.xzhao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author 施克箭
 */
public class MyGameFrame extends JFrame{

  Image planeImg = Toolkit.getDefaultToolkit().getImage("images/plane.png");
  Image bg = Toolkit.getDefaultToolkit().getImage("images/bg.jpg");
  
  Plane plane = new Plane(planeImg, 250, 250, 3, 40, 50);
  Shell[] shells = new Shell[55];
  
  Explode bao;
  Date startTime = new Date();
  Date endTime;
  int period;
  
  @Override
  public void paint(Graphics g) { //自动被调用，g相当于一只画笔       
    g.drawImage(bg, 0, 0, null);
    plane.drawSelf(g);//画飞机
    
    //画出所有的炮弹
    for (Shell shell : shells) {
      shell.draw(g);
      
      //飞机的碰撞检测
      boolean peng = shell.getRact().intersects(plane.getRact());
      if (peng) {
        plane.live = false;
        if (bao == null) {
          bao = new Explode(plane.x, plane.y);
          endTime = new Date();
          period = (int)(endTime.getTime() - startTime.getTime())/1000;
        } 
        bao.draw(g);
      }
      
      //计时功能，给出提示
      if (!plane.live) {             
        g.setColor(Color.red);
        g.setFont( new Font("宋体", Font.BOLD, 50) );
        g.drawString("时间："+period+"秒", (int)plane.x, (int)plane.y);
      }
    }
    
  }
  
  //帮助我们反复的重画窗口！
  class PaintThread extends Thread { //内部类的好处，可以直接使用外部类的属性
    @Override
    public void run() {
      while (true) {      
        repaint(); //重画
        try {
          Thread.sleep(40);//1秒 = 40毫秒 * 25次
        } catch (InterruptedException ex) {
          Logger.getLogger(MyGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    } 
  }
  
  //定义键盘监听的内部类
  class KeyMonitor extends KeyAdapter { //内部类的好处，可以直接使用外部类的属性

    @Override
    public void keyReleased(KeyEvent e) {
      plane.addDirction(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
      plane.minusDirction(e);
    }
    
  }
  
  /**
   * 初始化窗口
   */
  public void launchFrame(){
    this.setTitle("小赵的作品");
    this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
    this.setLocation(50,50);
    this.setVisible(true); //XXX这个必须放在最后面####
    
    this.addWindowListener(new WindowAdapter(){ // 添加监听事件
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }      
    });
    
    new PaintThread().start(); //启动线程
    addKeyListener(new KeyMonitor());//给窗口增加键盘监听
    
    //初始化50个炮弹
    for (int i = 0; i < shells.length; i++) {
      shells[i] = new Shell();
    }
    
  }
  
  public static void main(String[] args) {
    MyGameFrame f = new MyGameFrame();
    f.launchFrame();            
  }
}
