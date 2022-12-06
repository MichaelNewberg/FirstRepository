# Java
Java is a well known enterprise programming language. As a language it is well designed to scale in size and capabilities. There are a few key details you should know about the language:
-Java is a **strongly typed language.**
    *once a data type is set, it cannot be changed. (Would need a function to change from int to String, for example)
-Java is a **statically typed language.**
    *you must declare the data type you are working with every time you create data in your Java application.
-Java has automatic memory management.
    *Java will handle all memory management and garbage collection for you.
    *garbage collection is the removal of data from memory that we are no longer using.
-Write once, Run anywhere
    *any machine that has a JRE/JVM on it can run a Java app, no matter where that app was made


## JDK, JRE, JVM
The Java Development Kit (JDK) contains the libraries and tools we need to be able to write our Java applications. One of the key tools we need is the Java compiler: this is what allows us to turn our source code (.java files) into byte code  that can be executed on our computer (.class files). It also providdes a debugger that can be helpful in figuring out issues with our code.

A Java Runtime Environment (JRE) is provided with the JDK when you download it. A JRE is what is needed to actually be able to run your Java application. The JRE contains the runtime libraries necessary for your code to execute. Contained within the JRE is the Java Virtual Machine (JVM), which is the tool that actually handles ensuring your code will run on your machine.

The JVM is the tool that takes the byte code (.class files) and turns it into data that is understandable by your particular operating system. KEep in mind, all JVMs are found in their respective JRE.

JVM within a JRE within a JDK