public class Main {
    private static int[] x ={1,18,35,52,68,85,102,119,136,153,170};
    private static int[] y ={0,145,289,430,568,702,831,953,1069,1178,1280};
    public static void main(String[] args) {
        for (int i = 0; i < x.length; i++) {
            a = (y[i+1] - y[i])/(x[i+1] - x[i]);
        }
    }
}
