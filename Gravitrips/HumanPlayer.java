import java.util.Scanner;


public class HumanPlayer extends Player {

    public HumanPlayer() {
        Scanner scanner = new Scanner(System.in);
        setGamePiece(GamePiece.X);
        System.out.print("Please enter the name of the player: ");
        setPlayerName(scanner.nextLine());
    }

    public HumanPlayer(int humanVsHuman) {
        Scanner scanner = new Scanner(System.in);
        setGamePiece(GamePiece.O);
        System.out.println("Please enter the name of the player: ");
        setPlayerName(scanner.nextLine());
    }

    @Override
    public int getHit() {
        int move = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        while (!validInput) {
            System.out.println("Player " + getPlayerName() + " set token - " + getGamePiece() + " from 1 to 7: ");
            try {
                String input = scanner.nextLine();
                move = Integer.parseInt(input);
                if ((move >= 1) && (move <= 7)) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again!");
            }
        }
        return move - 1;
    }
}
