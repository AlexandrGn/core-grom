package lesson1_33.lesson16_17.Homework;

public class Demo {
    public static void main(String[] args) {
        Solution.Demo();

        System.out.println("-------------------Solution---countWords");
        System.out.println(Solution.countWords(""));
        System.out.println(Solution.countWords("word"));
        System.out.println(Solution.countWords("word word"));
        System.out.println(Solution.countWords("   London Moscow   Berlin   "));
        System.out.println(Solution.countWords("    "));

        System.out.println("-------------------Solution---maxWord");
        System.out.println(Solution.maxWord(""));
        System.out.println(Solution.maxWord("word"));
        System.out.println(Solution.maxWord("word word"));
        System.out.println(Solution.maxWord("   London Moscow   Berlin   "));
        System.out.println(Solution.maxWord("a abc abcd ab"));
        System.out.println(Solution.maxWord("    "));

        System.out.println("-------------------Solution---minWord");
        System.out.println(Solution.minWord(""));
        System.out.println(Solution.minWord("word"));
        System.out.println(Solution.minWord("word word"));
        System.out.println(Solution.minWord("   London Moscow   Berlin   "));
        System.out.println(Solution.minWord(" abc abcd ab   d"));
        System.out.println(Solution.minWord("    "));

        System.out.println("-------------------Solution---mostCountedWord");
        System.out.println(Solution.mostCountedWord(""));
        System.out.println(Solution.mostCountedWord("word"));
        System.out.println(Solution.mostCountedWord("word word"));
        System.out.println(Solution.mostCountedWord("   London Moscow   Berlin   "));
        System.out.println(Solution.mostCountedWord(" abc abcd ab   d"));
        System.out.println(Solution.mostCountedWord("    "));
        System.out.println(Solution.mostCountedWord("sd as as dfg wef"));
        System.out.println(Solution.mostCountedWord("sd as as dfg wef wef5 wef5 wef5"));
        System.out.println(Solution.mostCountedWord("sd as as dfg wef wef5 wef5 wef5 er er"));
        System.out.println(Solution.mostCountedWord("sd as as dfg wef we.f5 we.f5 we.f5 er er"));

        System.out.println("-------------------Solution---validate");
        System.out.println(Solution.validate(null));
        System.out.println(Solution.validate(""));
        System.out.println(Solution.validate("dfhhfh"));
        System.out.println(Solution.validate("http://"));
        System.out.println(Solution.validate("http://.com"));
        System.out.println(Solution.validate("http://g.com"));
        System.out.println(Solution.validate("http://gerg5.com"));
        System.out.println(Solution.validate("http://gerg.com"));
        System.out.println(Solution.validate("https://ger.g.org"));
        System.out.println(Solution.validate("https://555.org"));
        System.out.println(Solution.validate("https://www.net"));
        System.out.println(Solution.validate("https://www.ff.org"));
        System.out.println(Solution.validate("https://www..org"));

    }

}
