import java.util.Scanner;

public class Int_method {
    public static void main(String[] args) {

        System.out.print("Enter numbers: ");

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();

        int result = sum(number1, number2);

        System.out.println("Sum: " + result);

    }

    // this function will be return int value.
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
