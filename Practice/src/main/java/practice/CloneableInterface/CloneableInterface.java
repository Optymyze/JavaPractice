package practice.CloneableInterface;

public class CloneableInterface implements Cloneable {

    int i;
    String j;

    public CloneableInterface(int i, String j) {
        this.i = i;
        this.j = j;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
