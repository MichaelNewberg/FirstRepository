package Exceptions;

public class ExceptionsPlayground {//this is running off RuntimeException, ie unchecked exception.
    public static void main(String[] args) {
        String[] names={"Ted", "Sally", "George", "Billy", "Fred"};
        try{//unneeded for unchecked exceptions, but as a safeguard.
            for(int i=0; i<names.length; i++){//looping through string
                if(names[i].equals("Billy")){//checking for "Billy"
                    throw new NoBilly("No Billys allowed!");
                }else{
                    System.out.println("No Billy found here, moving on.");
                }
            }
        }catch(NoBilly e) {
            System.out.println(e.getMessage());
        }
        try {
            checkForFred();
        } catch (NoFred e) {
            System.out.println(e.getMessage());
        }
    }
    //because we added the throws NoFred keywords to our method we can throw our checked exception in this method but not worry about handling it
    //with the try/catch block: that is done for us in the main method where this checkForFred method is called.
    public static void checkForFred() throws NoFred{
        String[] names={"Ted", "Sally", "George", "Billy", "Fred"};
        for(int i=0; i<names.length; i++){//looping through string
            if(names[i].equals("Fred")){//checking for "Billy"
                throw new NoFred("No Freds allowed!");
            }else{
                System.out.println("No Fred found here, moving on.");
            }
        }
    }
}