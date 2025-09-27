// print Nth odd number

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        System.out.print("input number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        for (int num = 1; num <= number; num++) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
