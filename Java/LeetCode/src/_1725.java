public class _1725 {
    public static void main(String[] args) {
        System.out.println(countGoodRectangles(new int[][]{{5,8},{3,9},{5,12},{16,5}}));
        System.out.println(countGoodRectangles(new int[][]{{2,3},{3,7},{4,3},{3,7}}));
    }
    public static int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int num;
        for (int i = 0; i < rectangles.length; i++) {
            if(Math.min(rectangles[i][0],rectangles[i][1])>max){
                max = Math.min(rectangles[i][0],rectangles[i][1]);
            }
        }
        int ans = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if(Math.min(rectangles[i][0],rectangles[i][1])==max){
                ans++;
            }
        }
        return ans;

    }
}
