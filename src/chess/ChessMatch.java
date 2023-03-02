package chess;

import boardgame.Board;

public class ChessMatch {
    //Corção do sistema

    private Board board;

    public ChessMatch(){
        //é nessa classe que vai informar que vai ser 8 x 8 o tabuleiro
        board= new Board(8,8);
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i =0; i < board.getRows();i++){
            for (int j = 0; j < board.getColumns();j++){
                mat[i][j] = (ChessPiece)board.piece(i,j);   //downcasting
            }
        }
        return mat;
}
}
