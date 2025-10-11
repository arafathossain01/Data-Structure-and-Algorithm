public class scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println(a);

        // block scope লিখতে হয় {} ভিতরে।
        {
             a = 40; //a কে initialize করতে পারবো নাহ কারণ উপরে a already define করা আছে। কিন্তু modefie করতে পারবো।   
             // এই block এর ভিতর যা initialize করবো তা শুধু এই block এই use করতে পারবো। 
             System.out.println(a);
        }
    }

    // method scope
    static void math(){
        //System.out.println(a); scope হলো শুধু এই function এর variable এই funtion এই ব্যবহার করতে পারবো। 
        // a variable কে এই method এ access করতে পারবো না কারণ a variable upper method এর, এইটাই method scope.
    }
}
