enum GamePiece {
    X("x"), O("o"), EMPTY(".");

    private String gamePiece;

    GamePiece(String gamePiece){
        this.gamePiece = gamePiece;
    }

    @Override
    public String toString(){
        return this.gamePiece;
    }
}
