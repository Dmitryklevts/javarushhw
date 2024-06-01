public class Main {
    public static void main(String[] args) {

        //Employee dima = new Employee("Dima", 1000000, 2022, 5, 25  );
        //dima.getName();

        //2. Задачи на видимость переменных

        //1.
        Cat cat = new Cat();
        cat.setName("Napuk");

        //2.
        Cat.addNewCat();

        //3.
        Cat.setCatsCount(10);

        //4.
        cat.setFullName("Naperdysh", "Kityukovich");

        //5.
        Cat cat1 = new Cat();
        Cat.count++;
        //написать тут ваш код
        Cat cat2 = new Cat();
        Cat.count++;
        //написать тут ваш код
        System.out.println("Cats count is " + Cat.count);


        /*
        Employee e = new Employee();
        int a = 1;
        e.foo(e, a);
        System.out.printf("%d - %d", e.age, a);

         */
    }
}

/*
Области видимости, модификаторы видимости
по умолчанию, если ничего не используем - package-private

3 основных
private - видно только классу
protected - классу, пакету и классам-наследникам
public - Всем

String s = new String("Mama");
String s2 = new String("Mama");
System.out.println(s == s2);
Происходит сравнение ссылок.
На экран будет выведено false.
Переменные хранят ссылки на два идентичных объекта String, но не на один и тот же.
Cat cat1 = new Cat("Vaska");
Cat cat2 = new Cat("Vaska");
System.out.println(cat1.equals(cat2));
Происходит сравнение объектов.
На экран будет выведено true.
Переменные хранят ссылки на два идентичных объекта Cat

 */