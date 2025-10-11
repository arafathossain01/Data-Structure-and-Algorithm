import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        
        fun(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
/*
 * variavle length arguments is actually we don't know how many argument actyally we print. it's a java feature. When we don't know how many value we print then we use above feature and it's called variable length arguments. 
 */
