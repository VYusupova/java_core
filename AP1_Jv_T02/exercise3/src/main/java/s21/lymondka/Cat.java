package s21.lymondka;

public class Cat extends Animal implements Omnivore {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        String name = "Cat name = " + getName();
        String age = ", age = " + String.valueOf(getAge());
        return name + age + ". " + hunt();
    }

    @Override
    public String hunt(){
        return "I can hunt for mice";
    }
}
