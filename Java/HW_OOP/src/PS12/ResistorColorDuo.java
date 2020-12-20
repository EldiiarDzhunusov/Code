package PS12;

import java.util.HashMap;

public class ResistorColorDuo {
    private HashMap<String,String> arr = new HashMap<>();

    public ResistorColorDuo() {
        arr.put("black","0");
        arr.put("brown","1");
        arr.put("red","2");
        arr.put("orange","3");
        arr.put("yellow","4");
        arr.put("green","5");
        arr.put("blue","6");
        arr.put("violet","7");
        arr.put("grey","8");
        arr.put("white","9");
    }
    public int value(String[] words){
        String ans = "";
        int counter=0;
        for (int i = 0; i < words.length; i++) {
            if(counter>1){
                break;
            }else{
                counter++;
                ans+=arr.get(words[i]);
            }
        }
        return Integer.parseInt(ans);
    }
}
