// Find nth fibonacci number

import java.util.Scanner;

public class Practice_8 {
    public static void main(String[] args) {
        System.out.print("input: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        int previous = 0;
        int current = 1;

        int count = 2;

        if (number == 0) {
            System.out.println(number);
        } else if (number == 1) {
            System.out.println(number);
        } else {
            while (count <= number) {
                int temp = current;
                current = current + previous;
                previous = temp;

                count++;
            }
            System.out.println(current);
        }
    }
}
