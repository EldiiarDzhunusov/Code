import java.math.RoundingMode;
import java.text.DecimalFormat;

public class masters4 {
    public static void main(String[] args) {
        double lower = Math.PI/2;
        double upper = 0.5;
        double m = (lower+upper)/2;
        for (int i = 0; i < 1425344; i++) {
            if(f(m) >0){
                upper = m;
            }
            else{
                lower = m;
            }
            m = (lower +upper)/2;
        }
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        String ans = df.format(m);
        String answer = ans.substring(0,1);
        answer+=",";
        answer+=ans.substring(2);
        System.out.println(answer);
    }
    public static double f(double m){
        return 0.5*Math.sin(m)+Math.cos(m) - 1.1;
    }
}
