import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        super("Computer", GamePiece.O);
    }

    @Override
    public int getHit(){

        Random random = new Random();
        return random.nextInt(7);
    }
}
