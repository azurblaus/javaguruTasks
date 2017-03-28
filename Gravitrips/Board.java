public class Board {

    public static final int COLUMNS = 7;
    public static final int ROWS = 6;
    public GamePiece[][] board = new GamePiece[COLUMNS][ROWS];


    public Board() {
        for (int j = 0; j < ROWS; j++) {
            for (int i = 0; i < COLUMNS; i++) {
                board[i][j] = GamePiece.EMPTY;
            }
        }
    }

    public void printBoard() {

        for (int i = 1; i <= 7; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(board[j][i] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }


    public int checkValidHit(int hit) {
        int i = 5;

        while ((i >= 0) && (board[hit][i] != (GamePiece.EMPTY))) {
            i--;
        }
        return i;
    }

    public boolean checkColumnAvailability(int space) {
        if (space == -1) {
            System.out.println("Column is already full, try again!");
        }
        return space != -1;
    }

    public boolean checkFreeSpace() {
        boolean check = false;
        for (int i = 0; i < COLUMNS; i++) {
            board[i][0].equals(GamePiece.EMPTY);
            check = true;
        }
        if (!check) {
            System.out.println("Game over, no more moves!");
        }
        return check;
    }

    public boolean vertical(GamePiece gamePiece) {
        for (int row = 0; row < ROWS - 3; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                if (board[column][row] == board[column][row + 1]
                        && board[column][row] == board[column][row + 2]
                        && board[column][row] == board[column][row + 3]
                        && board[column][row] != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean horizontal(GamePiece gamePiece) {
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS - 3; column++) {
                if (board[column][row] == board[column + 1][row]
                        && board[column][row] == board[column + 2][row]
                        && board[column][row] == board[column + 3][row]
                        && board[column][row] != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean diagonalAscending(GamePiece gamePiece) {
        for (int row = 3; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS - 3; column++) {
                if (board[column][row] == board[column + 1][row - 1]
                        && board[column][row] == board[column + 2][row - 2]
                        && board[column][row] == board[column + 3][row - 3]
                        && board[column][row] != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean diagonalDescending(GamePiece gamePiece) {
        for (int row = 0; row < ROWS - 3; row++) {
            for (int column = 0; column < COLUMNS - 3; column++) {
                if (board[column][row] == board[column + 1][row + 1]
                        && board[column][row] == board[column + 2][row + 2]
                        && board[column][row] == board[column + 3][row + 3]
                        && board[column][row] != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }
}

