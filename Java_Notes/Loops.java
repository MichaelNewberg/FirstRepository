public class Loops {
    public static void main(String[] args) {
        /*for(int i=0; i<=10; i++){
             System.out.println(i);
        }
        int x=2;
        while(x>0){
            System.out.println(x);
            x--;
        }*/
       /*for(int x=1; x<=10; x++){//loop for even numbers only
            if(x % 2==0){//% is the modulus operator, returns remainder of a division
                System.out.println(x);
            }
        }*/

        //storing numbers and looping through an array
        int[] numbers={1,2,3,4,5};//index for this would be {0,1,2,3,4}
        for(int x=0; x<numbers.length; x++){//.length references length of the array (5 in this case)
            //System.out.println(numbers[x]);
            if(numbers[x] % 2==0){
                System.out.println("X is even this iteration for value: "+numbers[x]);
            }else{
                System.out.println("X is odd this iteration for value:  "+numbers[x]);
            }
        }

        
    }
}
