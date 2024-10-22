// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Dispatcher d = new Dispatcher();
        Voyage v = new Voyage("45ke20", "Килиманджаро", "Эльбрус");
        Car car = new Car("c458gg31");
        Driver driver = new Driver("Timofei", "5");
        System.out.println(d.getName());

        v.printInfoVoyage();

        d.setVoyageDriver(v,driver);

        v.printInfoVoyage();

        d.setVoyageCar(v,car);

        v.printInfoVoyage();

        driver.infoDriver();

        driver.voyageSuccess(v);
        driver.requestFixCar(car);

    }
}