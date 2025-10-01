<h1 align="center">Java Methor or Function </h1>

## What is method in java?
- Method is a block of code in java, that is give or return some spacific task when we call the method. Method is just like a design of code that is hold in a block and it doing spacific task. 
## কেন method প্রয়োজন?
- Method code এর readability বাড়ায়, code কে পুনরায় ব্যবহার যোগ্য করে তুলে। উদাহরণ সরূপ -> <br> 
একটা বড় সমস্যার solve code লিখা আছে একটা spacific folder এ method আকারে, সেই সমাধান ব্যবহার করে আরেকটা সমস্যার সমাধান করতে হবে তখন ওই code আবার না লিখে আমরা ওই spacific folder এর কোড ব্যবহার করতে পারি। এটাই code reuseability এবং সমস্যা সমাধানের সময় ওই সমস্যাকে ভেংগে ছোট ছোট সমাধান করে পুরো problem solve করার মাধ্যমে code readability বারে। এতে করে DRY code লিখা থেকে বিরত থাকা যায়। 

## Method Written Process
- একটা method লিখতে গেলে কয়েকটি process মেনে লিখতে হয়,
    - Access modifier এটি মেথডটির অ্যাক্সেস লেভেল বা দৃশ্যমানতা নির্ধারণ করে। <br>
    <table border="1">
    <thead>
    <tr>
        <th> Access Modifier </th>
        <th> একই ক্লাসে Access </th>
        <th> একই Package-এ অ্যাক্সেস </th>
        <th> অন্য Package-এর Subclass-এ অ্যাক্সেস </th>
        <th> অন্য Package-এর Non-Subclass-এ অ্যাক্সেস (সবথেকে খোলা) </th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th> Private </th> 
        <td> ✓ (হ্যাঁ) </td>
        <td> ✕ (না) </td>
        <td> ✕ (না) </td>
        <td> ✕ (না) </td> 
    </tr>
    <tr>
        <th> Default </th>
        <td> ✓ (হ্যাঁ) </td>
        <td> ✓ (হ্যাঁ) </td>
        <td> ✕ (না) </td>
        <td> ✕ (না) </td>  
    </tr>
    <tr>
        <th> Protected </th>
        <td> ✓ (হ্যাঁ) </td>
        <td> ✓ (হ্যাঁ) </td>
        <td> ✓ (হ্যাঁ) </td>
        <td> ✕ (না) </td> 
    </tr>
    <tr>
        <th> Public </th>
        <td> ✓ (হ্যাঁ) </td>
        <td> ✓ (হ্যাঁ) </td>
        <td> ✓ (হ্যাঁ) </td>
        <td> ✓ (হ্যাঁ) </td> 
    </tr>
    </tbody>

    </table>
- Return type -> method টি কাজ শেষ করার পর কোন type value return করবে তা নিরধারন করা।
- Method name -> Method লিখার সময় method এর একটা নাম দেওয়া হয় যাতে method কে ওই নামে call করা যায়।
- Parameter List -> বন্ধনীর মধ্যে কমা দ্বারা বিভক্ত ইনপুট ভ্যালু বা প্যারামিটারের তালিকা। মেথডটির কাজ করার জন্য এই ইনপুটগুলো প্রয়োজন হয়। যদি কোনো প্যারামিটার না থাকে, তবে খালি বন্ধনী () ব্যবহার করা হয়।
- Method Body ->  দ্বিতীয় বন্ধনী {} এর মধ্যে মেথডটির আসল কোড বা স্টেটমেন্ট থাকে, যা মেথড কল হলে এক্সিকিউট হয়।

## Method Syntex
<pre> 
accessModifier returnType methodName(parameterType1 parameterName1, parameterType2 parameterName2, ...) {
    // Method Body: Statements to be executed
    // যদি returnType void না হয়, তবে return statement ব্যবহার করতে হবে
    return value; 
}
</pre>
- যখন return করা হয়ে যাবে এর পর কোনো statement লিখলে error আসবে। কারণ, return মানে code ওই জায়গা তে শেষ এর পর আর কোনো statement লিখা যাবে নাহ। 

## Pass by Value
- Java method pass by value নিয়ে কাজ করে কিন্তু pass by reference নিয়ে কাজ করতে পারে নাহ।

- Primitive type (int, double, char, short) এই সকল datatype pass by valu follow করে। primitive data type এ pass by valu করলে variable update করা যায় তাতে কোনো problem হয় নাহ।
<pre>
   public void changeValue(int data) {
    data = 100; // শুধু কপির মান পরিবর্তন হলো
}
int x = 50;
changeValue(x);
</pre>
- Non-primitive type (object) passing value of the reference variable. এইখানে method কে call করা হলে সরাসরি method এ value pass করা হয় নাহ, বরং value এর ঠিকানা copy করে দেওয়া হয়। যার ফলে obj এর value change করা যায় কিন্তু new value add করা যায় নাহ। parameter হিসেবে একটা নকল পাঠায়। তাই মান পরিবর্তন করা যায় কিন্তু ঠিকানা পরিবর্তন করা যায় নাহ। 
<pre>
class Student {
    String name;
    Student(String n) {
        this.name = n;
    }
}

public class ReferenceExample {

    // মেথড: Student অবজেক্টের রেফারেন্সের কপি নেয়
    public static void modifyObject(Student studentObj, String newName) {
        System.out.println("  > মেথডের শুরুতে (studentObj.name): " + studentObj.name);

        // 1. ভেতরের মান পরিবর্তন: এই পরিবর্তনটি মূল অবজেক্টেও হয়
        studentObj.name = newName; 

        System.out.println("  > মেথডের ভেতরের পরিবর্তন (studentObj.name): " + studentObj.name);
        
        // 2. রেফারেন্সের মান নতুন অবজেক্ট দ্বারা পরিবর্তন: 
        // এই পরিবর্তনটি শুধুমাত্র studentObj কপির মধ্যে সীমাবদ্ধ থাকে, mainStudentObj কে প্রভাবিত করে না
        studentObj = new Student("Ankita"); 
        System.out.println("  > রেফারেন্স পরিবর্তন (studentObj.name): " + studentObj.name); 
    }

    public static void main(String[] args) {
        Student mainStudentObj = new Student("Bipul");
        System.out.println("Main: কল করার আগে (mainStudentObj.name): " + mainStudentObj.name); // আউটপুট: Bipul

        modifyObject(mainStudentObj, "Rima");

        System.out.println("Main: কল করার পরে (mainStudentObj.name): " + mainStudentObj.name); // আউটপুট: Rima
    }
}
</pre> 

