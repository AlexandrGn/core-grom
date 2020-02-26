package lesson1_33.lesson28;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class DemoComparable {
    public static void main(String[] args) {
        Capability capability1 = new Capability(1002, "test", "Sef", true, new Date());
        Capability capability2 = new Capability(1000, "test", "Sef", true, new Date());
        Capability capability3 = new Capability(1001, "test", "Sef", true, new Date());

        Set<Capability> set= new TreeSet<>();
        set.add(capability1);
        System.out.println("a");
        set.add(capability2);
        System.out.println("a");
        set.add(capability3);

        System.out.println(set);

    }

}
