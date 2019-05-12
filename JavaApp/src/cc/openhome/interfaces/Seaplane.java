package cc.openhome.interfaces;

public class Seaplane implements Swimmer, Flyer {
    private String name;
    public Seaplane(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void swim(){
        System.out.printf("海上飞机： %s ---- 在海面航行 %n", name);
    }
    
    @Override
    public void fly(){
        System.out.printf("海上飞机： %s ---- 在天空飞行 %n", name);
    }
}
