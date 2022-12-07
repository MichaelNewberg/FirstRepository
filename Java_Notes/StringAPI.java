public class StringAPI {
    /*Strings are the simplest object we can use to represent words/phrases within our code. They are useful when we need to do things like pass
        messages to our users, create error messages for developers, etc.
      Strings are imutable objects: at best, you can reasign a variable with your "updated" string, but you do not change the initial string
        that was created. In actuality, your variable now points to the updated string value.
      To actually change your word/phrase, the easiest tool would be the StringBuilder class.
    */
    public static void main(String[] args) {
        String myName="Michael";
        System.out.println(myName);
        myName+=" Newberg";
        String[] splitMyName=myName.split(" ");//this method breaks aparts the string at each SPACE found and places it into an array
        for(int i=0; i<splitMyName.length; i++){
            System.out.println(splitMyName[i]);
        }

        //Use a normal string if you know you will not need to perform many operations on the phrase.
        StringBuilder myWord=new StringBuilder(myName);
        myWord.reverse();//reverses the order of the original string. In a normal string, you'd need an array and loop structure.
        System.out.println(myWord);
        myWord.append(" backwards.");//adds to the string.
        System.out.println(myWord);
        //StringBuilder doenst have a built in split method, but it's an easy conversion
        myWord.toString().split(" ");//converts the StringBuilder into a new string and then acts upon it
        //HOW DO WE HANDLE THE OUTPUT OF THIS ^

        //a coding challenge might be to "find the numbers and add them together"
        String numbers =" 10 7 15 24 5";
    
        
    }
}
