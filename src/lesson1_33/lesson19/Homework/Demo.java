package lesson1_33.lesson19.Homework;

public class Demo {
    public static void main(String[] args) {

        File[] files1 = new File[50];

        for (int i = 0; i < 5; i++)
            files1[i] = new File(100 + i, "name1 " + String.valueOf(i), "f1", i * 25);

        for (int i = 5; i < 10; i++)
            files1[i] = new File(100 + i, "name2 " + String.valueOf(i), "f2", i * 25);

        for (int i = 10; i < 15; i++)
            files1[i] = new File(100 + i, "name3 " + String.valueOf(i), "f3", i * 25);

        files1[15] = new File(100, "name3 " + 100, "f1", 200);
        files1[16] = new File(101, "name1 " + 101, "f1", 200);
        files1[17] = new File(101, "name3 " + 101, "f2", 200);
        files1[18] = new File(118, "name3 " + 102, "f3", 200);
        files1[19] = new File(119, "name1 " + 101, "f1", 10000);
        files1[20] = new File(1000, "name3 " + 102, "f1", 10000 * 10000);


        System.out.println(Controller.vivodFiles(files1));
        System.out.println("---------------------------------------");

        Storage storage1 = new Storage(001, new File[10], new String[]{"f1", "f2"}, "Ukraine", 1000000);
        System.out.println(storage1.toString());


        try {
            Controller.put(storage1, files1[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(storage1.toString());

        int[] index = {0, 1, 2, 3, 4, 15, 16, 17, 18, 19, 20};
        for (int i : index) {
            try {
                Controller.put(storage1, files1[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(storage1.toString());


        try {
            Controller.delete(storage1, files1[7]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Controller.delete(storage1, files1[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Controller.delete(storage1, new File(101, "name1 1", "f1", 100));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Controller.delete(storage1, new File(101, "name1 1d", "f1", 100));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(storage1.toString());
//        Controller.delete(storage1, files1[7]);
//        Controller.delete(storage1, files1[0]);
//        Controller.delete(storage1, new File(101, "name1 1", "f1", 100));
//        Controller.delete(storage1, new File(101, "name1 1d", "f1", 100));
//        System.out.println(storage1.toString());

        try {
            Controller.put(storage1, files1[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(storage1.toString());

        Storage storage2 = new Storage(2, new File[10], new String[]{"f1", "f3"}, "Fr", 1000000);

        int[] index1 = {101, 105, 119, 50};
        for (int i : index1) {
            try {
                Controller.transferFile(storage1, storage2, i);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

//        Controller.transferFile(storage1, storage2, 101);
//        Controller.transferFile(storage1, storage2, 105);
//        Controller.transferFile(storage1, storage2, 119);
//        Controller.transferFile(storage1, storage2, 50);
        System.out.println(storage1.toString());
        System.out.println(storage2.toString());

//        try {
//            Controller.transferAll(storage1, storage2);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(storage1.toString());
//        System.out.println(storage2.toString());

        Storage storage3 = new Storage(3, new File[20], new String[]{"f1", "f3"}, "Fr", 10000*100000);
        try {
            Controller.transferAll(storage1, storage3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(storage1.toString());
        System.out.println(storage3.toString());
    }


}
