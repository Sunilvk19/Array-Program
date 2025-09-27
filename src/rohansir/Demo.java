package rohansir;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();
        set.add(10);
        set.add(25);
        set.add(45);
        System.out.println(set);
        System.out.println(set.reversed());
    }
}
