package lesson1_33.lesson29.Exercise;

import java.util.HashSet;
import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        System.out.println(set);

        set.add("testStr");
        System.out.println(set);
        set.add("111");
        set.add("111");
        System.out.println(set);

        Set<File> files = new HashSet<>();
        File file1 = new File("pict.txt",100);
        File file2 = new File("home.txt",178);
        File file3 = new File("home.txt",188);

        files.add(file1);
        files.add(file2);
        files.add(file3);

        System.out.println(files);
    }
}
