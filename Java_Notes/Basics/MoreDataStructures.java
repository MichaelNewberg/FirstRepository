package Basics;
import java.util.ArrayList;
import java.util.List;
//We have to import these two because their information is not found in the package(folder for .java files) our current file is located in.

public class MoreDataStructures {
    /*Two interfaces to be familiar with are the List and Set interfaces. These two give you access to some of the more common data
    structures you will want to use in your Java code.
    *Lists will be your most flexible data structures: they are indexable, they retain order of insertion and also allow duplicate values
    *The most common type is ArrayList
    *Lists make use of Generics: placeholders that tell Java what KIND of data is going to be used with the object in question.
     */
public static void main(String[] args) {
    List<String> namesList=new ArrayList<>();
    //add items to the list
    namesList.add("Billy");
    namesList.add("Sally");
    namesList.add("Teddy");
    namesList.add(0,"Adam");//chooses where to put the element input.
    /*In a normal Array, a new array would be needed aswell as pulling items from the first.
     *This is an example of Method Overloading: same add method being called in all instances, but the way the method works changes depending on
       the amount of arguments provided
     *If we don't provide an index position then the String is added to the end of the list, but with an index position it will be put there
       and all other items in the list will be adjusted
    */
    System.out.println(namesList);
    System.out.println();

    
}
}
