public class _1217 {
    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[]{1,2,3}));
        System.out.println(minCostToMoveChips(new int[]{2,2,2,3,3}));
        System.out.println(minCostToMoveChips(new int[]{1,1000000000}));
    }
    public static int minCostToMoveChips(int[] position) {
        int odd=0;
        int even = 0;
        for (int i = 0; i < position.length; i++) {
            if(position[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
