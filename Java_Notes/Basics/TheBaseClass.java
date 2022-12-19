package Basics;
public class TheBaseClass {
    /*In Java, ALL classes inherit from the base Object class. This is how we get access to things like constructors and helpful methods like
       the toString() method.
     * 
     */
    public String name;
    public int age;
    public boolean isAwake;

    public TheBaseClass(String name, int age, boolean isAwake) {
        this.name = name;
        this.age = age;
        this.isAwake = isAwake;
    }
    
    public static void main(String[] args) {
        TheBaseClass obj=new TheBaseClass("Timmy", 47, false);
        System.out.println(obj);

    }

    @Override
    public String toString() {
        return "TheBaseClass [name=" + name + ", age=" + age + ", isAwake=" + isAwake + "]";
    }


}
