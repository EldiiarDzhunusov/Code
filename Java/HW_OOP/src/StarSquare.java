public class StarSquare {
    public static void main(String[] args) {
        int i=1;
        char star = '*';
        while (i<=25) {
            if(i%5==0 ){
                System.out.println(star);
            }
            else{
                System.out.print(star);
            }
            i++;
        }
    }
}
