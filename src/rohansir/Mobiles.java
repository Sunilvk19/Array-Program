package rohansir;

import java.util.HashSet;
import java.util.Iterator;

public class Mobiles {
    public static void main(String[] args) {
        HashSet mob = new HashSet();
        mob.add("Iphone");
        mob.add("OnePlus");
        mob.add("Samsung");
        mob.add("Nothing");
        mob.add(null);

        System.out.println(mob);
        System.out.println();

        Iterator itr = mob.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        HashSet hs2 = new HashSet();
        hs2.addAll(mob);

        for(Object ob : hs2){
            System.out.println(ob);
        }

        System.out.println(hs2);
        System.out.println(hs2.contains(2));
    }
}
