import java.util.Scanner;

class Draft{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = "bbbbbbb";
        String a = "bb";
        int i = 0;
        int count=0;
        while(i<=b.length()-2){
            System.out.println(b.substring(i,i+2));
            if(a.compareTo(b.substring(i,i+2))==0){
                count++;
            }
            i++;
        }
        System.out.println(count);

    }
}



