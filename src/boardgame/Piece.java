package boardgame;

public abstract class Piece {

    protected Position position;
    protected Board board;


    public Piece(Board board) { //para criar uma peça tenho que informar o board
        this.board = board;
        position = null;    //o java ja deixa nullo
    }

    protected Board getBoard() { //somente classse dentro do mesmo pacote e subclasses vão poder acessar o taboleiro de uma peça
        return board;
    }

    public abstract boolean[][] possibleMoves();
    public boolean possibleMoves(Position position){
    return possibleMoves()[position.getRow()][position.getColumn()];
}

public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length;i++){
            for (int j = 0; j < mat.length;j++){
                if (mat[i][j]){
                    return true;
                }
            }
        }
    return false;
}


}
