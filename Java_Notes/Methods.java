public class Methods {
    /*Methods are reusable code that is attached to a class or interface. They are useful when you need to repeatedly execute some code
    but don't exactly know when the code will need to be executed. Instead of having to rewrite your code, just call the method you create.
     */

    //Public: access modifier, can be referenced anywhere in our code.
    //void: return type, does not return any data
    //doSomething: name of method, how we invoke the method
    //input: name of the parameter associdated with the method(whatever string is provided)
    public void doSomething(String input){
        System.out.println("You entered the string: "+input);
    }
    public static void main(String[] args) {
        Methods obj=new Methods();
        obj.doSomething("Weeeee!");
        obj.addFive(6);//this by itself does nothing. Need to assign the return value to a variable
        int returnValue=obj.addFive(6);//one way to interact with the returned value, can be reused in another location
        //datatype MUST be set as the same as return value
        System.out.println(returnValue);

        System.out.println(obj.addFive(7));//alternative way to interact with returned value, can't be reused 

        try{
            System.out.println(obj.exceptionsHappen(0));
        }catch(RuntimeException e){
            System.out.println("Error.");
        }
    }

    public int addFive(int num){
        return num+5;
    }

    public int exceptionsHappen(int num){
        //Can either return expected data type or throw an exception, MUST be one of the two.
        try {
            return 100/num;
        } catch (ArithmeticException e) {
            //need a return here for the method to work, either by returning an int or throwing an exception.
            throw new RuntimeException("Can't divide by Zero.");
        }
    }
}
