package boardgame;

public class Piece {

    protected Position position;
    protected Board board;


    public Piece(Board board) { //para criar uma peça tenho que informar o board
        this.board = board;
        position = null;    //o java ja deixa nullo
    }

    protected Board getBoard() { //somente classse dentro do mesmo pacote e subclasses vão poder acessar o taboleiro de uma peça
        return board;
    }

}
