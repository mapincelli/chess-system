package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Tower;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces (){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows();i++){
            for (int j=0; j<board.getColumns();j++){
                mat[i][j] = (ChessPiece)board.piece(i,j);
            }
        }
        return mat;
    }

    public void initialSetup(){
        //WHITE side
        board.placePiece(new Tower(board, Color.WHITE), new Position(0,0));
        board.placePiece(new Tower(board, Color.WHITE), new Position(0,7));
        board.placePiece(new King(board, Color.WHITE), new Position(0,4));

        //BLACK side
        board.placePiece(new Tower(board, Color.BLACK), new Position(7,0));
        board.placePiece(new Tower(board,Color.BLACK),new Position(7,7));
        board.placePiece(new King(board,Color.BLACK), new Position(7,3));
    }
}
