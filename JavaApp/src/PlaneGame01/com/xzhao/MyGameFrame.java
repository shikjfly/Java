package PlaneGame01.com.xzhao;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author 施克箭
 */
public class MyGameFrame extends JFrame{
  /**
   * 初始化窗口
   */
  public void launchFrame(){
    this.setTitle("小赵的作品");
    this.setSize(500, 500);
    this.setLocation(50,50);
    this.setVisible(true);
    
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
