package Done;

public class WaveNumbers40 {
    public static void main(String[] args) {
        //first line
        int firstline = 0;
        while(firstline<40){
            System.out.print("-");
            firstline++;
        }
        System.out.println();
        //smiles
        int smiles = 0;
        while(smiles<20){
            if (smiles%2==0){
                System.out.print("_");
            }
            else{
                System.out.print("-^-");
            }
            smiles++;
        }
        System.out.println();
        //numbers
        int numbers = 1;
        while(numbers<=20) {
            int count = 0;
            while(count<2){
                System.out.print(numbers%10);
                count++;
            }

            numbers++;
        }
        System.out.println();
        //last line
        int lastline = 0;
        while(lastline<40){
            System.out.print("-");
            lastline++;
        }
    }
}
