package cc.openhome;

public class SwordsMan extends Role{
    @Override
    public void fight(){
        System.out.println("挥剑攻击...");
    }
    
    public String toString(){
        return "---剑士toString：" +super.toString();
    }
}
