package src;

public class Board {
	
	static boolean[][] board = new boolean[10][10];
	//static int score = 0;
	
	public static boolean boardState(String coord, Piece piece) {
	//	assert coord.length() == 2;
		char letter = coord.charAt(0);
		int row = 0;
		if (letter >= 'A' && letter <= 'J') {
			row = letter - 'A';
		}
		else if (letter >= 'a' && letter <= 'j') {
			row = letter - 'a';
		}
		else {
			return false;
		}
		char c = coord.charAt(1);
		int column = Character.getNumericValue(c) - 1;
		if (coord.length() == 3) {
			column = 9;
		}
		System.out.println(row);
		System.out.println(column);
		if ((piece.rows + row - 1) >= 10 || (piece.columns + column - 1) >= 10) {
			return false;
		}
		for (int i = 0; i < piece.rows; i++) {
			for (int j = 0; j < piece.columns; j++) {
				 if (piece.shape[i][j] && (board[i + row][j + column])) {
					return false;
				}
			}
		}
	//	score = score + piece.score;							//determined piece can be placed, add score
		for (int i = 0; i < piece.rows; i++) {
			for (int j = 0; j < piece.columns; j++) {
				if (piece.shape[i][j]) {
					board[i + row][j + column] = true;	//coord must be relative to board
				}
			}
		}
		int counter = 0;
		int rowToClear = 0;
		for (int i = 0; i < 10; i++) {
			counter = 0;
			for (int j = 0; j < 10; j++) {
				if (board[i][j]) {
					counter++;
					rowToClear = i;
				}
				if (counter == 10) {
					//score = score + 10;
					for (int x = 0; x < 10; x++) {
						board[rowToClear][x] = false;
					}
				}
			}
		}
		counter = 0;
		int columnToClear  = 0;
		for (int i = 0; i < 10; i++) {
			counter = 0;
			for (int j = 0; j < 10; j++) {
				if (board[j][i]) {
					counter++;
					columnToClear = i;
				}
				if (counter == 10) {
					//score = score + 10;
					for (int x = 0; x < 10; x++) {
						board[x][columnToClear] = false;
					}
				}
			}
		} 
		return true;
	}
	
	public static void printBoard() {
		System.out.println();
		char z = 'A';
		int a = 0;
		for (int b = 0; b < 11; b++) {
			if (b == 0) {
				System.out.print(a + " ");
				a++;
			}
			else {
				System.out.print(" " + a + " ");
				a++;
			}
		}
		for (int i = 0; i < 10; i++ ) {
			System.out.println();
			System.out.print(z + " ");
			z++;
			for (int j = 0; j < 10; j++) {
				if (board[i][j] == false) {
					System.out.print(" . ");
				}
				else {
					System.out.print(" * ");
				}
			}
		}
	}
}
