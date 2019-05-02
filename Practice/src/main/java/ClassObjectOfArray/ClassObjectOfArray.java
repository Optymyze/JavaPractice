package ClassObjectOfArray;

public class ClassObjectOfArray {

    public static void main(String[] args) {
        int intArray[] = new int[4];
        byte byteArray[] = new byte[4];
        short shortArray[] = new short[4];

        String[] stringArray = new String[4];

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());

        System.out.println(byteArray.getClass());
        System.out.println(byteArray.getClass().getSuperclass());

        System.out.println(shortArray.getClass());
        System.out.println(shortArray.getClass().getSuperclass());

        System.out.println(stringArray.getClass());
        System.out.println(stringArray.getClass().getSuperclass());

    }
}
