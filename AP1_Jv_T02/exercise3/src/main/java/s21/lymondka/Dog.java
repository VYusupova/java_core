package s21.lymondka;

public class Dog extends Animal implements Omnivore {
    Dog(String name, int age){
        super(name,age);
    }

    /*@Override
    public double getFeedInfoKg(){
        return getWeight() * 0.3;
    }*/

    @Override
    public String toString(){
        String age = ", age = " + String.valueOf(getAge());
        String name = "Dog name = " + getName();
        return  name + age + ". " + hunt();
    }
    @Override
    public String hunt(){
        return "I can hunt for robbers";
    }
}
