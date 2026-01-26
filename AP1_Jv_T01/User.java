package s21.lymondka;

public class User {
    private String name;
    private int age;

    public User(String name, int age) throws IllegalArgumentException {
        if (age <= 0) throw new IllegalArgumentException("Incorrect input. Age <= 0");
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isAdult() { return age >= 18; }
}
