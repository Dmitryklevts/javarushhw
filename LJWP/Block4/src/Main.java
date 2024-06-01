import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nLetters = 0;
        Scanner girl = new Scanner(System.in);
        System.out.print("Введите имя девушки -->");
        String girlName = girl.next();
        nLetters = switch(girlName){
            case "Jane", "Sean", "Alan", "Paul" -> 4;
            case "Janet", "Susan" -> 5;
            case "Maaike", "Alison" , "Miriam" -> 6;
            default -> throw new IllegalStateException("Unrecognized name: "+girlName);
        };
        System.out.println(nLetters);

        Scanner cat = new Scanner(System.in);
        System.out.print("Введите имя кошьки -->");
        String catName = cat.next();

        switch (catName){
            case "Китюк":
                System.out.println("Вашу кошьку зовут Китюк");
                break;
            case "Напердыш":
                System.out.println("Вашу кошьку зовут Напердыш");
                break;
            default:
                System.out.println("Ваша кошька нам неизвестна, извините");
        }





        /*    ifDaysInMonth();

    }

    public static void ifDaysInMonth(){
        final int JAN=1;final int FEB=2;final int MAR=3; // define constants
        final int APR=4;final int MAY=5;final int JUN=6;
        final int JUL=7;final int AUG=8;final int SEP=9;
        final int OCT=10;final int NOV=11;final int DEC=12;

        Scanner sc = new Scanner(System.in);    // import java.util.Scanner;
        System.out.print("Enter month (1..12) --> ");
        int month = sc.nextInt();

        int numDays=0;
        if(month == JAN || month == MAR || month == MAY || month == JUL
                || month == AUG || month == OCT || month == DEC) {
            numDays=31;
        } else if (month == APR || month == JUN || month == SEP || month == NOV) {
            numDays=30;
        } else if (month == FEB) {
            System.out.print("Enter year --> ");
            int year = sc.nextInt();
//                if( (A)         || (    B         &&       C)    ){
            if( (year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0)) ){
                numDays = 29; // leap year e.g. 2000, 2012, 2016
            }else{
                numDays = 28;   // 1900 (divisible by 100)
            }
        } else {
            System.out.println("Invalid month: "+month);
        }
        if(numDays > 0){
            System.out.println("Number of days is: "+numDays);
        }

         */
    }
}
