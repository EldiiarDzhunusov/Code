import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DominantPiranha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t!=0){
            int largest= 0;
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
                if(arr[i]>largest){
                    largest = arr[i];
                }
            }
            solution(arr, size,largest);
            t--;
        }
    }
    public static void solution(int[] arr, int size, int largest){
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if(arr[i]==largest){
                indexes.add(i);
            }
        }
        //System.out.println(Arrays.toString(indexes.toArray()));
        int ans = -1;
        if(indexes.size()==1){
            ans = indexes.get(0)+1;
        }
        else{
            for (int i = 0; i < indexes.size(); i++) {

                if(indexes.get(i)==0) {

                    if (arr[indexes.get(i)] > arr[indexes.get(i) + 1]) {
                        ans= indexes.get(i)+1;
                        break;
                    }
                }
                else if (size-1==indexes.get(i)){

                    if (arr[indexes.get(i)]>arr[indexes.get(i)-1]){
                        ans= indexes.get(i)+1;
                        break;
                    }
                }
                else{

                    if( (arr[indexes.get(i)]>arr[indexes.get(i)+1]) ||  (arr[indexes.get(i)]>arr[indexes.get(i)-1]) ){

                        ans= indexes.get(i)+1;
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
        }

    }

