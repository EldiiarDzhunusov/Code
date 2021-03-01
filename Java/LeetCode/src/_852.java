public class _852 {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0}));
        System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0}));
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2}));
        System.out.println(peakIndexInMountainArray(new int[]{3,4,5,1}));
        System.out.println(peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
        System.out.println(peakIndexInMountainArray(new int[]{18,29,38,59,98,100,99,98,90}));
        System.out.println(peakIndexInMountainArray(new int[]{1,57,58,74,88,93,98,97,96,91,90,78,77,74,71,68,61,50,42,38,35,34,26,20,15,14,5,4,2}));
        System.out.println(peakIndexInMountainArray(new int[]{3,5,3,2,0}));




    }
    public static int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

}
