// Check Alphabet is uppercase or lowercase

import java.util.Scanner;

public class Practice_7 {
    public static void main(String[] args) {
        System.out.println("input: ");

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        in.close();

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is lowercase charecter.");
        } else {
            System.out.println(ch + " is uppercase charecter.");
        }
    }

}
