public abstract class Food {
    //Abstract classes can't have objects created: you must have a sub-class inherit the properties of the abstract to create an object
    //in order to acess the properties of the abstract class.
    //NOTE: you cannot have the word STATIC in a method within the abstract class.
    public String name;
    public String taste;
    public int calorieCount;
    public boolean isCandy;
    public boolean isCooked;
    public String texture;
    public String smell;

    
    public Food(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        this.name = name;
        this.taste = taste;
        this.calorieCount = calorieCount;
        this.isCandy = isCandy;
        this.isCooked = isCooked;
        this.texture = texture;
        this.smell = smell;
    }

    public Food(){}//no args constructor
    public abstract void eat();
    public abstract void cook();
    public abstract void store();
}
