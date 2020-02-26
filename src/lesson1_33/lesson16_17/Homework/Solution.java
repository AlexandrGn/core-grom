package lesson1_33.lesson16_17.Homework;

import java.util.Arrays;

public class Solution {
    public static int countWords(String input) {
        String words[] = input.split(" ");
        int count = 0;
        for (String s : words)
            if (wordLetter(s)) count++;
        return count;
    }

    public static String maxWord(String input) {
        String[] strings = input.split(" ");
        if (strings == null || strings.length == 0) return null;

        String max = strings[0];
        for (String s : strings) {
            if (wordLetter(s) && s.length() > max.length())
                max = s;
        }

        if (max.isEmpty()) return null;
        return max;
    }

    public static String minWord(String input) {
        String[] strings = input.split(" ");
        if (strings == null || strings.length == 0) return null;

        String min = strings[0];
        for (String s : strings) {
            if (wordLetter(s) && s.length() < min.length())
                min = s;
        }

        if (min.isEmpty()) return null;
        return min;
    }

    public static String mostCountedWord(String input) {
        String[] strings = input.split(" ");
        if (strings == null) return null;

        int count = 0;
        String word = null;
        for (int i = 0; i < strings.length; i++) {
            if (!wordLetter(strings[i])) continue;
            int count1 = 1;
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j]))
                    count1++;
            }
            if (count1 > count) {
                count = count1;
                word = strings[i];
            }
        }

        return word;
    }

