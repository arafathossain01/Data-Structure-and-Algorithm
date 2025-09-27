// Even Odd checking

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
