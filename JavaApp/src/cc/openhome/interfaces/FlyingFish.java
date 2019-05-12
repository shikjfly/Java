package cc.openhome.interfaces;

public class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name) {
        super(name);
    }

    @Override
    public void swim(){
        System.out.printf("飞鱼： %s ---- 在海面飞行 %n", name);
    }
    
    @Override
    public void fly(){
        System.out.printf("飞鱼： %s ---- 在天空飞行 %n", name);
    }
}
