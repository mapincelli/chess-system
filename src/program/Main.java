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
                application.UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source:");
                ChessPosition source = application.UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = application.UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}