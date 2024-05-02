import java.io.*;
import java.io.InputStream;

public class Main
{
    public static <InputStream> void main(String[] args) throws IOException {
        //Вывести на экран дату своего рождения в виде: MAY 1 2012
        System.out.println("MAY 1 2012");
        //Вывести на экран произведение чисел от 1 до 10.
        System.out.println(2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);
        //Вывести на экран сумму чисел от 1 до 10 построчно:
        sum(10);

        //Мама была раму все комбинации
        String mama = "Мама";
        String myla = "Мыла";
        String ramu = "Раму";
        System.out.println(mama + myla+ ramu);
        System.out.println(mama + ramu+ myla);
        System.out.println(myla + mama+ ramu);
        System.out.println(myla + ramu+ mama);
        System.out.println(ramu + myla+ mama);
        System.out.println(ramu + mama+ myla);

        //Выведи на экран таблицу умножения 10 на 10 в следующем виде:
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        System.out.println("2 4 6 8 10 12 14 16 18 20");
        System.out.println("3 6 9 12 15 18 21 24 27 30");
        System.out.println("4 8 12 16 20 24 28 32 36 40");
        System.out.println("5 10 15 20 25 30 35 40 45 50");
        System.out.println("6 12 18 24 30 36 42 48 54 60");
        System.out.println("7 14 21 28 35 42 49 56 63 70");
        System.out.println("8 16 24 32 40 48 56 64 72 80");
        System.out.println("9 18 27 36 45 54 63 72 81 90");
        System.out.println("10 20 30 40 50 60 70 80 90 100");

        //Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
        System.out.println("Red, Orange, Yellow");
        System.out.println("Green, Blue, Indigo");
        System.out.println("Violent");

        //Экранирование
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"\n");

        //Chineese
        System.out.println("日本語");

        //Ввести с клавиатуры число и имя, вывести на экран строку:
        //«имя» захватит мир через «число» лет. Му-ха-ха!
        java.io.InputStream input = System.in;
        Reader inputStreamReader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        String years = bufferedReader.readLine();
        int years2 = Integer.parseInt(years); //преобразовываем строку в число.
        System.out.println(STR."\{name} захватит мир через \{years2} лет");


        //Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет
        String name2 = bufferedReader.readLine();
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println(STR."\{name2} получает \{num1} через \{num2} лет");

        //Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
        System.out.println(STR."\{name2} зарабатывает $5,000. Ха-ха-ха!");

        //Ввести с клавиатуры два имени и вывести надпись:
        //name1 проспонсировал name2, и она стала известной певицей.
        System.out.println(STR."\{name} спонсировал \{name2}, и она стала известной певицей");

        //Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!
        String name3 = bufferedReader.readLine();
        System.out.println(STR."\{name} + \{name2} + \{name3} = love");
    }
    public static int sum(int n) {
        int sum = 0;
        for (int k = 1; k <= n; k++) {
            System.out.println(sum+=k);
        }
        return n;
    }
}
