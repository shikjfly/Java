package cc.openhome;

public class RPG {
    public static void main(String[] args) {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(2000);
        System.out.println(swordsMan.toString());

        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);

        System.out.println("血量："+magician.getName()+"--"+magician.getBlood());
        System.out.println(magician.toString());

    }

    public static void showBlooding(Role role) {        
        System.out.printf("showBlooding：（%s,%d）%n", role.getName(),role.getBlood());
    }
    public static void drawFight(Role role){
        System.out.printf("drawFight：（%s）", role.getName());
        role.fight();
    }
}
