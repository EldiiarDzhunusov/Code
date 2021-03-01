public class _1732 {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude+=gain[i];
            if(altitude>max){
                max = altitude;
            }
        }
        return max;
    }
}
