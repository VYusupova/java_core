package s21.lymondka;

public class GuineaPig extends Animal implements Herbivore {
    GuineaPig(String name, int age){
        super(name,age);
    }

    @Override
    public String toString(){
        String name = "GuineaPig name = " + getName();
        String age = ", age = " + String.valueOf(getAge());
        return  name + age  + ". " + chill();
    }

    @Override
    public String chill(){
        return "I can chill for 12 hours";
    }

}
