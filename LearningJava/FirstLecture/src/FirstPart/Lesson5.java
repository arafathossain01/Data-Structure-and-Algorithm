package FirstPart;

// Typecasting নিয়ে আলোচনা।
public class Lesson5 {
    public static void main(String[] args) {
        int number = 10;
        double mynum = number;
        System.out.println(mynum); // automatically

        double mark = 80.98;
        int convert = (int) mark; // manually casting
        System.out.println(convert);
    }
}
/*
 * Type Casting প্রয়োজন হয় যখন একটা data type থেকে অন্য data type এ convert করা
 * হয়।
 * Java তে ২ ধরনের type casting আছে।
 * ১। Automatically (Widening Casting) এটা byte -> short -> char -> int -> long
 * -> float -> double এই sequence এ কাজ করে।
 * ২। Manually (Narrowing Casting) এটা double -> float -> long -> int -> char ->
 * short -> byte এই sequence এ কাজ করে।
 */
