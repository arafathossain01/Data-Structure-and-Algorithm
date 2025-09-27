// Find the largest of 3 numbers

import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {
        System.out.print("input: ");

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        input.close();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is larger of " + number1 + " " + number2 + " " + number3 + " these number");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is larger of " + number1 + " " + number2 + " " + number3 + " these number");
        } else {
            System.out.println(number3 + " is larger of " + number1 + " " + number2 + " " + number3 + " these number");
        }
    }
}
