package practice.ReturnArrayFromMethod;

public class ReturnArrayFromMethod {

    public static void main(String[] args) {
        int arr[] = m1();

        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] m1() {
        return new int[] {1,2,3};
    }
}
