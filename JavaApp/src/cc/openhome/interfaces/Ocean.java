package cc.openhome.interfaces;

public class Ocean {
    public static void main(String[] args) {
        doSwim(new Anemonefish("尼莫"));
        doSwim(new Human("施克箭"));
        doSwim(new Seaplane("空中一号"));
        doFly(new Seaplane("空中一号"));
        doSwim(new FlyingFish("飞鱼沈平"));
        doFly(new FlyingFish("飞鱼沈平"));
    }
    static void doSwim(Swimmer swimmer){
        swimmer.swim();
    }
    static void doFly(Flyer flyer){
        flyer.fly();
    }
}
