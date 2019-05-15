package cc.openhome.interfaces;

public class Seaplane extends Airplane implements Swimmer {
    public Seaplane(String name) {
        super(name);
    }

    @Override
    public void swim(){
        System.out.printf("海上飞机： %s ---- 在海面航行 %n", name);
    }
    
    @Override
    public void fly(){
        System.out.printf("海上");
        super.fly();
    }
}
