package s21.lymondka;

public abstract class Animal  {
    private String name;
    private int age;

    Animal (String name, int age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}
