<h1 align="center"> Array </h1>

### What is Arrat?
- Array is a collection of elements of same datatypes, stored in side-by-side memory locations. It allows to store multiple values is a single variable.
<pre> 
Syntex of array decleration 
     datatype[] arrayName = new datatype[size];
</pre>

### Why need Array?
- Array can take multiple value of same data type. If you make int array, this array can take int valu only. 

### How work Array?
<pre>
     int[] numbers; 
</pre>
- Here array is declare with name numbers. This is the reference variable that is not allocat in the memory right now. Just create a area of the location. This is actually ocupy in the stack memory.
<pre>
     numbers = new int [5];
</pre>
- Here JVM is create the heap memory for insert data. Now the size of the array is 5 that is mean the array ocupy the memory to hold 5 int value. Once we give the array size we can't change it but we can modify the value of index. 
<pre>
    numbers[0] = 20;
    numbers[1] = 10;
    .........
</pre>
- Now JVM insert the value in correct index of the value. 

<pre>
      Stack Memory                    Heap Memory
   -------------------             ----------------------
   | numbers | 0xAB12 |  ----->   | [0] = 10            |
   -------------------            | [1] = 20            |
                                  | [2] = 30            |
                                  | [3] = 40            |
                                  | [4] = 50            |
                                   ----------------------
</pre>
This the process of run array.

### Stack memory and Heap memeory?
- Stack হলো এমন একটা জায়গা যেখানে method চলাকালীন সময়ের temporary ডাটা থাকে।
- Heap হলো JVM এর বড় storage জায়গা, যেখানে object আর array এর আসল data থাকে।
<pre>
public class Demo {
    public static void main(String[] args) {
        int x = 10;      // Stack এ যায়
        int[] arr = new int[3]; // arr Stack এ, কিন্তু value Heap এ
    }
}
</pre>

### Index out of Bound
- Index out of bound means when we give a size of array but we want to insert data an index that is not exist in array index. 
<pre>
     public class Main{
          int[] arr = new int[5];
           arr[0]=1;
           ......
           ......
           ......
           arr[6]=10; // this is called index out of bound
     }
</pre>

### toString method
- Array have a built in <strong>toString()</strong> method, when we insert an int value or whatever this method convert the value in string. This is actually doing toSting() method.