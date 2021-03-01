public class _1710 {
    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][]{{1,3},{2,2},{3,1}}, 4));
        System.out.println(maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10));
        System.out.println(maximumUnits(new int[][]{{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}}, 35));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        bubbleSort(boxTypes); // here is the problem
//        for (int i = 0; i < boxTypes.length; i++) {
//            System.out.println(boxTypes[i][0]+ " " + boxTypes[i][1]);
//        }

        int size = 0;
        int box=0;
        int index =0;
        while(box<truckSize){
            if(index>=boxTypes.length){
                break;
            }
            if(box+ (boxTypes[index][0])<=truckSize){
                size+=boxTypes[index][0] * boxTypes[index][1];
                box+=boxTypes[index][0];
                index++;

            }
            else{
                if(boxTypes[index][0]>0){
                    size+=boxTypes[index][1];
                    box++;
                    boxTypes[index][0]--;
                }
                else{
                    index++;
                }
            }
        }
//        for (int i = 0; i < boxTypes.length; i++) {
//            System.out.println(boxTypes[i][0]+ " " + boxTypes[i][1]);
//        }

        return size;
    }
    static void bubbleSort(int[][] arr) {
        int n = arr.length;
        int[] temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1][1] < arr[j][1]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
}
