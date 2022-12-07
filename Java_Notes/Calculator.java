public class Calculator implements Maths {
    public int[] convertFloat(float numOne, float numTwo){//method to do the conversion and put into an array, more coding than just calling the .round func
        int[] nums=new int[2];
        nums[0]=Math.round(numOne);
        nums[1]=Math.round(numTwo);
        return nums;
    }
    @Override
    public void add(float numOne, float numTwo) {
        int intOne=Math.round(numOne);//importing the Math.round function to round our float number
        int intTwo=Math.round(numTwo);
        System.out.println(intOne+intTwo);
        
    }

    @Override
    public void subtract(float numOne, float numTwo) {//alternative way to do the conversions using the conversion method above
        int[] integers= this.convertFloat(numOne, numTwo);
        System.out.println(integers[0]-integers[1]);
        
    }

    @Override
    public void multiply(float numOne, float numTwo) {
        int intOne=Math.round(numOne);
        int intTwo=Math.round(numTwo);
        System.out.println(intOne*intTwo);
        
    }

    @Override
    public void divide(float numOne, float numTwo) {
        int intOne=Math.round(numOne);
        int intTwo=Math.round(numTwo);
        System.out.println(intOne/intTwo);
        
    }
    
}
