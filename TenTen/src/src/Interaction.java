package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Interaction {
	public static void playGame(ArrayList<Piece> randomPieces) {
		int count = randomPieces.size();
		System.out.println();
		for (int i = 0; i < 3; i++) {
			if (checkIfDead(randomPieces)) {
				System.out.println("YOU ARE DEAD. NO POSSIBLE MOVES");
				throw new java.lang.Error("you are dead");
			}
			Scanner in = new Scanner(System.in);
			System.out.println();
			System.out.println("enter a number from 1 to " + count);
			count--;
			int input = in.nextInt() - 1;
			Piece selectedPiece = randomPieces.get(input);
			System.out.println();
			System.out.println("enter coordinates to place piece (letter then number)");	
			String innie = in.next();
			if (!(Board.boardState(innie, selectedPiece))) {
				System.out.println("you cant put that there. Try again somewhere else");
				count++;
				i--;
			}
			else {
				System.out.println("Successful placement at " + innie.substring(1));
				randomPieces.remove(input);
			}
			Board.printBoard();
			System.out.println();
			//System.out.println("Your current score is " + Board.score);
		}
		GetNewPieces.main(null);
	}
	
	/**
	 * @param pieces
	 * @return true if dead
	 */
	public static boolean checkIfDead(ArrayList<Piece> pieces) {
		for (int i = 0; i < pieces.size(); i++) {
			Piece currentPiece = pieces.get(i);
			for (int row = 0; row < 10; row++) {
				for (int column = 0; column < 10; column++) {
					 if (testCanPlacePiece(currentPiece, row, column)) {
						 return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean testCanPlacePiece(Piece piece, int row, int column) {
		if ((piece.rows + row - 1) >= 10 || (piece.columns + column - 1) >= 10) {
			return false;
		}
		for (int i = 0; i < piece.rows; i++) {
			for (int j = 0; j < piece.columns; j++) {
				 if (piece.shape[i][j] && (Board.board[i][j])) {
						System.out.println("THIS CODE HAS RUN 1");
					return false;
				}
			}
		}
		return true;
		
	}
}