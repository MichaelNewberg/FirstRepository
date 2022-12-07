package Abstraction;
public class Pizza extends Food {

    
    public Pizza(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        super(name, taste, calorieCount, isCandy, isCooked, texture, smell);
    }

    public Pizza() {
    }

    @Override
    public void eat() {
        System.out.println("Take a bite out of a slice.");
        
    }

    @Override
    public void cook() {
        System.out.println("Line the dough with sauce, add the desired toppings on top of those. Cook in an oven.");
        this.isCooked=true;
    }

    @Override
    public void store() {
        System.out.println("Package in an airtight container and store in a fridge.");
        
    }
    
}
