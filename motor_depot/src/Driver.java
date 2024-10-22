public class Driver {
    private String name;
    private String number;
    protected String num_voyage;

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
}
