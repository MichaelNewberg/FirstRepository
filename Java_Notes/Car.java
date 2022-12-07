public class Car {
    String owner;
    public Car(String startingOwner){//creating a constructor that handles setting the value of the owner field when any new object is made.
        this.owner=startingOwner;//"this" is a reference to the object being created
    }
    public Car(){}//you can make more than 1 constructor, the compiler will handle them depending on arguements provided. (Polymorphism)
    public static void main(String[] args) {
       //All classes have a special method(repeatable code) that creates an object of the class, called instantiation.
       Car myCar=new Car();//no input upon creation, so it uses the default method(the same as the 2nd method)
       // () after a word/phrase means it's a method being called.
       myCar.owner= "George";//set value for this specific owner
       System.out.println(myCar.owner);
       Car mattCar=new Car("Matt");//notice that since you input a value when creating the object, it uses the first method instead of the 2nd
       System.out.println(mattCar.owner);
    }
}
