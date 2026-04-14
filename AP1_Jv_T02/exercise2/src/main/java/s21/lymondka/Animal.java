package s21.lymondka;

public abstract class Animal  {
    private String name;
    private int age;
    private double weight;

    Animal (String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    abstract double getFeedInfoKg();

    double getWeight(){
        return weight;
    }
}
