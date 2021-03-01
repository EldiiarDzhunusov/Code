public class _1678 {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));

    }
    public static String interpret(String command) {
        String ans = "";
        for (int i = 0; i < command.length(); i++) {

            if(command.charAt(i)=='G'){
                ans+="G";
            }
            if(i+2<=command.length()){
                if(command.substring(i,i+2).compareTo("()")==0){
                    ans+="o";

                }
            }
            if(i+4<=command.length()){

                if(command.substring(i,i+4).compareTo("(al)")==0){
                    ans+="al";

                }
            }
        }
        return ans;
    }
}
