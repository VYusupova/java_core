package s21.lymondka;

public class Dog extends Animal {
    Dog(String name, int age){
        super(name,age);
    }

    @Override
    public String toString(){
        String age = ", age = " + String.valueOf(getAge());
        String name = "Dog name = " + getName();
        return  name + age;
    }

}
