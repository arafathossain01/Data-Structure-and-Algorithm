package First;

public class Variable {
    public static void main(String[] args) {
        int a = 10;
        int mynum;
        mynum = 10 ; // it is now update
        System.out.println(a);
        System.out.println("Sum is: " + mynum); // if we print two variable in one line then use + operator.

        /*
         * Java তে অনেক ধরণের variable আছে। Variable হলো data রাখার জায়গা।
         * int, float, String etc
         * int number = 10; এই পুরাটা একটা vabiable যেখানে 10 কে রাখা হয়েছে।
           
         */

        final double pi = 3.1416; // we cannot re-assing the name identifier
        System.out.println(pi);
        /*
         * final একটা keyword যা mean করে এটা constant যা একবার assign করার পর আর
         * পরিবর্তন করা যায় নাহ।
         * যখন variable এর মান change করা দরকার হবে নাহ তখনই final keyword use করতে হবে।
         */

        // identifier
        int mark = 69;
        String subject = "Math";
        System.out.println(subject+" : "+mark);
        /*
         * সব java variable এর একটা uniqe নাম থাকে যাকে identifire বলে। 
         * identifire এর নাম অবশ্যই বুঝার মতো নাম দিতে হবে। এতে করে code পড়তে সুবিধা হয়। 
         * 
         * identifier লিখার কিছু rules আছে-->
         * Names can contain letters, digits, underscores, and dollar signs
           Names must begin with a letter
           Names should start with a lowercase letter, and cannot contain whitespace
           Names can also begin with $ and _
           Names are case-sensitive ("myVar" and "myvar" are different variables)
           Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */
    }
}

