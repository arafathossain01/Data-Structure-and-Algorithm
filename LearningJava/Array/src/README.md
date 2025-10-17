<h1 align="center"> Array </h1>

### What is Array?
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

### Multidimantional Array
- Multidimantional Array এমন এক ধরণের array যেখানে ম্যাট্রিক্স নিয়ে কাজ করা হয়। এটা row column বরাবর কাজ করে। 
<pre>
     1 2 3 --> row |
     4 5 6         |
     7 8 9         column
</pre>

### ArrayList
- Java-র ArrayList আসলে একটি dynamic array, অর্থাৎ এর আকার (size) প্রয়োজন অনুযায়ী স্বয়ংক্রিয়ভাবে বড় বা ছোট হয়। প্রোগ্রাম চালানোর সময় যখন আমরা ArrayList তৈরি করি, তখন Java ভেতরে ভেতরে একটি সাধারণ array তৈরি করে যার default size হয় 10। যখন আমরা add() মেথড দিয়ে ডাটা যোগ করি, তখন সেই ডাটা ওই array-র পরপর ঘরগুলোতে সংরক্ষণ হয়। যদি array-র জায়গা পূর্ণ হয়ে যায়, তখন ArrayList স্বয়ংক্রিয়ভাবে একটি নতুন বড় array তৈরি করে, পুরনো array-র সব ডাটা কপি করে সেখানে রাখে, এবং নতুন ডাটাটিও যোগ করে। এই কারণে ArrayList কে বলা হয় resizable বা dynamic array। কোনো নির্দিষ্ট ডাটা অ্যাক্সেস করতে get(index) ব্যবহার করা হয়, যা খুব দ্রুত কাজ করে, কারণ এটি সরাসরি index অনুযায়ী ডাটা নেয়। তবে যদি কোনো উপাদান বাদ দিতে হয় (remove(index)), তাহলে সেই index-এর পরের সব উপাদান এক ধাপ করে সরাতে হয়, তাই এই কাজটি তুলনামূলক ধীর। 
<h3 align="center">Some built-in methods of ArrayList </h3>
<table border="1" align="center">
     <tr>
          <th> Method </th>
          <th>Description</th>
          <th>Example</th>
     </tr>
     <tr>
          <td>add(element)</td>
          <td>Adds an element at the end</td>
          <td>list.add(10);</td>
     </tr>
     <tr>
          <td>add(index, element)</td>
          <td>Inserts element at specific index</td>
          <td>list.add(1, 20);</td>
     </tr>
     <tr>
          <td>remove(index)</td>
          <td>Removes element at given index</td>
          <td>list.remove(0);</td>
     </tr>
     <tr>
          <td>remove(object)</td>
          <td>Removes first occurrence of the object</td>
          <td>list.remove(Integer.valueOf(10));</td>
     </tr>
     <tr>
          <td>get(index)</td>
          <td>Returns element at specific index</td>
          <td>int x = list.get(0);</td>
     </tr>
     <tr>
          <td>set(index, element)</td>
          <td>Replaces element at index</td>
          <td>list.set(0, 100);</td>
     </tr>
     <tr>
          <td>size()</td>
          <td>Returns number of elements</td>
          <td>int n = list.size();</td>
     </tr>
     <tr>
          <td>contains(object)</td>
          <td>Checks if element exists</td>
          <td>list.contains(20);</td>
     </tr>
     <tr>
          <td>clear()</td>
          <td>Removes all elements</td>
          <td>list.clear()</td>
     </tr>
     <tr>
          <td>isEmpty()</td>
          <td>Checks if list is empty</td>
          <td>list.isEmpty();</td>
     </tr>
     <tr>
          <td>indexOf(object)</td>
          <td>Returns index of first occurrence</td>
          <td>list.indexOf(10);</td>
     </tr>
     <tr>
          <td>lastIndexOf(object)</td>
          <td>Returns index of last occurrence</td>
          <td>list.lastIndexOf(10);</td>
     </tr>
     <tr>
          <td>toArray()</td>
          <td>Converts ArrayList to array</td>
          <td>Object[] arr = list.toArray();</td>
     </tr>    
</table>
