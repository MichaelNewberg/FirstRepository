public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int limbs, String name, String size, String eyeColor) {
        super(limbs, name, size, eyeColor);//need to implement SUPER to reference parent class parameters.
    }

    public static void main(String[] args) {
        Dog myDog=new Dog(4, "Fido", "medium", "blue");
        myDog.breath();
        myDog.makeNoise();
        System.out.println(myDog.name);
    }
//right click, Source Action, Override/Implement Methods for an easy input
    @Override//Tells compiler to replace parent method of the same name with this one.
    public void breath() {
        System.out.println("Pants.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Barks.");
    }
    
    
}
