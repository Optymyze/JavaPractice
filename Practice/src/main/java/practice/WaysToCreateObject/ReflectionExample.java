package practice.WaysToCreateObject;

import java.lang.reflect.Constructor;

public class ReflectionExample {

    private String name;

    public ReflectionExample() {
        System.out.println("No parameter constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        try {
            Constructor<ReflectionExample> constructor = ReflectionExample.class.getDeclaredConstructor();

            ReflectionExample reflectionExample = constructor.newInstance();

            reflectionExample.setName("new instance method of constructor");

            System.out.println(reflectionExample.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
