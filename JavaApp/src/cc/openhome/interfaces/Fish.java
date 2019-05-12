package cc.openhome.interfaces;

public abstract class Fish implements Swimmer {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void swim();
}
