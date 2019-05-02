package practice.CloneableInterface;

public class MainCloneable {

    public static void main(String[] args) throws CloneNotSupportedException {

        CloneableInterface cloneableInterface1 = new CloneableInterface(1,"Karishmaa");

        CloneableInterface cloneableInterface2 = (CloneableInterface) cloneableInterface1.clone();

        System.out.println(cloneableInterface2.i);
        System.out.println(cloneableInterface2.j);
    }

}
