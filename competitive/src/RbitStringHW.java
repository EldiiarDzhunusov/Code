public class RbitStringHW {
    public static void main(String[] args) {
        bit("",8);
    }

    public static void bit(String s,int n){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        if(s.length()==0){
            bit("1",n);
            bit("0",n);
        }
        else{
            if(s.charAt(s.length()-1)=='1'){
                bit(s+"0",n);
            }
            bit(s+"1",n);
        }
    }
}
