package cc.openhome.interfaces_details;

import static java.lang.System.out;

public class Game {
    public static void main(String[] args) {
        play(1);
        play(3);
    }
    public static void play(int action) {
        switch(action) {
            case Action.STOP :
                out.println("stop停止");
                break;
            case Action.RIGHT :
                out.println("right向右");
                break;
            case Action.LEFT :
                out.println("left向左");
                break;
            case Action.UP :
                out.println("up向上");
                break;
            case Action.DOWN :
                out.println("down向下");
                break;
        }
    }
}
