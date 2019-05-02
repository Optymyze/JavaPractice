package practice.Array;

public class Array {

    public static void main(String[] args) {
        int[] arr; //declaring array of integers

        arr = new int[5]; //allocating memory

        //initializing elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //accessing elements
        for (int i=0; i<arr.length; i++) {
            System.out.println("element at index "+i+" is : "+arr[i]);
        }
    }

}
