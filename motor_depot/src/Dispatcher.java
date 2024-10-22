public class Dispatcher {
    private String name;
    private int num;

    Dispatcher(){
        this.name = "name";
        this.num = 123;
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
        d.num_voyage = v.getNumber_voyage();
    }
    public void setVoyageCar(Voyage v, Car c){
        v.numDriver = c.getNumber_car();
        c.num_voyage = v.getNumber_voyage();
    }
}
