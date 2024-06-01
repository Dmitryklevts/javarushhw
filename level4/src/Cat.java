class Cat
{
    private String name;
    private static int catsCount = 0;
    static int count = 0;
    private String fullName;
    public void setFullName(String firstName, String lastName)
    {
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        //написать тут ваш код
    }
    public static void setCatsCount(int catsCount)
    {
        Cat.catsCount = catsCount;
        System.out.println(catsCount);
        //написать тут ваш код
    }
    public static void addNewCat()
    {
        Cat.catsCount += 1;
        System.out.println(Cat.catsCount);
        //написать тут ваш код
    }
    public void setName(String name)
    {
        this.name = name;
        System.out.println(name);
        //написать тут ваш код
    }

}