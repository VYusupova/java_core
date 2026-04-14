package s21.lymondka;

public class Cat extends Animal{
    Cat(String name, int age, double weight ){
        super(name,age,weight);
    }

    @Override
    public String toString(){
        String name = "Cat name = " + getName();
        String age = ", age = " + String.valueOf(getAge());
        String mass = String.format(", mass = %.2f", getWeight());
        String feed = String.format(", feed = %.2f", getFeedInfoKg());
        return  name + age + mass + feed;
    }

    @Override
    public double getFeedInfoKg(){
        return getWeight() * 0.1;
    }
}
