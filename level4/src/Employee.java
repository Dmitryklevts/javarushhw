import java.time.LocalDate;

public class Employee {
    //Fields (поля, они же переменные, могут быть с модификатором видимости private)
    private String name;
    private double salary;
    private LocalDate hireDay;
    int age = 18;

    //Constructor (конструктор класса, называется так же, как и сам класс)
    public Employee (String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // a method
    public String getName() {
        System.out.println(name);
        return name;
    }

    /*
    public static void foo(Employee e, int a){
        e.age = 42;
        a = 5;
    }

     */

}

/*
Поле this

int value;

setValue(int value) {
    this.value = value

    this.value это обращение к полю value класса, а =value это уже параметр метода setValue
}


Наследование

public class Manager extends Employee {

private double bonus

}

public void setBonus(double bonus){
    this.bonus = bonus
}

 */