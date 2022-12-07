package Interfaces;
public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.divide(10.1f, 3.2f);//returns only a whole number since Calculator.java is in Integer format
        AdvancedCalculator acalc=new AdvancedCalculator();
        acalc.divide(10.1f, 3.2f);
        }
}
