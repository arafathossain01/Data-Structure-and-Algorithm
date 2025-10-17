package Practice;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {

        // swap in array
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Before swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter firat index: ");
        int index1 = input.nextInt();
        System.out.print("Enter second index: ");
        int index2 = input.nextInt();
        swap(arr, index1, index2);
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        // System.out.println(arr[index1] + " " + arr[index2]);
        System.out.print("After swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
