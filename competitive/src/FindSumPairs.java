import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class FindSumPairs {

    private int[] arr1;
    private int[] arr2;
    private HashMap<Integer,Integer> hashMap = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.arr1 = nums1;
        this.arr2 = nums2;
        for (int i = 0; i < arr2.length; i++) {
            if(!hashMap.containsKey(arr2[i])){
                hashMap.put(arr2[i],1);
            }else{
                hashMap.put(arr2[i],hashMap.get(arr2[i])+1);
            }
        }
    }

    public void add(int index, int val) {
        hashMap.put(arr2[index],hashMap.get(arr2[index])-1);
        if(hashMap.containsKey(arr2[index]+val)){
            hashMap.put(arr2[index]+val,hashMap.get(arr2[index]+val)+1);
        }
        else{
            hashMap.put(arr2[index]+val,1);
        }

        arr2[index]+=val;
    }

    public int count(int tot) {
        int ans = 0;

        for (int i = 0; i < arr1.length; i++) {
            int numsNeeded = tot-arr1[i];
            if(hashMap.containsKey(numsNeeded)){
                ans+=hashMap.get(numsNeeded);
            }
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */