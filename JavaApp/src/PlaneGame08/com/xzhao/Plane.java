package PlaneGame08.com.xzhao;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

/**
 *飞机
 * @author 施克箭
 */
public class Plane extends GameObject{
           
  boolean left, up, right, down;
  
  boolean live = true;
  
  public void drawSelf(Graphics g){
    
    if (live) {
      g.drawImage(img, (int)x, (int)y, null);

      if (left) {
        x += speed;
      }
      if (right) {
        x -= speed;
      }
      if (up) {
        y += speed;
      }
      if (down) {
        y -= speed;
      }     
    }else{
      
    }

    
  }


  public Plane(Image img, double x, double y, int speed, int width, int height) {
    super(img, x, y, speed, width, height);
  }
   
  
  //按下某个键，增加响应的方向
  public void addDirction(KeyEvent e){
    switch(e.getKeyCode()){
      case KeyEvent.VK_LEFT:
        left = true;
        break;
      case KeyEvent.VK_UP:
        up = true;
        break;
      case KeyEvent.VK_RIGHT:
        right = true;
        break;
      case 40:
        down = true;
        break;
    }
  }
  //松开某个键，取消响应的方向
  public void minusDirction(KeyEvent e){
    switch(e.getKeyCode()){
      case KeyEvent.VK_LEFT:
        left = false;
        break;
      case KeyEvent.VK_UP:
        up = false;
        break;
      case KeyEvent.VK_RIGHT:
        right = false;
        break;
      case 40:
        down = false;
        break;
    }
  }
  
}
