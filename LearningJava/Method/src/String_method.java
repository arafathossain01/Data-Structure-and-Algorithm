import java.util.Scanner;

public class String_method {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first_name = input.nextLine();
        System.out.print("Enter your last name: ");
        String last_name = input.nextLine();
        input.close();

        String fullName = name(first_name, last_name);

        System.out.println("Your name: " + fullName);

    }

    static String name(String fName, String lName) {
        String fullName = fName + " " + lName;
        return fullName;
    }
}
