package PS12;

public class IsbnVerifier {
    public boolean isValid(String word){
        try{
            int sum = 0;
            String words[] = word.split("-");
            word= String.join("",words);
            System.out.println(word);
            if(word.length()!=10){
                return false;
            }
            int index =0;
            for (int i = 10; i > 0; i--) {
                if(index==9){
                    System.out.println("check");
                    if(Character.compare(word.charAt(index),'X')==0){
                        sum+=10;
                    }
                    else{
                        sum+=Integer.parseInt(Character.toString(word.charAt(index)));
                    }
                }
                else{
                    sum+=Integer.parseInt(Character.toString(word.charAt(index))) * i;
                }
                index++;

            }
            System.out.println(sum);
            if(sum%11==0){
                return true;
            }
            else{
                return false;
            }
        }
        catch (Exception e){
            return false;
        }

    }
}
