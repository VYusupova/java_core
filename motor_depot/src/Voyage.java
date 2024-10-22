public class Voyage {
    private String numberVoyage;
    private String pointDeparture;
    private String pointDestination;
    protected String numDriver;
    protected String numCar;
    protected boolean voyageSuccess = false;

    Voyage(String num){
        this.numberVoyage = num;
    }

    Voyage(String num, String point_departure, String point_destination){
        this.numberVoyage = num;
        this.pointDeparture = point_departure;
        this.pointDestination = point_destination;
    }

    public String getNumberVoyage() {
        return numberVoyage;
    }

    public void setNumberVoyage(String number_voyage) {
        this.numberVoyage = numberVoyage;
    }

    public String getPointDeparture() {
        return pointDeparture;
    }

    public void setPointDeparture(String pointDeparture) {
        this.pointDeparture = pointDeparture;
    }

    public String getPointDestination() {
        return pointDestination;
    }

    public void setPointDestination(String pointDestination) {
        this.pointDestination = pointDestination;
    }

    public void printInfoVoyage(){
        System.out.println("Рейс "+getNumberVoyage());
        System.out.print("следует из "+ getPointDeparture());
        System.out.println(" в " +  getPointDestination());
        System.out.println("водитель на маршруте " + numDriver);
        System.out.println("машина на маршруте " + numCar);
        System.out.println("маршрут закончен -  " + voyageSuccess);
        System.out.println("_______________________");
    }
}
