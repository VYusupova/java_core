public class Voyage {
    private String numberVoyage;
    private String pointDeparture;
    private String pointDestination;
    protected String numDriver;
    protected boolean voyageSuccess;

    Voyage(String num){
        this.numberVoyage = num;
    }

    Voyage(String num, String point_departure, String point_destination){
        this.numberVoyage = num;
        this.pointDeparture = point_departure;
        this.pointDestination = point_destination;
    }

    public void print_info_voyage(){
        System.out.println("Рейс "+getNumber_voyage());
        System.out.print("следует из "+pointDeparture);
        System.out.println(" в " +pointDestination );
        System.out.println("водитель на маршруте " + numDriver);
        System.out.println("_______________________");
    }
    public String getNumber_voyage() {
        return numberVoyage;
    }

    public void setNumber_voyage(String number_voyage) {
        this.numberVoyage = numberVoyage;
    }

    public String getPoint_departure() {
        return pointDeparture;
    }

    public void setPoint_departure(String pointDeparture) {
        this.pointDeparture = pointDeparture;
    }

    public String getPoint_destination() {
        return pointDestination;
    }

    public void setPoint_destination(String pointDestination) {
        this.pointDestination = pointDestination;
    }

}
