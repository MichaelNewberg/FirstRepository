public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int limbs, String name, String size, String eyeColor) {
        super(limbs, name, size, eyeColor);
    }
    
    public static void main(String[] args) {
        Cat myCat=new Cat(4, "D'artagan", "medium", "brown");
        myCat.breath();
        myCat.makeNoise();
        System.out.println(myCat.name);
    }

    @Override
    public void breath() {
        System.out.println("Purs.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meows.");
    }
    
}
