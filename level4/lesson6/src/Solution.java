import java.io.IOException;
import java.io.*;
import java.io.InputStream;
import java.util.Date;

public class Solution {

    public static void main(String[] args) throws IOException {

        java.io.InputStream input = System.in;
        Reader inputStreamReader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int n1 = Integer.parseInt(bufferedReader.readLine());
        int n2 = Integer.parseInt(bufferedReader.readLine());
        int n3 = Integer.parseInt(bufferedReader.readLine());
        int n4 = Integer.parseInt(bufferedReader.readLine());

        System.out.println(minOutOfTwo(n1, n2));
        System.out.println(maxOutOfTwo(n1, n2));
        System.out.println(maxOutOfFour(n1, n2, n3, n4));


    }
    //Минимум двух чисел
    public static int minOutOfTwo(int a, int b){
        if (a<b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static int maxOutOfTwo(int a, int b){
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    //Максимум четырех чисел
    public static int maxOutOfFour(int a, int b, int c, int d){
        return maxOutOfTwo(maxOutOfTwo(a,b), maxOutOfTwo(c, d));
    }
    //Сортировка трех чисел
    public static void threeNumbersSort(int a, int b, int c){
        if (a < b & b < c){
            System.out.println(STR."\{a} \{b} \{c}");
        }
    }


}
