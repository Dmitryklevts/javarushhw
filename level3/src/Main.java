//import java.io.*;
//import java.io.InputStream;
//import java.util.Date;
//
//public class Main {
//    public static <InputStream> void main(String[] args) throws IOException {
//        //Вывести на экран дату своего рождения в виде: MAY 1 2012
//        System.out.println("MAY 1 2012");
//        //Вывести на экран произведение чисел от 1 до 10.
//        System.out.println("Произведение чисел от 1 до 10");
//    }
//
//    public static int multiplication(int count) {
//        for (int k = 1; k <= count; k++) {
//            int k1 = k * k;
//            return k;
//        }
//
//
//        //Вывести на экран сумму чисел от 1 до 10 построчно:
//        System.out.println("Cумма чисел от 1 до 10 построчно:");
//        for (int k = 1, sum = 0; k <= 10; k++) {
//            int j = sum;
//            sum += k;
//            System.out.println(STR."\{j} + \{k} = \{sum}");
//        }
//
//
//        //Мама была раму все комбинации
//        // TODO: Сделать с перебором в цикле
//        // TODO: Сделать конкатенацию строк через StringBuilder
//        // TODO: Почитать про классы, интерфейсы, абстрактные классы,
//        //  модификаторы доступа, статические поля и методы
//        // TODO: Сделай интерфейс Animal и у него метод sound() и несколько классов
//        //  реализующих этот интерфейс (например, собака "гав" и т.д.)
//        String mama = "Мама";
//        String myla = "Мыла";
//        String ramu = "Раму";
//        System.out.println(mama + myla + ramu);
//        System.out.println(mama + ramu + myla);
//        System.out.println(myla + mama + ramu);
//        System.out.println(myla + ramu + mama);
//        System.out.println(ramu + myla + mama);
//        System.out.println(ramu + mama + myla);
//
//        //Выведи на экран таблицу умножения 10 на 10 в следующем виде:
//        // TODO: Сделать с двойным циклом - DONE
//
//        for (int k = 1; k <= 10; k++) {
//            System.out.println();
//            for (int j = k; j <= 10; j++) {
//                System.out.printf("%4d", k * j);
//            }
//        }
//
//        //Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
//        System.out.println("Red, Orange, Yellow");
//        System.out.println("Green, Blue, Indigo");
//        System.out.println("Violent");
//
//        //Экранирование
//        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
//        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"\n");
//
//        //Chineese
//        System.out.println("日本語");
//
//        //Ввести с клавиатуры число и имя, вывести на экран строку:
//        //«имя» захватит мир через «число» лет. Му-ха-ха!
//        java.io.InputStream input = System.in;
//        Reader inputStreamReader = new InputStreamReader(input);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        String name = bufferedReader.readLine();
//        String years = bufferedReader.readLine();
//        int years2 = Integer.parseInt(years); //преобразовываем строку в число.
//        System.out.println(STR."\{name} захватит мир через \{years2} лет");
//
//
//        //Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет
//        String name2 = bufferedReader.readLine();
//        int num1 = Integer.parseInt(bufferedReader.readLine());
//        int num2 = Integer.parseInt(bufferedReader.readLine());
//        System.out.println(STR."\{name2} получает \{num1} через \{num2} лет");
//
//        //Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
//        System.out.println(STR."\{name2} зарабатывает $5,000. Ха-ха-ха!");
//
//        //Ввести с клавиатуры два имени и вывести надпись:
//        //name1 проспонсировал name2, и она стала известной певицей.
//        System.out.println(STR."\{name} спонсировал \{name2}, и она стала известной певицей");
//
//        //Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!
//        String name3 = bufferedReader.readLine();
//        System.out.println(STR."\{name} + \{name2} + \{name3} = love");
//    }
//
//
//}
