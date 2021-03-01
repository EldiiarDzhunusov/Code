import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class _1207 {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[]{1,2}));
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.get(arr[i])==null){
                hashMap.put(arr[i],1);
            }
            else{
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer num : hashMap.values()){
            hashSet.add(num);
            arrayList.add(num);
        }
        if(hashSet.size()==arrayList.size()){
            return true;
        }
        return false;
    }
}
