package PS12;

public class ArmstrongNumbers {
    private String[] numbers;


    public boolean isArmstrongNumber(int number){
        this.numbers = Integer.toString(number).split("");
        int sum = 0;
        int pow = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            sum+=Math.pow(Integer.parseInt(numbers[i]),pow);
        }
        return sum==number;

    }
}
