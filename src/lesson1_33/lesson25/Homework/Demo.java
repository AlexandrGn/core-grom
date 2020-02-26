package lesson1_33.lesson25.Homework;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {
        GeneralDAO<String> generalDAO = new GeneralDAO<>();

        generalDAO.save("s1");
        generalDAO.save("s2");

        System.out.println(Arrays.toString(generalDAO.getAll()));


        GeneralDAO< String> generalDAO2 = new GeneralDAO<>();

        System.out.println(Arrays.toString(generalDAO2.getAll()));


        GeneralDAO<Long> generalDAO3 = new GeneralDAO<>();

        generalDAO3.save(50L);
        generalDAO3.save(-500L);

        System.out.println(Arrays.toString(generalDAO3.getAll()));
    }

}
