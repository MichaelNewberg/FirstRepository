public class Kitchen {//can access everything since it's in the same JAVA_NOTES folder
    public static void main(String[] args) {
        Taco myTaco=new Taco();//Reference as a TYPE the abstract class(Food) and specify what type(Taco)
        Food myPizza=new Pizza();

        myTaco.eat();
        myPizza.eat();
        System.out.println();//space between readouts
        myTaco.cook();
        myPizza.cook();
        System.out.println();
        myTaco.store();
        myPizza.store();
        System.out.println();
        myTaco.addLettuce();//NEED to change the Reference type from the parent to the child(Food to Taco here) to access child specific parameters

    }
}
