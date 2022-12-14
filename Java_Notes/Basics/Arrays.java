package Basics;
public class Arrays {
    //Arrays are structures used to hold data. Immutable(unchangable) structures once created.
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};//manually setting values to indices
        int[] evenNumbers= new int[4];//creates new array that has 4 positions, all start at 0 until filled
        //evenNumbers[0]=2;//can manually change individual indices
        int num=2;
        for(int x=0; x<evenNumbers.length; x++){
            evenNumbers[x]=num;//setting num as the value for each array index
            num+=2;//increase num by 2 each iteration
        }
        for(int x=0; x< evenNumbers.length; x++){
            System.out.println(evenNumbers[x]);
        }

        //Array practice with Strings
        String[] words= new String[5];//can also manually set values. Initial values for each is NULL.
        String chars= "abcd";
        chars+=chars;//this just overwrites and reassigns the value given to chars. (chars++ or chars-- DOES NOT WORK! It is not an int.)
        //by doing this you change the reference.
        System.out.println(chars);
    }
}
