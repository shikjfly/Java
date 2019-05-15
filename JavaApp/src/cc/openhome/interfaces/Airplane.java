package cc.openhome.interfaces;

public class Airplane implements Flyer {
    protected String name;

    public Airplane(String name) {
        this.name = name;
    } 
    
    @Override
    public void fly(){
        System.out.printf("Airplane： %s ---- 在天空飞行 %n", name);
    }
}
