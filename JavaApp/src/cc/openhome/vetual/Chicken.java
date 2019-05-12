/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome.vetual;

/**
 *
 * @author Administrator
 */
public class Chicken extends Bird{
    public Chicken(String name){
        super(name);
    }
    public Chicken copy(){
        return new Chicken(name);
    }
}
