package cc.openhome;

public class Magician extends Role{
    @Override
    public void fight(){
        System.out.println("魔法攻击...");
    }    
    public void cure(){
        System.out.println("魔法治疗...");
    }    
    public String toString(){
        return String.format("魔法师toString：%s,%d,%d", this.name, this.level, this.getBlood());
    }
}
