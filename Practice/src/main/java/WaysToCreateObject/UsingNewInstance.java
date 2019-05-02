package WaysToCreateObject;

public class UsingNewInstance {

    String name = "name";

    public static void main(String[] args) {

        try {

            Class cls = Class.forName("UsingNewInstance");

            UsingNewInstance object = (UsingNewInstance) cls.newInstance();

            System.out.println(object.name);

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException is caught");
        } catch (InstantiationException e) {
            System.out.println("InstantiationException is caught");
        }
    }
}
