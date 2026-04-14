package s21.lymondka;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

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

    @Override
    Instant goToWalk() {
        double tWalk = (getAge()*0.5);
        try {
            TimeUnit.SECONDS.sleep((long) tWalk);
        } catch (InterruptedException e) {
            System.out.println("DOG interrupt to walk");
        }
        return Instant.now();
    }
}
