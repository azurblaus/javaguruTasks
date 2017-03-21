public class Winner {

    public boolean vertical(Board board, GamePiece gamePiece) {
        for (int row = 0; row < board.ROWS - 3; row++) {
            for (int column = 0; column < board.COLUMNS; column++) {
                if (board.getCell(column, row) == board.getCell(column, row + 1)
                        && board.getCell(column, row) == board.getCell(column, row + 2)
                        && board.getCell(column, row) == board.getCell(column, row + 3)
                        && board.getCell(column, row) != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean horizontal(Board board, GamePiece gamePiece) {
        for (int row = 0; row < board.ROWS; row++) {
            for (int column = 0; column < board.COLUMNS - 3; column++) {
                if (board.getCell(column, row) == board.getCell(column + 1, row)
                        && board.getCell(column, row) == board.getCell(column + 2, row)
                        && board.getCell(column, row) == board.getCell(column + 3, row)
                        && board.getCell(column, row) != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean diagonalAscending(Board board, GamePiece gamePiece) {
        for (int row = 3; row < board.ROWS; row++) {
            for (int column = 0; column < board.COLUMNS - 3; column++) {
                if (board.getCell(column, row) == board.getCell(column + 1, row - 1)
                        && board.getCell(column, row) == board.getCell(column + 2, row - 2)
                        && board.getCell(column, row) == board.getCell(column + 3, row - 3)
                        && board.getCell(column, row) != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean diagonalDescending(Board board, GamePiece gamePiece) {
        for (int row = 0; row < board.ROWS - 3; row++) {
            for (int column = 0; column < board.COLUMNS - 3; column++) {
                if (board.getCell(column, row) == board.getCell(column + 1, row + 1)
                        && board.getCell(column, row) == board.getCell(column + 2, row + 2)
                        && board.getCell(column, row) == board.getCell(column + 3, row + 3)
                        && board.getCell(column, row) != gamePiece.EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }
}
