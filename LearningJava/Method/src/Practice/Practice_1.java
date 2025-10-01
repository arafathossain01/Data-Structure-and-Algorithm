package Practice;

public class Practice_1 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        swap(num1, num2);

    }

    static int swap(int a, int b) {
        System.out.println("Before swap: "+a+" "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.print("After swap: "+a + " " + b);

        return 0;
    }
}
