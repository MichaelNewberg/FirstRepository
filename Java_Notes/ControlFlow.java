public class ControlFlow {
    //When we are talking about control flow we are discussing the tools available to us to determine what parts execute, 
    //when they execute, and the conditions that they will execute

    public static void main(String[] args) {//quick way to set this is to start typing 'main' and auto complete it
        int visaCard=100;
        int burgerCost=45;
        int currentCard;
        String user1="ME";
        String user2="Myself";
        /*if(visaCard>=burgerCost){
            System.out.println("Congrats on your purchase!");//shorthand is 'sout'
            currentCard=visaCard-burgerCost;
            System.out.println("Remaining funds: "+currentCard);
        }

        int lowCard=10;
        if(lowCard>=burgerCost){
            System.out.println("You don't have enough funds.");
        }*/

        if(user1.equals("ME") && user2.equals("Myself")){//&& is boolean for AND
            System.out.println("Make up your mind.");
        }else{
            System.out.println("I see you've got things in order.");
        }
    }
}

