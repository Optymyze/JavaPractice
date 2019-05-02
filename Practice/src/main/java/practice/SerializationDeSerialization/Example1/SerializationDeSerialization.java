package practice.SerializationDeSerialization.Example1;

import java.io.Serializable;

public class SerializationDeSerialization implements Serializable {

    private int i;
    private String name;

    public SerializationDeSerialization(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
