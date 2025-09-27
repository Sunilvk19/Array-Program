package rohansir;

import java.util.ArrayList;
import java.util.Collections;

public class MobileMain {
    public static void main(String[] args) {
        ArrayList<Mobile> list = new ArrayList<>();
        list.add(new Mobile("OnePlus",45999.0,"Blue"));
        list.add(new Mobile("Samsung",43999.0,"White"));
        list.add(new Mobile("Iphone",41999.0,"Black"));
        list.add(new Mobile("Nothing",42999.0,"Green"));

        Collections.sort(list);

        for (Mobile mob : list){
            System.out.println(mob);
        }

        System.out.println("----------");

        Collections.reverse(list);

        for(Mobile mob : list){
            System.out.println(mob);
        }
    }
}
