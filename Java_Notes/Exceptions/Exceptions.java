package Exceptions;
import java.io.IOException;

public class Exceptions {
    /*Any time something goes wrong with the code Java will "throw" an exception. This is the default behavior.
      Example: Divide by 0 gives Arithmatic exception
     public static void main(String[] args) {
        System.out.println(2/0);
     }
     */

     //If you wish to "handle" these exceptions you need a try/catch block.
     public static void main(String[] args) {
        try {//code to execute that MIGHT fail
            System.out.println(2/0);
        } catch (ArithmeticException e) {//code to execute should the above code fail
            System.out.println(e.getMessage());//prints out the actual reason why thrown
            System.out.println("Error, answer goes to infinity.");
        }catch(IOException e){//can chain multiple catch versions together

        }

        try{
            //code to be tested
        }catch(IOException | ArithmeticException e){ //a singular | says that if either or of the exceptions are thrown, the code runs
            //this is offers less action against specific exceptions, but is cleaner overall.
        }

        try {
            
        } catch (Exception e) {//This is the most general Exception catch, this will catch ALL possible exceptions thrown
            // TODO: handle exception
        }
     }
}
