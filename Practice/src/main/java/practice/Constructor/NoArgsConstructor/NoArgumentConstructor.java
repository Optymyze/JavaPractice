package practice.Constructor.NoArgsConstructor;

public class NoArgumentConstructor {

    private int num;
    private String name;

    public NoArgumentConstructor() {
        System.out.println("No Args constructor called");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
