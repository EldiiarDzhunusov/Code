package Other;

import java.util.Scanner;

public class WC06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wo = scanner.nextLine();
        wo = wo.trim();
        String[] arr = wo.split("");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(x1==x2 && y1==y2){
                break;

            }
            else{
                ans++;
                if(arr[i].compareTo("@")==0){
                    if(y1+1<=y2){
                        y1++;

                    }
                }
                else if(arr[i].compareTo("#")==0){
                    if(y1-1>=y2){
                        y1--;

                    }
                }
                else if(arr[i].compareTo("$")==0){
                    if(x1+1<=x2){
                        x1++;

                    }
                }
                else if(arr[i].compareTo("&")==0){
                    if(x1-1>=x2){
                        x1--;

                    }
                }
            }
        }
        if(y1!=y2 || x1!=x2){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}
