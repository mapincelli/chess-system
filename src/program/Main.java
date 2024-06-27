package program;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);
        while (true) {
            application.UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source:");
            ChessPosition source = application.UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = application.UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }
    }
}