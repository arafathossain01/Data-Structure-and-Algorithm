<h1 align="center">Architecture of JAVA</h1>

- Java একটি object oriented programming Language.
    - object oriented মানে একটা java program একটা class এর ভিতরে থাকবে। মূল class টা সবসময় public দিয়ে শুরু হবে। Class হলো একটা bueprint এর মতো, এখানে code কিভাবে থাকবে সাজানো থাকবে তা নির্ধারণ করা হয়।

## JAVA file Run Concept
- java প্রথম source code file তৈরি করে। যা মানুষের পড়ার যোগ্য। (file.java)

- compiler source code কে bytecode এ রুপান্তর করে। রুপান্তর করার পর একটা .class নামের file তৈরি করে।এই file টি bin folder এ থাকবে। Bytecode হচ্ছে machine independent, যেকোনো অপারেটিং সিস্টেমে একইভাবে কাজ করবে।

- JVM(Java virtual machine) bytecode কে machine code এ রুপান্তর করে। JIT(Just in time) compiler bytecode কে দ্রুত machine code এ রূপান্তর করে performance বাড়ায়।

## JAVA Platform এর মূল অংশ
- JVM (Java Virtual Machine) → Bytecode execute করে।

- JRE (Java Runtime Environment) → JVM + Libraries (Java চলার জন্য যা লাগে)।

- JDK (Java Development Kit) → JRE + Compiler + Development Tools (প্রোগ্রাম বানাতে লাগে)।

## Project Architecture 
<pre>
project/ 
 ├─ src/ 
 │   └─ myapp/
 │       └─ Main.java
 └─ bin/
     └─ myapp/
         └─ Main.class
</pre>

- Compile করার comman-->
javac -d bin src/myapp/Main.java
- Run করার জন্য command-->
java -cp bin myapp.Main