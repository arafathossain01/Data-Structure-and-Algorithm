// print Nth even number

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        System.out.print("input: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        int num = 1;
        while (num <= number) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }

}
