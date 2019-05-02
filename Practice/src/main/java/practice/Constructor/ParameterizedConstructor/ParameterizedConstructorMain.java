package practice.Constructor.ParameterizedConstructor;

public class ParameterizedConstructorMain {

    public static void main(String[] args) {

        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(1,"name");

        System.out.println(parameterizedConstructor.getNum());
        System.out.println(parameterizedConstructor.getName());
    }
}
