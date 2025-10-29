package firstProgramm;

public class Animals {
    public String name;
    private Integer age;
    protected static Integer date;
    Integer date2;


    public void speak() {
        System.out.println("реализуем заговор против кожанных");
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
