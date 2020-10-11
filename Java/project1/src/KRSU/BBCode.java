package KRSU;

import java.util.Scanner;
//Incomplete
public class BBCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //indexing will be: B is 0 and 1; I is 2 and 3; U is 4 and 5;
        int[] check = {0,0,0,0,0,0};

        while(checkerItemsLeftB(check)){
            
        }
        while(checkerItemsLeftI(check)){

        }
        while(checkerItemsLeftB(check)){

        }




    }
    public static void indexing(int[] check,String text){
        for (int i = 0; i < 6; i++) {
            check[0]= Math.max(text.indexOf("[B]"),text.indexOf("[b]"));
            check[1]= Math.max(text.indexOf("[/B]"),text.indexOf("[/b]"));
            check[2]= Math.max(text.indexOf("[I]"),text.indexOf("[i]"));
            check[3]= Math.max(text.indexOf("[/I]"),text.indexOf("[/i]"));
            check[4]= Math.max(text.indexOf("[U]"),text.indexOf("[u]"));
            check[5]= Math.max(text.indexOf("[/U]"),text.indexOf("[/U]"));
        }
    }

    public static boolean checkerItemsLeftB(int[] check){
        if (check[0]>=0 && check[1]>=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean checkerItemsLeftI(int[] check){
        if (check[2]>=0 && check[3]>=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean checkerItemsLeftU(int[] check){
        if (check[4]>=0 && check[5]>=0){
            return true;
        }
        else{
            return false;
        }
    }

}