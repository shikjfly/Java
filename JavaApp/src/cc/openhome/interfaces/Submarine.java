package cc.openhome.interfaces;

public class Submarine extends Boat implements Diver {
    public Submarine(String name){
        super(name);
    }
    @Override
    public void dive(){
        System.out.printf("潜水艇 %s 潜行 %n", name);
    }
}
