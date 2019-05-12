package cc.openhome.vetual;

public class Bird {
    protected String name;
    public Bird(String name){
        this.name = name;
    }
    public Bird copy(){
        return new Bird(name);
    }
}
