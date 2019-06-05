/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlaneGame04.com.xzhao;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Administrator
 */
public class Plane extends GameObject{
  
  public void drawSelf(Graphics g){
    g.drawImage(img, (int)x, (int)y, null);
    x++;
  }

  public Plane(Image img, double x, double y) {
    super(img, x, y);
  }
  
}
