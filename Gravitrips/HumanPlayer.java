import java.io.IOException;
import java.util.Scanner;

public class HumanPlayer extends Player {

    public Scanner scanner = new Scanner(System.in);

    public HumanPlayer(int numOfPlayers) throws IOException {
        String number;

        if (numOfPlayers == 1) {
            number = "first";
            setGamePiece(GamePiece.X);
        } else {
            number = "second";
            setGamePiece(GamePiece.O);
        }
        System.out.print("Please enter the name of " + number + " player: ");
        setPlayerName(scanner.nextLine());
    }

    @Override
    public int getHit() {
        return userInput();
    }

    private int userInput() {
        int move = 0;
        boolean validInput = false;

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
