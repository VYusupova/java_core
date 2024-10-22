public class Voyage {
    private String number_voyage;
    private String point_departure;
    private String point_destination;

    Voyage(String num){
        this.number_voyage = num;
    }

    Voyage(String num, String point_departure, String point_destination){
        this.number_voyage = num;
        this.point_departure = point_departure;
        this.point_destination = point_destination;
    }

    public void print_info_voyage(){
        System.out.println("Рейс"+getNumber_voyage());
        System.out.print("следует из "+point_departure);
        System.out.println(" в " +point_destination );
    }
    public String getNumber_voyage() {
        return number_voyage;
    }

    public void setNumber_voyage(String number_voyage) {
        this.number_voyage = number_voyage;
    }

    public String getPoint_departure() {
        return point_departure;
    }

    public void setPoint_departure(String point_departure) {
        this.point_departure = point_departure;
    }

    public String getPoint_destination() {
        return point_destination;
    }

    public void setPoint_destination(String point_destination) {
        this.point_destination = point_destination;
    }

}