//    public static boolean validate(String address) {
//        if (address == null || address.isEmpty()) return false;
//
//        String newAddress= new String(address);
//
//        String adressStart[] = {"http://", "https://"};
//        String adressFinish[] = {".com", ".org", ".net"};
//
//        boolean b=false;
//
//        for (String s : adressStart) {
//            if (newAddress.startsWith(s)) {
//                newAddress=newAddress.replaceFirst("s","");
//                b=true;
//                break;
//            }
//        }
//        if (b == false) return false;
//
//        if (newAddress.startsWith("www."))
//            newAddress=newAddress.replaceFirst("www.","");
//
//        b=false;
//        for (String s : adressFinish) {
//            if (newAddress.endsWith(s)) {
//                newAddress=newAddress.
//                b=true;
//                break;
//            }
//        }
//        if (b == false) return false;
//
//
//
////        if (words.length==3 )
//
//
//        return true;
//    }

    public static boolean validate(String address) {
        if (address == null || address.isEmpty()) return false;

        String adressStart[] = {"http://", "https://"};
        String adressFinish[] = {".com", ".org", ".net"};

        int countStart = 0;
        int countFinish = 0;

        for (String s : adressStart) {
            if (address.startsWith(s)) {
                countStart = s.length();
                break;
            }
        }
        if (countStart == 0) return false;

        for (String s : adressFinish) {
            if (address.endsWith(s)) {
                countFinish = s.length();
                break;
            }
        }
        if (countFinish == 0) return false;

        String wordInAdress = address.substring(countStart, address.length() - countFinish);
        if (wordInAdress.startsWith("www.")) countStart += "www.".length();

        if (!wordLetterAndDigit(address.substring(countStart, address.length() - countFinish))) return false;

        return true;
    }


    private static String[] words(String input) {
        //Розбиває строку на масив слів, які в строці розділені пробелом
        //слова це тільки букви, без спеціальних знаків і цифр
        //вертає null якщо слів немає
        //вертає масив слів, якщо є хоча би одне слово
        String[] strings = input.split(" ");
        int count = 0;
        for (String s : strings) {
            if (wordLetter(s)) count++;
        }

        if (count == 0) return null;
        String[] newString = new String[count];

        int i = 0;
        for (String s : strings) {
            if (wordLetter(s))
                newString[i++] = s;
        }

        return newString;
    }

    private static boolean wordLetter(String word) {
        //вертає тру якщо в строці тільки букви
        //вертає фолс, якшо  є хоча б одна цифра або спеціальний знак або порожній стрінг
        if (word.isEmpty()) return false;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) return false;
        }
        return true;
    }

    private static boolean wordLetterAndDigit(String word) {
        //вертає тру якщо в строці тільки букви або цифри
        //вертає фолс, якшо  є хоча б один спеціальний знак або порожній стрінг
        if (word.isEmpty()) return false;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c) && !Character.isDigit(c)) return false;
        }
        return true;
    }

    private static boolean wordInStartWord(String word1, String word2) {
        if (word1 == null || word2 == null || word1.isEmpty() || word2.isEmpty() || word2.length() > word1.length())
            return false;
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int i = 0;
        for (char c : chars2) {
            if (chars1[i++] != c) return false;
        }
        return true;
    }

    private static boolean wordInEndWord(String word1, String word2) {
        if (word1 == null || word2 == null || word1.isEmpty() || word2.isEmpty() || word2.length() > word1.length())
            return false;
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        for (int i = word1.length() - 1, j = word2.length() - 1; j >= 0; i--, j--) {
            if (chars1[i] != chars2[j]) return false;
        }
        return true;
    }

    public static void Demo() {
        System.out.println("---------Тестировка приватных методов-----------");

        System.out.println("---------------------words");
        System.out.println(Arrays.toString(words("")));
        System.out.println(Arrays.toString(words("word")));
        System.out.println(Arrays.toString(words("word word")));
        System.out.println(Arrays.toString(words("   ")));
        System.out.println(Arrays.toString(words("  word   ")));
        System.out.println(Arrays.toString(words("   word    word   ")));
        System.out.println(Arrays.toString(words("word1 word2 word3")));
        System.out.println(Arrays.toString(words("   word1    word2 word354 rdth  rtg     ")));

        System.out.println("---------------------wordLetter");
        System.out.println(wordLetter("wqefgv"));
        System.out.println(wordLetter(""));
        System.out.println(wordLetter("   "));
        System.out.println(wordLetter("wqfd  5efgv"));
        System.out.println(wordLetter("wqfd5efgv"));
        System.out.println(wordLetter("wqfdefg,v"));
        System.out.println(wordLetter("wqfdefgv "));

        System.out.println("---------------------wordLetterAndDigit");
        System.out.println(wordLetterAndDigit("wqefgv"));
        System.out.println(wordLetterAndDigit(""));
        System.out.println(wordLetterAndDigit("   "));
        System.out.println(wordLetterAndDigit("wqfd  5efgv"));
        System.out.println(wordLetterAndDigit("wqfd5efgv"));
        System.out.println(wordLetterAndDigit("wqfdefg,v"));
        System.out.println(wordLetterAndDigit("wqfdefgv "));

        System.out.println("---------------------wordInStartWord");
        System.out.println(wordInStartWord("", ""));
        System.out.println(wordInStartWord("ewrg", ""));
        System.out.println(wordInStartWord("", "wef"));
        System.out.println(wordInStartWord("abc", "abc"));
        System.out.println(wordInStartWord("abc", "abcd"));
        System.out.println(wordInStartWord("abcd", "ab"));
        System.out.println(wordInStartWord("abcd", "ac"));
        System.out.println(wordInStartWord("  d", "d"));
        System.out.println(wordInStartWord("ab", "t"));

        System.out.println("---------------------wordInEndWord");
        System.out.println(wordInEndWord("", ""));
        System.out.println(wordInEndWord("ewrg", ""));
        System.out.println(wordInEndWord("", "wef"));
        System.out.println(wordInEndWord("abc", "abc"));
        System.out.println(wordInEndWord("abc", "abcd"));
        System.out.println(wordInEndWord("abcd", "ab"));
        System.out.println(wordInEndWord("abcd", "ac"));
        System.out.println(wordInEndWord("  d", "d"));
        System.out.println(wordInEndWord("ab", "t"));


        System.out.println("---------Конец тестировки приватных методов-----------");
    }

}