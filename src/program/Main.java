package program;

import boardgame.Board;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                application.UI.clearScreen();
                application.UI.printMatch(chessMatch);
                System.out.println();
                System.out.print("Source:");
                ChessPosition source = application.UI.readChessPosition(sc);

                //possible moves
                boolean [][] possibleMoves = chessMatch.possibleMoves(source);
                application.UI.clearScreen();
                application.UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = application.UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}