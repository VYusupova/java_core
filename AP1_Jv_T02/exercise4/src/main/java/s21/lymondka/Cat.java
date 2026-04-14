package s21.lymondka;

public class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        String name = "Cat name = " + getName();
        String age = ", age = " + String.valueOf(getAge());
        return name + age ;
    }

}
