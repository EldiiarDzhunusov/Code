package temp;

public class ResistorColor {
    public int colorCode(String color) {
        String[] a ={ "black",
                "brown",
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "violet",
                "grey",
                "white",};
        int ans = -1;
        for (int i = 0; i < a.length; i++) {
            if(a[i].compareTo(color)==0){
                ans = i;
                break;
            }
        }
        return ans;
    }

    public String[] colors() {
        String[] a ={ "Black",
                "Brown",
                "Red",
                "Orange",
                "Yellow",
               " Green",
                "Blue",
               " Violet",
                "Grey",
                "White",};
        return a;
    }
}
