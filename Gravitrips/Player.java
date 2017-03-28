import java.util.Scanner;

public abstract class Player {

    private String playerName;
    private GamePiece gamePiece;

    public Player(String playerName, GamePiece gamePiece) {
        this.playerName = playerName;
        this.gamePiece = gamePiece;
    }

    public abstract int getHit();

    public GamePiece getGamePiece() {
        return gamePiece;
    }

    public void setGamePiece(GamePiece gamePiece) {
        this.gamePiece = gamePiece;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


}
