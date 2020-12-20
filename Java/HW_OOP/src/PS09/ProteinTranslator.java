package PS09;

import java.util.ArrayList;
import java.util.List;

public class ProteinTranslator {
    List<String> list = new ArrayList<>();

    public List<String> translate(String word){
        List<String> list = new ArrayList<>();
        for (int i = 0; i+3 <= word.length(); i+=3) {

            String temp = word.substring(i,i+3);
            String ans = protein(temp);
            if(ans.equals("STOP")){
                return list;
            }
            else{
                list.add(ans);
            }

        }
        return list;
    }
    private String protein (String temp){
        String w = "";
        switch (temp){
            case "AUG":
                w = "Methionine";
                break;
            case "UUU": case "UUC":
                w ="Phenylalanine";
                break;
            case "UUA": case "UUG":
                w ="Leucine";
                break;
            case "UCU": case "UCC": case "UCA": case "UCG":
                w ="Serine";
                break;
            case "UAU": case "UAC":
                w ="Tyrosine";
                break;
            case "UGU": case "UGC":
                w ="Cysteine";
                break;
            case "UGG":
                w ="Tryptophan";
                break;
            case "UAA": case "UAG": case "UGA":
                w = "STOP";
                break;
            default:
                break;
        }
        return w;
    }
}
