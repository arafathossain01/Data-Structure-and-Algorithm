import java.util.Arrays;
public class to_String {
    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr)+" ");
        }
    }
}
