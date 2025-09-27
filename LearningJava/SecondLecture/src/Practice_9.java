// Count same digit in a number

import java.util.Scanner;

public class Practice_9 {
    public static void main(String[] args) {
        System.out.print("input number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print("input what you count: ");
        int num = input.nextInt();
        input.close();

        int count = 0;
        while (number > 0) {
            int reminder = number % 10;
            if (reminder == num) {
                count++;
            }
            number = number / 10;

        }

        System.out.println("The " + num + " is exsist at " + count + " times.");
    }
}
