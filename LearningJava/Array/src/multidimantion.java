import java.util.*;

public class multidimantion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row size: ");
        int r = input.nextInt();

        System.out.print("Enter the column size: ");
        int c = input.nextInt();

        int[][] arr = new int[r][c];

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr [row][col] = input.nextInt();
            }
        }

        System.out.println("output is: ");
        //output
         for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        input.close();
    }
}

/*
 * arr.length --> number of row
 * arr[row].length --> how many column in a row
 */
