/**
 * Hello
 */

public class MethodCall {
    public static void main(String[] args) {
        int a = 10, b = 8, j = 20, k = 40;
        int m = min(a, b);
        int m2 = max(a, b);
        int m3 = minOutOfThree(a, b, j);
        int m4 = minOutOfFour(a, b, j, k);
        System.out.println(STR."Minimum is \{m}");
        System.out.println(STR."Maximum is \{m2}");
        System.out.println(STR."Minimum out of three is \{m3}");
        System.out.println(STR."Minimum out of four is \{m4}");
        threeStrings("I hate people");
        //threeStringsInOneRow("I hate people in one row");
        String m5 = threeStringsInOneRow("Китюшок ", 20);
        System.out.println(STR."20 Китюков из 10 \{m5}");
    }

    //минимум 2х чисел
    public static int min(int c, int d) {
        int m2;
        if (c < d)
            m2 = c;
        else
            m2 = d;
        return m2;
    }

    //максимум 2х чисел
    public static int max(int c, int d) {
        int m2;
        if (c < d)
            m2 = d;
        else
            m2 = c;
        return m2;
    }

    //минимум трех чисел
    public static int minOutOfThree(int c, int d, int e) {
        int m2;
        if (c < d && c < e) {
            m2 = c;
        } else if (c < d && c > e) {
            m2 = e;
        } else
            m2 = d;

        return m2;
    }

    // Минимум четырёх чисел
    public static int minOutOfFour(int c, int d, int e, int f) {
        int m2;
        if (min(c,d) < min(e,f)) {
            m2 = min(c, d);
        }
            else
                m2 = min(e,f);

        return m2;
    }
    //Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.

    public static void threeStrings(String simpleString){
        System.out.println(simpleString);
        System.out.println(simpleString);
        System.out.println(simpleString);
    }
    //Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке. Слова должны быть разделены пробелом и не должны сливаться в одно.

    // public static void threeStringsInOneRow(String complexString){
    //    System.out.println(STR."\{complexString} \{complexString} \{complexString}");
    //}


    public static String threeStringsInOneRow(String complexString, int count) {
        String m = "";
        int m1 = 0;
        while (m1 < count) {
            m = m + complexString;
            m1++;
        }
        return m;
    }
}
/*
Базовые типы

Их в Java 8:
boolean;
цыферки: byte, char, short, int, long;
нецелые цыферки: float, double.
 */