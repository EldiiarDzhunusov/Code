public class _1309 {
    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        String[] arr= s.split("");
        String[] letters ={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int i=0;
        String ans="";
        while(i<arr.length){
            if(i<arr.length-2){
                if(arr[i+2].compareTo("#")==0){
                    String num = arr[i]+arr[i+1];
                    int index = Integer.parseInt(num)-1;
                    ans+=letters[index];
                    i+=3;
                }
                else{
                    int index = Integer.parseInt(arr[i])-1;
                    ans+=letters[index];
                    i++;
                }
            }
            else{
                int index = (Integer.parseInt(arr[i]))-1;

                ans+=letters[index];
                i++;
            }
        }

        System.out.println(ans);

    }
}
