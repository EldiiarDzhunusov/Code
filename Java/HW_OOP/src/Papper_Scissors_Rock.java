import java.util.Scanner;

public class Papper_Scissors_Rock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player1: ");
        String player1 = scanner.nextLine();
        System.out.print("Player2: ");
        String player2 = scanner.nextLine();
        if (player1.equals(player2)){
            System.out.println("Draw");
        }
        else if (player1.equals("sc") && player2.equals("pp")){
            System.out.println("Winner is Player1");
        }
        else if (player1.equals("pp") && player2.equals("rc")){
            System.out.println("Winner is Player1");
        }
        else if (player1.equals("rc") && player2.equals("sc")){
            System.out.println("Winner is Player1");
        }
        else if (player2.equals("rc") && player1.equals("sc")){
            System.out.println("Winner is Player2");
        }
        else if (player2.equals("pp") && player1.equals("rc")){
            System.out.println("Winner is Player2");
        }
        else if (player2.equals("sc") && player1.equals("pp")){
            System.out.println("Winner is Player2");
        }
    }
}
