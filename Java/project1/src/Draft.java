import java.util.Scanner;

class Draft{
    public static void main(String[] args) {
        String word= "AKICKSTARTPROBLEMNAMEDKICKSTART";
        String guess ="KICK";
        for (int index = word.indexOf(guess);
             index >= 0;
             index = word.indexOf(guess, index + 1))
        {
            System.out.println(index);
        }

    }
}



