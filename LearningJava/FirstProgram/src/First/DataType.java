package First;

public class DataType {
    public static void main(String[] args) {
        byte num = 100;
        short num2 = 5000;
        int number = 10;
        long num3 = 3488438048489L;
        float pi = 3.1416f;
        double num4 = 13.9659d;
       
        System.out.println("Byte type data: "+num);
        System.out.println("Short type data: "+num2);
        System.out.println("integer type data: "+number);
        System.out.println("Long type data: "+num3);
        System.out.println("Floating type data: "+pi);
        System.out.println("Double type data: "+num4);

        boolean mybool = true;
        System.out.println("boolean type data: "+mybool);

        char letter = 'A';
        char letter2 = 66;
        System.out.println("First one is chrecter: "+letter+"\nSecond one is ascii code: "+letter2);
        
        /* in java two types of data types-->
         * 1. primitive
         * byte--> বাইট data type hole number store করে রাখে (-128 t0 127)
         * short--> short data type hole number store করে রাখে (-32768 to 32767)
         * int--> it can also store hole number (-2147483648 to 2147483647)
         * long--> it can also store hole type data (-9223372036854775808 to 9223372036854775807)
         * float & double--> both can hold the fractional number
         * 
         * boolean--> it use most of the case to checking condition. it return true or false.
         * 
         * char--> it store a single letter. it also contain ascii value.
         * 
         * Fixed size, simple values store করে।
         * এগুলো object নয়, বরং সরাসরি value ধরে রাখে।
         */


         String name = "Arafat";
         System.out.println(name.toUpperCase());
         /*
          * Non-primitive data type-->
          * Non-primitve data হলো যেসব ডেটা টাইপ আসলে object আকারে তৈরি হয়, এবং variable শুধু তার address (reference) ধরে রাখে।
          * উপরে string টি heap memory তে object আকারে থাকে, আর variable-এ শুধু ওই object-এর reference থাকে।
          * String হলো একটা object এতে অনেক ধরনের method আছে।
          * String, Array, Class, Object, interface সব non-primitive data type.
          */
    }
}

/*
 * var keyword নামে একটা keyword 2010 সালে java আনে, যা automatic datatype detact করতে পারে।
 */
