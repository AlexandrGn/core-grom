package lesson1_33.lesson31;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        Map<String, Building> map = new HashMap<>();

        Building building1 = new Building("n1", 5);
        Building building2 = new Building("n2", 8);

        map.put("TT1", building1);
        System.out.println(map.put("TT1", building1) == null);


        System.out.println(map);
    }
}
