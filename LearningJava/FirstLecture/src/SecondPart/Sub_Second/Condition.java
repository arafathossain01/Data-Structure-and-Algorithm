package SecondPart.Sub_Second;

import java.util.*;

public class Condition {
    public static void main(String[] args) {
        System.out.print("Put your one subject mark: ");

        Scanner input = new Scanner(System.in);

        float mark = input.nextFloat();
        input.close();

        if (mark > 100) {
            System.out.println("Your input is invalid");
        } else if (mark <= 100 && mark >= 80) {
            System.out.println("You got: A+");
        } else if (mark <= 79 && mark >= 75) {
            System.out.println("You got: A");
        } else if (mark <= 74 && mark >= 70) {
            System.out.println("You got: A-");
        } else if (mark <= 69 && mark >= 65) {
            System.out.println("You got: B+");
        } else if (mark <= 64 && mark >= 60) {
            System.out.println("You got: B");
        } else if (mark <= 59 && mark >= 55) {
            System.out.println("You got: B-");
        } else if (mark <= 54 && mark >= 50) {
            System.out.println("You got: C+");
        } else if (mark <= 49 && mark >= 45) {
            System.out.println("You got: C");
        } else if (mark <= 44 && mark >= 40) {
            System.out.println("You got: D");
        } else {
            System.out.println("You are fail.");
        }
    }
}
