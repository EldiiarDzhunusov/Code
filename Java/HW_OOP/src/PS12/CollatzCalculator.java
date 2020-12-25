package PS12;

public class CollatzCalculator {

    public int computeStepCount(int num){
        int counter =0;

            if(num>=1){
                while(num>1){
                    if(num%2==0){
                        num=num/2;
                    }
                    else{
                        num = (num*3)+1;
                    }
                    counter++;
                }
            }
            else{
               throw new IllegalArgumentException("Only natural numbers are allowed");
            }

            return counter;


    }
}
