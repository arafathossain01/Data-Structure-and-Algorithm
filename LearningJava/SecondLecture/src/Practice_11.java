import java.util.Scanner;

public class Practice_11 {

    public static void main(String[] args) {
        // Q: print the sum of two numbers.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        input.close();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
