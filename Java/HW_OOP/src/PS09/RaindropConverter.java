package PS09;

public class RaindropConverter {
    private int num;

    public String convert(int num){
        String ans ="";
        boolean cond = false;
        if(num%3==0){
            ans+="Pling";
            cond = true;
        }
        if(num%5==0){
            ans+="Plang";
            cond = true;
        }
        if(num%7==0){
            ans+="Plong";
            cond = true;
        }
        if(cond){
            return ans;
        }
        else{
            return Integer.toString(num);
        }

    }


}
