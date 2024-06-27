package program;

import boardgame.Board;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        application.UI.printBoard(chessMatch.getPieces());
    }
}