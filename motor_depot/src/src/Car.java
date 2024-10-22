public class Car {
    private final String numberCar;

    protected String numVoyage;
    protected String numDriver;
    protected boolean needFixUp = false;

    Car(String numberCar){
        this.numberCar = numberCar;
    }

    protected String getNumberCar() {
        return numberCar;
    }


}
