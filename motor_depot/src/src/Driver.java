
public class Driver {
    private final String name;
    private final String number;
    protected String numVoyage;
    protected boolean driverIsWork = true;

    Driver(String name, String num){
        this.name = name;
        this.number = num;
    }
    public String getNum() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void requestFixCar(Car c){
        c.needFixUp = true;
    }

    public void voyageSuccess(Voyage v){
        v.voyageSuccess = true;
    }

    public void infoDriver(){
        System.out.println("___Водитель - "+getName());
        System.out.println("___номер водителя - "+number);
        System.out.println("___на маршруте - " + numVoyage);
        System.out.println("___готовность к работе - " + driverIsWork);
        System.out.println("_______________________");
    }

}
