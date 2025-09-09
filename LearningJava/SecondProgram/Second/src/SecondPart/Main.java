package SecondPart;

// This is string page
public class Main {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("String is: " + alphabet);
        System.out.println("String length: " + alphabet.length()); // find the length use built-in length method

        String getting = "Hello World";
        System.out.println("Uppercase: " + getting.toUpperCase());
        System.out.println("Lowercase: " + getting.toLowerCase());
        System.out.println("Find String position: " + getting.indexOf("World")); // find podition
        System.out.println("Find cheracter using index number: " + getting.charAt(4));
        System.out.println("Return: " + getting.equals(alphabet)); // compare string. If eqal return true else false
        System.out.println("String Concatenation: " + getting + " " + alphabet); // string জোরা লাগায়

    }
}

/*
 * String is a collection of charecter. it can hold text.
 * length() method বের করে কতগুলো charecter আছে space সহ count করে।
 * toUpperCase() method সব charecter কে বড় করে দেয়।
 * toLowerCase() method সব charecter কে ছোট করে দেয়।
 * indexOf() method বের করে string এর প্রথম charecter কোন index এ আছে। index
 * শুরু হয় 0 থেকে।
 */