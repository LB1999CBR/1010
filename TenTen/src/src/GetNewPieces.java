package src;

import java.util.ArrayList;
import java.util.Random;


public class GetNewPieces {
	public static void main(String[] args) {
		ArrayList<Piece> pieces = new ArrayList<Piece>();
		pieces = Pieces.initialisePieces();	
		ArrayList<Piece> randomPieces = new ArrayList<Piece>();
		int index = 0;
		for (int x = 0; x < 3; x++) {
			System.out.println();
			Random random = new Random();
			int rand = random.nextInt(pieces.size());
			System.out.println(rand);
			Piece specialPiece = pieces.get(rand);
			randomPieces.add(index, specialPiece);
			index++;
			for (int i = 0; i < specialPiece.rows; i++) {
				System.out.println();
				for (int j = 0; j < specialPiece.columns; j++) {
					if (specialPiece.shape[i][j] == true) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
		}
		Board.printBoard();
		Interaction.playGame(randomPieces);
	}

}