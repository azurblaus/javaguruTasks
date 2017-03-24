import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(int numOfPlayers){
        setPlayerName("Computer");
        setGamePiece(GamePiece.O);

    }

    @Override
    public int getHit(){

        Random random = new Random();
        return random.nextInt(7);
    }
}
