package MyPro01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class BallGame extends JFrame{
    // 加载图片④
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
    
    double x = 100; //小球横坐标
    double y = 100; //小球纵坐标
    boolean right = true; //方向
    
    //    画窗口的方法⑤
    public void paint(Graphics g){   
        System.out.println("窗口被画一次");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);
        
        //  编辑小球的运动过程      
        if (right) {
            x = x + 10;
        }else{
            x = x - 10;
        }
        
        if (x > 856) {
            right = false;
        } 
        if (x < 40) {
            right = true;
        }
    }
    
    //    窗口加载②
    void launchFrame(){
        setSize(850,500);
        setLocation(50,50);
        setVisible(true);
        
        
        /**
         * 增加监听事件，关闭窗口的时候，把系统也关了
         */
        this.addWindowListener(new WindowAdapter(){
          @Override
          public void windowClosing(WindowEvent e) {
            System.exit(0);
          }      
        });
        
        
        //        重画窗口⑥
        while (true) {            
            repaint();
            try {
                Thread.sleep(40); //40毫秒，1秒=1000毫秒，大约一秒画25次
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    //    main方法是程序的入口①
    public static void main(String[] args) {
        BallGame game = new BallGame();
        game.launchFrame(); //③
    }
}
