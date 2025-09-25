package SecondPart;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

        System.out.print("Input a number: ");

        Scanner input = new Scanner(System.in);
        System.out.println("The number is: " + input.nextInt());
    }
}

/*
 * java তে user input নেওয়ার জন্য Scanner class ব্যবহার করতে হয়। Scanner class
 * টি java.util package এর ভিতরে থাকে। যাকে import করে নিতে হয়।
 * import করার পর Scanner এর একটি obj বানাতে হয়। উপরের code এ input হলো obj এর নাম।
 * 
 * 
 */