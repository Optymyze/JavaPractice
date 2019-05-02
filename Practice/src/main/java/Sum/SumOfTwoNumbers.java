package Sum;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int input1 = input.nextInt();

        System.out.println("Enter second number : ");
        int input2 = input.nextInt();

        int sum = input1 + input2;

        System.out.println("\npractice.Sum : "+sum);
    }
}
