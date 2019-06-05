/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlaneGame08.com.xzhao;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 *游戏物体的父类
 * @author 施克箭
 */
public class GameObject {
  Image img;
  double x,y;
  int speed;
  int width,height;
  
  public void drawSelf(Graphics g){
    g.drawImage(img, (int)x, (int)y, null);
  }

  public GameObject(Image img, double x, double y, int speed, int width, int height) {
    this.img = img;
    this.x = x;
    this.y = y;
    this.speed = speed;
    this.width = width;
    this.height = height;
  }

  public GameObject(Image img, double x, double y) {
    this.img = img;
    this.x = x;
    this.y = y;
  }

  public GameObject() {
  }
  /**
   * 返回物体所在的矩形，便于后续的碰撞检测
   * @return 
   */
  public Rectangle getRact(){
    return new Rectangle((int)x, (int)y, width, height);
  }
  
}
