package practice.EnumerationInsideClass;

public class EnumerationInsideClass {

    enum Color {
        RED , GREEN , BLUE;
    }

    public static void main(String[] args) {
        Color color = Color.GREEN;
        System.out.println(color);
    }
}
