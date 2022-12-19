package Interfaces;
public interface Maths {
    /*All interfaces will share some common characteristics:
        All fields in an interface are considered by default to be public static final
            public: can be accessed anywhere
            static: the value belongs to the interface, not the objects that implement it
            final: the value can't be changed
    Methods in interfaces also have some default settings:
        They are considered by default to be public and abstract.
     */
    //setting return type to void because we are going to print the result to the console.
    void add(float numOne, float numTwo);//Don't need to add public or abstract to the method
    void subtract(float numOne, float numTwo);
    void multiply(float numOne, float numTwo);
    void divide(float numOne, float numTwo);

}
