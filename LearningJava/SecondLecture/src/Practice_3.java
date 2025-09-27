// print Nth number

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        input.close();

        for (int num = 1; num <= number; num++) {
            System.out.print(num + " ");
        }
    }
}
