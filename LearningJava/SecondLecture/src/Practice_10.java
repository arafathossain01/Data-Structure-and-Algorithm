// Reverse

import java.util.Scanner;

public class Practice_10 {
    public static void main(String[] args) {
        System.out.print("input: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        int result = 0;

        while (number > 0) {
            int reminder = number % 10;
            result = result * 10 + reminder;
            number = number / 10;
        }

        System.out.println(result);
    }
}
