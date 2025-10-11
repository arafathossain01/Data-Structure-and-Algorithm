public class shadowing {
    static int num = 40;
    public static void main(String[] args) {
        System.out.println(num);
        int num = 50;
        System.out.println(num);
        fun();
    }

    static void fun() {
        System.out.println(num);
    }
}

/*
 * উপরে num variable আগে define করা হয়েছে এবং এটা first block এর ভিতর সব জায়গায় ব্যবহার করা যাবে। 
 * প্রথম print line এ 40 print করবে এবং এই num variable কে আবর initialize করার ফলে আগের num=40 ৫ নাম্বার লাইন এ new initialize হয়ে গেছে। এইটা shadowing. 
 * second printline will show 50 and the fun() method will print 40 cause fun() method access the 40 of the first block.  
 */
