package src;

public class Piece {
	boolean[][] shape;
	int rows;
	int columns;
	int score;
	public Piece(boolean[][] shape, int rows, int columns, int score) {
		this.shape = shape;	
		this.rows = rows;
		this.columns = columns;
		this.score = score;
		//create an array list of shapes 
	}	
}