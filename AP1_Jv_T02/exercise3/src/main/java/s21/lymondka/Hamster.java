package s21.lymondka;

public class Hamster extends Animal implements Herbivore {
    Hamster(String name, int age){
        super(name,age);
    }

    @Override
    public String toString(){
        String name = "Hamster name = " + getName();
        String age = ", age = " + String.valueOf(getAge());
        return  name + age + ". " + chill();
    }

    @Override
    public String chill(){
        return "I can chill for 8 hours";
    }
}
