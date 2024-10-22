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
}
