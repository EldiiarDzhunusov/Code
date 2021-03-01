import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class HashCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int simulatorTime = scanner.nextInt();
        int intersectionNumber = scanner.nextInt();
        int streetNumber =scanner.nextInt();
        int carNumber = scanner.nextInt();
        // Intersections
        ArrayList<ArrayList<String>> IntersectionStreets= new ArrayList<>();
        //input Streets with start end time
        HashMap<String,ArrayList<Integer>> hashMapStreets = new HashMap<>();
        for (int i = 0; i < streetNumber; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            String street = scanner.next();
            int distance = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(start);
            arrayList.add(end);
            arrayList.add(distance);
            hashMapStreets.put(street,arrayList);
        }
        // input cars and their Routes
        ArrayList<ArrayList<String>> carRoutesArrayList = new ArrayList<>();
        for (int i = 0; i < carNumber; i++) {
            ArrayList<String> carRoute = new ArrayList<>();
            int num = scanner.nextInt();
            for (int j = 0; j < num; j++) {
                carRoute.add(scanner.next());
            }
            carRoutesArrayList.add(carRoute);
        }
        HashMap<String,Queue<Integer>> hashMapStreetQueue = new HashMap<>();


    }
}
