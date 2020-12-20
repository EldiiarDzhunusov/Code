import java.util.Arrays;

public class _1475 {
    public static void main(String[] args) {
        int[] prices = {10,1,1,6};
        finalPrices(prices);
        System.out.println(Arrays.toString(prices));
    }
    public static int[] finalPrices(int[] prices){
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if(prices[i]>=prices[j] && i!=j){
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
