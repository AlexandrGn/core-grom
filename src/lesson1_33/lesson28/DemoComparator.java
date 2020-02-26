package lesson1_33.lesson28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class DemoComparator {
    public static void main(String[] args) {
        Capability capability1 = new Capability(1002, "test", "Sef", true, new Date());
        Capability capability2 = new Capability(1000, "test", "Sef", false, new Date());
        Capability capability3 = new Capability(1001, "test", "Sef", true, new Date());
        Capability capability4 = new Capability(90, "test", "Sef", false, new Date());


        ArrayList<Capability> capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);

        capabilities.sort(new IsActiveComparator());

        System.out.println(capabilities);



    }
}
