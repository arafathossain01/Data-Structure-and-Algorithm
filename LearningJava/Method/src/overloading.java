public class overloading {
    public static void main(String[] args) {
        sum(10,20);
        sum(10.2, 10.4);
    }

    static void sum(int a, int b){
        int sum = a + b;
        System.out.println("sum1 "+ sum);
    }

    static void sum(double a, double b){
        System.out.println("sum2 " + (a+b));
    }

}
/*
 * Method overloading is the process of code that is same name of method but their task is different via differenet parementer.
 * Important thing is if return type is different then method overloading will not wokring.  
 */
