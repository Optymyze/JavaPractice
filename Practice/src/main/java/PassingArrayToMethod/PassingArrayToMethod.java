package PassingArrayToMethod;

public class PassingArrayToMethod {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        sum(arr);
    }

    private static void sum(int[] arr) {
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("sum of array elements : "+sum);
    }
}
