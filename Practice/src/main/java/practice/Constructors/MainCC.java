package practice.Constructors;

public class MainCC {

    public static void main(String[] args) {
        ComplexCC c1 = new ComplexCC(10,20);
        System.out.println(c1);

        ComplexCC c2 = new ComplexCC(c1);
        System.out.println(c2);

        ComplexCC c3 = c2;
        System.out.println(c3);
    }
}
