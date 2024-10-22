public class Car {
    private final String number_car;

    protected String num_voyage;
    protected String num_driver;

    Car(String number_car){
        this.number_car = number_car;
    }

    protected String getNumber_car() {
        return number_car;
    }


}
