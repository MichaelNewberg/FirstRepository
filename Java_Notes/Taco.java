public class Taco extends Food{

    public Taco(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        super(name, taste, calorieCount, isCandy, isCooked, texture, smell);
    }

    public Taco() {
    }
    public void addLettuce(){
        System.out.println("Good on you for eating green!");
        
    }

    @Override
    public void eat() {
        System.out.println("Take a bite.");
        this.isCandy=false;
    }

    @Override
    public void cook() {
        System.out.println("Shred the cheese, cook the meat with seasonings and add to a shell.");
        this.isCooked=true;
    }

    @Override
    public void store() {
        System.out.println("Store the components in the refridgerator.");
        
    }

}
