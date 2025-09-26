# Java Condition
- There are two types of condition in Java 
    - if else
    - switch case

## if-else
- if-else স্টেটমেন্ট Boolean expressions (শর্তগুলো যা true বা false হয়) এবং মানের রেঞ্জ (range of values)-এর ওপর ভিত্তি করে শর্ত পরীক্ষা করতে পারে।

- একাধিক শর্তকে else if এবং শেষ পর্যন্ত else দিয়ে চেইন (chain) করা যায়।
- জটিল শর্তাবলী পরীক্ষা করতে ব্যবহার করা হয়। 
- অতিরিক্ত if else ব্যবহার করলে if-else-if ladder এর মতো হয় তাই code এর readabilty কমে যায়।
- Runtime increase

## switch-case
- switch স্টেটমেন্ট শুধুমাত্র একটি একক ভেরিয়েবল বা এক্সপ্রেশনের মান (value) পরীক্ষা করে এবং তা case লেবেলের স্থির মানের (constant value) সাথে তুলনা করে।

- Java-তে switch স্টেটমেন্ট byte, short, char, int, Enum types এবং String অবজেক্টের উপর কাজ করে।
- এটি কোনো Boolean expression বা মানের রেঞ্জ পরীক্ষা করতে পারে না।
- একক variable এর উপর ভিত্তি করে কাজ করে।
- Code readablity বাড়ায়। 
- Runtime decrease

# Java Looping
- There are three types is Java
    - For loop
    - While loop
    - Do while loop

## For Loop
- যখন জানা থাকে loop কতবার চলবে তখন for loop use করা হয়। এটি খুবই compact একটি loop system. 
- যখন জানা থাকে না loop কতবার চলবে তখন while loop use করা হয়। while loop code এর flexibility বাড়িয়ে দেয়। 
- do-while loop অনেকটা while loop এর মতো কাজ করে। কিন্তু এখানে condition check করার আগেই loop একবার চলে। 