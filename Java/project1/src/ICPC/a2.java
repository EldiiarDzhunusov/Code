package ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.trim();
        String arr[]=word.split("");
        boolean check = false;
        while(check==false)
        {
            increm(arr);
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].compareTo("A")==0){
                    check=true;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();


    }

    public static void increm(String[] arr) {
        int size = arr.length;
        if(arr[size-1].compareTo("A")==0 ){
            arr[size-1] = "P";
        }
        else if(arr[size-1].compareTo("P")==0){
            arr[size-1] = "Q";
        }
        else{
            int index = size-2;
            arr[index+1]="A";
            int adder =1;
            while(true){
                if(adder == 0){
                    break;
                }
                else{
                    if(arr[index].compareTo("Q")!=0){
                        adder=0;
                        //pass
                        if(arr[index].compareTo("A")==0){
                            arr[index]="P";
                        }
                        else{
                            arr[index] = "Q";
                        }
                    }
                    else{
                        arr[index]="A";
                        index--;
                    }

                }

            }
        }
    }
}
