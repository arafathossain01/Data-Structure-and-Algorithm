import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        // Syntex
        /*
         * ArrayList<Type> listName = new ArrayList<>();
         */
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list.contains(70)); // this show false
        System.out.println(list);

        list.add(0,70); // this add at the 0th index.
        System.out.println(list);

        list.set(0,90); // update the 0th index value.
        System.out.println(list);
        
    }

}
