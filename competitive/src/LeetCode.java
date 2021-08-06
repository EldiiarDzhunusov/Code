import java.util.*;

public class LeetCode {

    public int fib(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);
        int index = 2;
        for (int i = 0; i < n - 2; i++) {
            list.add(list.get(index)+list.get(index-1));
            index++;
        }
        return list.get(n);

    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        Arrays.sort(arr1);
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i],0)+1);
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            int times = map1.get(arr2[i]);
            for (int j = 0; j < times; j++) {
                arr[index] = arr2[i];
                index++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if(!set.contains(arr1[i])){
                arr[index] = arr1[i];
                index++;
            }
        }
        return arr;
    }
}
