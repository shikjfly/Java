package cc.openhome.trycatch;

import java.util.*;
import static java.lang.System.out;

public class Guest {
    public static void main(String[] args) {
        List names = new ArrayList();
        collectNameTo(names);
    }
    static void collectNameTo(List names){
        Scanner console = new Scanner(System.in);
        while (true) {            
            out.print("访客名称：");
            String name = console.nextLine();
            if (name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }
}
