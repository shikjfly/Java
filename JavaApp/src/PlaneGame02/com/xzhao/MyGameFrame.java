package PlaneGame02.com.xzhao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author 施克箭
 */
public class MyGameFrame extends JFrame{
  
  Image ball = GameUtil.getImage("images/ball.png");
//  Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
  
  @Override
  public void paint(Graphics g) { //自动被调用，g相当于一只画笔
    
    
    g.drawImage(ball, 200, 200, null);
    
    Color c = g.getColor();
    Font f = g.getFont();    
    g.setColor(Color.blue);
    
    g.drawLine(100, 100, 300, 300);
    g.drawRect(100, 100, 300, 300);
    g.drawOval(100, 100, 300, 300);
    g.fillRect(100, 100, 40, 40);   
    
    g.setColor(Color.red);
    g.drawString("Who am i?", 200, 200);
    
    g.drawImage(ball, 300, 300, null);
    
    g.setColor(c);
  }
   
  
  /**
   * 初始化窗口
   */
  public void launchFrame(){
    this.setTitle("小赵的作品");
    this.setSize(500, 500);
    this.setLocation(50,50);
    this.setVisible(true); //XXX这个必须放在最后面####
    
    /**
     * 增加监听事件，关闭窗口的时候，把系统也关了
     */
    this.addWindowListener(new WindowAdapter(){
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }      
    });
  }
  
  public static void main(String[] args) {
    MyGameFrame f = new MyGameFrame();
    f.launchFrame();            
  }
}
