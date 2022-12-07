package Exceptions;

public class NoBilly extends RuntimeException{//can also extend RuntimeException
    /*There are 2 ways to create your own exceptions, either extending Exception or RuntimeEception classes
     * Exception: "checked exception" meaning any code that could throw an exception MUST be handled.
     * Runtime  : "unchecked exception" does not need to be handled if it could throw an exception.
     */
    public NoBilly(String message){
        super(message);
    }
    //this is all that is needed for a custom exception.
}
