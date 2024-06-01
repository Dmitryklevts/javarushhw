public class Exersise3 {
    public static void main(String[] args) {
        /*
        int countOfDays = 365;
        boolean isALeapYear = countOfDays == 365? true : false;
        System.out.println(isALeapYear);

         */
        int currentYear = 2024;

        // Check if it is a leap year
        boolean isLeapYear = currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0);
        System.out.println("Is it a Leap Year? " + (isLeapYear ? "Yes" : "No"));

    }
}
