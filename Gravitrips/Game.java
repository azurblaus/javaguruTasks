import java.io.IOException;
import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game() {
        board = new Board();
    }

    public void createPlayer() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select game mode:");
        System.out.println("1 - Player vs. Player");
        System.out.println("2 - Player vs. Computer");

        boolean quit = false;
        while (!quit) {
            try {
                int number = Integer.parseInt(scanner.next());
                if (number == 1) {
                    player2 = new HumanPlayer(2);
                    quit = true;
                } else if (number == 2) {
                    player2 = new ComputerPlayer();
                    quit = true;
                } else {
                    System.out.println("Please select valid option!");
                }
                player1 = new HumanPlayer(1);
            } catch (Exception e) {
                System.out.println("Please select valid option!");
            }
        }

        printPlayers(player1);
        printPlayers(player2);

        board.printBoard();
        currentPlayer = player1;
        System.out.println("BEGIN!");
    }

    public void printPlayers(Player player) {
        System.out.println("Player " + player.getPlayerName() + "'s game piece is: " + player.getGamePiece());
    }

    public void currentTurn() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public void runGame() {

        while (checkWinner() && board.checkBoard()) {

            currentTurn();

            int hit = 0;
            int freeSlot = 0;
            boolean correctHit = false;

            while (!correctHit) {
                hit = currentPlayer.getHit();
                freeSlot = board.checkHit(hit);
                correctHit = board.checkColumns(freeSlot);
            }

            board.addHit(hit, freeSlot, currentPlayer.getGamePiece());
            board.printBoard();
            System.out.println();
        }
    }

    public boolean checkWinner() {
        Winner winner = new Winner();
        if (isWinner(winner)) {
            System.out.println("GAME OVER! The winner is - " + currentPlayer.getPlayerName());
            return false;
        }
        return true;
    }

    private boolean isWinner(Winner winner) {
        return winner.vertical(board, currentPlayer.getGamePiece())
                || winner.horizontal(board, currentPlayer.getGamePiece())
                || winner.diagonalAscending(board, currentPlayer.getGamePiece())
                || winner.diagonalDescending(board, currentPlayer.getGamePiece());
    }
}