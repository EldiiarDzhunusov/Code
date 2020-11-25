package CodeForces;

import java.util.Scanner;

public class CFE98_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t!=0){
            int x = Math.abs(scanner.nextInt());
            int y = Math.abs(scanner.nextInt());

            solution(x,y);
            t--;

        }
    }
    public static void solution(int x, int y){
        int xCount = 0;
        int yCount = 0;
        int ans = 0;
        while(x>0 || y>0){
            if(x>=y && xCount==0 && x>0){
                xCount++;
                yCount=0;
                ans++;
                x--;
            }
            else if(y>=x && yCount==0 && y>0){
                yCount++;
                xCount=0;
                ans++;
                y--;
            }
            else{
                yCount=0;
                xCount=0;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
