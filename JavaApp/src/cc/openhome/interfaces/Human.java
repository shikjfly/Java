package cc.openhome.interfaces;

public class Human implements Swimmer {
    protected String name;
    public Human(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void swim(){
        System.out.printf("人类： %s ---- 游泳 %n", name);
    }
}
