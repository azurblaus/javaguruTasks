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

    public void createPlayers() throws IOException {
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
                    player2 = new ComputerPlayer(1);
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

    public void switchTurn() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public void runGame() {

        while (checkWinner() && board.checkBoard()) {

            switchTurn();

            int hit = 0;
            int freeSlot = 0;
            boolean correctHit = false;

            while (!correctHit) {
                hit = currentPlayer.getHit();
                freeSlot = board.checkValidHit(hit);
                correctHit = board.checkColumnAvailability(freeSlot);
            }

            board.board[hit][freeSlot] = currentPlayer.getGamePiece();
            board.printBoard();
        }
        System.out.println("GAME OVER! The winner is - " + currentPlayer.getPlayerName());
    }

    public boolean checkWinner() {
        if (isWinner() == true) {
            return false;
        }
        return true;
    }

    public boolean isWinner() {
        return vertical(board, currentPlayer.getGamePiece())
                || horizontal(board, currentPlayer.getGamePiece())
                || diagonalAscending(board, currentPlayer.getGamePiece())
                || diagonalDescending(board, currentPlayer.getGamePiece());
    }


    public boolean vertical(Board board, GamePiece gamePiece) {
        for (int row = 0; row < board.ROWS - 3; row++) {
            for (int column = 0; column < board.COLUMNS; column++) {
                if (board.board[column][row] == board.board[column][row + 1]
                        && board.board[column][row] == board.board[column][row + 2]
                        && board.board[column][row] == board.board[column][row + 3]
                        && board.board[column][row] != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean horizontal(Board board, GamePiece gamePiece) {
        for (int row = 0; row < board.ROWS; row++) {
            for (int column = 0; column < board.COLUMNS - 3; column++) {
                if (board.board[column][row] == board.board[column + 1][row]
                        && board.board[column][row] == board.board[column + 2][row]
                        && board.board[column][row] == board.board[column + 3][row]
                        && board.board[column][row] != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean diagonalAscending(Board board, GamePiece gamePiece) {
        for (int row = 3; row < board.ROWS; row++) {
            for (int column = 0; column < board.COLUMNS - 3; column++) {
                if (board.board[column][row] == board.board[column + 1][row - 1]
                        && board.board[column][row] == board.board[column + 2][row - 2]
                        && board.board[column][row] == board.board[column + 3][row - 3]
                        && board.board[column][row] != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean diagonalDescending(Board board, GamePiece gamePiece) {
        for (int row = 0; row < board.ROWS - 3; row++) {
            for (int column = 0; column < board.COLUMNS - 3; column++) {
                if (board.board[column][row] == board.board[column + 1][row + 1]
                        && board.board[column][row] == board.board[column + 2][row + 2]
                        && board.board[column][row] == board.board[column + 3][row + 3]
                        && board.board[column][row] != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }
}
