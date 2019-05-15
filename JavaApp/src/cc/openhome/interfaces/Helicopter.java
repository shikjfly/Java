package cc.openhome.interfaces;

public class Helicopter extends Airplane {
    public Helicopter(String name) {
        super(name);
    }
    
    @Override
    public void fly(){
        System.out.printf("直升飞机");
        super.fly();
    }
}
