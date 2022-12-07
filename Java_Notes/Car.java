public class Car {
    String owner;
    int gas;
    public static int count;//static keyword in class means field/method is shared across all instances of the class(ie all objects)

    public Car(String startingOwner, int startingGas){//creating a constructor that handles setting the value of the owner field when any new object is made.
        this.owner=startingOwner;//"this" is a reference to the object being created
        this.gas=startingGas;
        count++;//not using "this" because it is shared accross all instances, not each object individually.
    }
    //So regardless of which method is called, it garuntess that the "count" will increase for each new object made.
    public Car(){
        count++;
    }//you can make more than 1 constructor, the compiler will handle them depending on arguements provided. (Polymorphism)
    public static void main(String[] args) {
        System.out.println(Car.count);//this should be 0, because no cars have been made
            //All classes have a special method(repeatable code) that creates an object of the class, called instantiation.
       Car myCar=new Car();//no input upon creation, so it uses the default method(the same as the 2nd method)
            // () after a word/phrase means it's a method being called.
       System.out.println(Car.count);//this should be 1 now
       myCar.owner= "George";//set value for this specific owner
       System.out.println(myCar.owner);
       Car mattCar=new Car("Matt", 100);//notice that since you input a value when creating the object, it uses the first method instead of the 2nd
       System.out.println(mattCar.owner);
       myCar.drive();//MUST be called by an object
       mattCar.drive();
       System.out.println(mattCar.gas);
       System.out.println(myCar.gas);//didnt instantiate any gas, so by default it starts at 0

       Car.checkCount();
    }
    //public: access modifier, can be accessed by any object anywhere in the code
    //void: return type, method will return nothing
    //drive: method name, should give a decent idea about what's happening in it
    public void drive(){
        System.out.println("vroom vroom!");
        this.gas-=10;
    }
    public static void checkCount(){
        System.out.println("There are "+count+" cars created.");
    }
}
