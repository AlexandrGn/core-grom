package lesson1_33.lesson31.Homework;

public class Demo {
    public static void main(String[] args) {
        String text1 = "Киев имеет репутацию одной из наиболее зелёных и чистых столиц. Тем не менее, в последние годы в Киеве, как и во всех крупных городах, всё большую актуальность приобретает загрязнение воздуха выхлопными газами автомобилей. Основным загрязнителем воздуха в Киеве является автотранспорт: он даёт 83,4 % всех вредных выбросов в атмосферу.";

        String text2 = null;
        String text3 = "   ";
        String text4 = "";
        String text5 = "asas asas asas .. .. ... ...";

        System.out.println(Solution.countSymbols(text1));
        System.out.println(Solution.words(text1));

        System.out.println(Solution.countSymbols(text2));
        System.out.println(Solution.words(text2));

        System.out.println(Solution.countSymbols(text3));
        System.out.println(Solution.words(text3));

        System.out.println(Solution.countSymbols(text4));
        System.out.println(Solution.words(text4));

        System.out.println(Solution.countSymbols(text5));
        System.out.println(Solution.words(text5));
    }
}
