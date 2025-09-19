package FirstPart;

// Operator নিয়ে আলোচনা। 
public class Lesson4 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 20;

        // Arithmetic operator
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2; // ভাগশেষ দিবে।
        int increment = ++num1;
        int dicrement = --num2;
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        System.out.println("Increment: " + increment);
        System.out.println("Dicrement: " + dicrement);

        // Comparison Operator

        System.out.println(num1 > num2); // if right return true else false
        System.out.println(num1 == num2); // সমান কি না?
        System.out.println(sum != mul); // সমান নয়
        /*
         * Comparison Operator
         * x>y greater than
         * x<y less than
         * x!=y not equal
         * x==y equal to
         * x>=y greather than or equal to
         * x<=y less than or equal to
         */

        // Logical operator
        boolean log = true;
        boolean logarithm = false;
        System.out.println(log && logarithm); // logical and (যদি দুইটা ফলাফলই খাটে তাহলে program run হবে)
        System.out.println(!logarithm); // Logical not (যদি result সত্য হয় তাহলে মিথ্যা বানায়ে দিবে)
        System.out.println(log || logarithm); // Logical or (দুইটার মধ্যে যেকোনো একটা খাটলেই program run হবে)

    }
}
