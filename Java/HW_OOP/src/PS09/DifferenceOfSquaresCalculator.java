package PS09;

public class DifferenceOfSquaresCalculator {
    public int computeDifferenceOfSquares(int num){
        int sum = (int)Math.pow((num*(num+1))/2,2);
        int sumOfSquares = 0;
        for (int i = 1; i < num; i++) {
            sumOfSquares+=Math.pow(i,2);
        }
        return sumOfSquares-sum;
    }
    public int computeSumOfSquaresTo(int num){
        int sumOfSquares = 0;
        for (int i = 1; i <= num; i++) {
            sumOfSquares+=Math.pow(i,2);
        }
        return sumOfSquares;
    }
    public int computeSquareOfSumTo(int num){
        return (int)Math.pow((num*(num+1))/2,2);
    }
}
