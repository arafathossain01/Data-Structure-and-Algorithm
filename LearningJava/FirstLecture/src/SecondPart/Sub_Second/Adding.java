package SecondPart.Sub_Second;

import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {

        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);
        input.close();
    }
}
