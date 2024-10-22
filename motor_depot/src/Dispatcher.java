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

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
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

    private void driverNotWork(Driver d){
        d.driverIsWork = false;
    }
}
