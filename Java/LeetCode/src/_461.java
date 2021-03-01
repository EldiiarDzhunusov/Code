public class _461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        int ans = 0;
        String bin1 = Integer.toBinaryString(x);
        String bin2 = Integer.toBinaryString(y);
        bin1 = reverseUsingStringBuilder(bin1);
        bin2 = reverseUsingStringBuilder(bin2);

        int size;
        if(bin1.length()>bin2.length()){
            size= bin1.length();
        }
        else{
            size = bin2.length();
        }
        while(bin1.length()<size){
            bin1+="0";
        }
        while(bin2.length()<size){
            bin2+="0";
        }
        bin1 = reverseUsingStringBuilder(bin1);
        bin2 = reverseUsingStringBuilder(bin2);

        for (int i = 0; i < size; i++) {
            if(bin1.charAt(i) != bin2.charAt(i)){
                ans++;
            }
        }




        return ans;

    }
    public static String reverseUsingStringBuilder(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder output = new StringBuilder(input).reverse();
        return output.toString();
    }
}
