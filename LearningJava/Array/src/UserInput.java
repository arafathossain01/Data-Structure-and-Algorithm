import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        /*For each loop
         * for (int num : arr){
         * System.out.print(num+" ");
         * }
         */
    }
}
