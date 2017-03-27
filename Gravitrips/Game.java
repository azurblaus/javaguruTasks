import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    private Board board = new Board();

    public void gameIntro() {
        System.out.println("Please select game mode:");
        System.out.println("1 - Player vs. Player");
        System.out.println("2 - Player vs. Computer");

        createPlayers();

        printPlayers(player1);
        printPlayers(player2);

        board.printBoard();
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
                    player1 = new HumanPlayer();
                    player2 = new HumanPlayer(1);
                    quit = true;
                } else if (number == 2) {
                    player1 = new HumanPlayer();
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

    int hit = 0;
    int freeSlot = 0;

    public void runGame() {
        while (checkWinner() && board.checkBoard()) {
            switchTurn();
            boolean correctHit = false;
            while (!correctHit) {
                hit = currentPlayer.getHit();
                freeSlot = board.checkValidHit(hit);
                correctHit = board.checkColumnAvailability(freeSlot);
            }
            board.board[hit][freeSlot] = currentPlayer.getGamePiece();
            board.printBoard();
        }
    }

    public boolean checkWinner() {
        if (board.vertical(board, currentPlayer.getGamePiece())
                || board.horizontal(board, currentPlayer.getGamePiece())
                || board.diagonalAscending(board, currentPlayer.getGamePiece())
                || board.diagonalDescending(board, currentPlayer.getGamePiece())) {
            System.out.println("GAME OVER! The winner is - " + currentPlayer.getPlayerName());
            return false;
        }
        return true;
    }

}
