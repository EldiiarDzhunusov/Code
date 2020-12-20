package PS09;

import java.math.BigInteger;

public class Grains {
    public BigInteger computeNumberOfGrainsOnSquare(int num){
        BigInteger answer = new BigInteger("1");

        if(num>=1 && num<=64){
            answer = BigInteger.TWO.pow(num-1);
        }
        else{
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return answer;
    }
    public BigInteger computeTotalNumberOfGrainsOnBoard(){
        BigInteger answer = new BigInteger("1");
        for (int i = 1; i < 64; i++) {
            answer = answer.add(BigInteger.TWO.pow(i));
        }
        return answer;
    }
}
