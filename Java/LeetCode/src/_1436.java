import java.util.ArrayList;


public class _1436 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> paths = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("London");
        list1.add("New York");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("New York");
        list2.add("Lima");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Lima");
        list3.add("Sao Paulo");
        paths.add(list1);
        paths.add(list2);
        paths.add(list3);



        String ans="";
        int cond=1;
        for (int i = 0; i < paths.size(); i++) {
            for (int j = 0; j < paths.size(); j++) {
                if((paths.get(j).get(0)).compareTo(paths.get(i).get(1))==0){
                    cond=0;
                    break;
                }
            }
            if(cond==1){
                ans=paths.get(i).get(1);
                break;
            }
            cond=1;

        }
        System.out.println(ans);

    }
}
