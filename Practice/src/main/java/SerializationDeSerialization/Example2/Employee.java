package SerializationDeSerialization.Example2;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final Long serialVersionUID = 123456789L;

    private String name;
    private int i;
    private static int a;
    private transient int b;

    public Employee(String name, int i, int a, int b) {
        this.name = name;
        this.i = i;
        this.a = a;
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        Employee.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
