public class _1572 {
    public static void main(String[] args) {
        int[][] mat = {{5}};
        int size = mat.length-1;
        int ans=0;
        for (int i = 0; i < mat.length; i++) {
            ans+=mat[i][i];
            if(size-i !=i){
                ans+=mat[size-i][i];
            }
        }
        System.out.println(ans);


    }
}
