import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    private Board gameBoard = new Board();

    private int hit = 0;
    private int freeSlot = 0;

    public void gameIntro() {
        System.out.println("Please select game mode:");
        System.out.println("1 - Player vs. Player");
        System.out.println("2 - Player vs. Computer");

        createPlayers();

        printPlayers(player1);
        printPlayers(player2);

        gameBoard.printBoard();
        currentPlayer = player1;
        System.out.println("BEGIN!");
    }

    public void createPlayers() {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        while (!quit) {
            try {
                int number = Integer.parseInt(scanner.next());
                if (number == 1) {
                    player1 = new HumanPlayer("1", GamePiece.X);
                    player2 = new HumanPlayer("2", GamePiece.O);
                    quit = true;
                } else if (number == 2) {
                    player1 = new HumanPlayer("1", GamePiece.X);
                    player2 = new ComputerPlayer();
                    quit = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please select valid option!");
            }
        }
    }

    public void printPlayers(Player player) {
        System.out.println("Player " + player.getPlayerName() + "'s game piece is: " + player.getGamePiece());
    }

    public void switchTurn() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public void runGame() {
        while (keepPlaying() && gameBoard.checkFreeSpace()) {
            switchTurn();
            boolean correctHit = false;
            while (!correctHit) {
                hit = currentPlayer.getHit();
                freeSlot = gameBoard.checkValidHit(hit);
                correctHit = gameBoard.checkColumnAvailability(freeSlot);
            }
            gameBoard.board[hit][freeSlot] = currentPlayer.getGamePiece();
            gameBoard.printBoard();
        }
    }

    public boolean keepPlaying() {
        if (gameBoard.vertical(currentPlayer.getGamePiece())
                || gameBoard.horizontal(currentPlayer.getGamePiece())
                || gameBoard.diagonalAscending(currentPlayer.getGamePiece())
                || gameBoard.diagonalDescending(currentPlayer.getGamePiece())) {
            System.out.println("GAME OVER! The winner is - " + currentPlayer.getPlayerName());
            return false;
        }
        return true;
    }
}
