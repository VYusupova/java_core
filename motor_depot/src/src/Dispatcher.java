public class Dispatcher {
    private String name;
    private int num;

    Dispatcher(){
        this.name = "No_name";
        this.num = 0;
    }

    Dispatcher(String name, int num){
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }



    public void setVoyageDriver(Voyage v, Driver d){
        v.numDriver = d.getNum();
        d.numVoyage = v.getNumberVoyage();
    }
    public void setVoyageCar(Voyage v, Car c){
        v.numCar = c.getNumberCar();
        c.numVoyage = v.getNumberVoyage();
        if (!v.numDriver.isEmpty()) c.numDriver = v.numDriver;
    }

    public void driverNotWork(Driver d){
        d.driverIsWork = false;
    }
}
