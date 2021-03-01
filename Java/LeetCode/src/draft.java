import java.util.HashMap;

public class draft {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        if(hashMap.get(1)==null){
            hashMap.put(1,2);
        }
        System.out.println(hashMap);
    }

}
