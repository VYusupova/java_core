package s21.lymondka;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

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

    @Override
    Instant goToWalk() {
        double tWalk = (getAge()*0.25);
        try {
            TimeUnit.SECONDS.sleep((long) tWalk);
        } catch (InterruptedException e) {
            System.out.println("CAT interrupt to walk");
        }
        return Instant.now();
    }
}
