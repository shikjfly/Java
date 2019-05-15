package cc.openhome.interfaces;

public abstract class Boat implements Swimmer {
    protected String name;
    public Boat(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void swim(){
        System.out.printf("船在水面 %s 航行 %n", name);
    }
}
