package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Pieces {
	public static ArrayList<Piece> initialisePieces() {
		ArrayList<Piece> piecesList = new ArrayList<Piece>();
		int index = 0;
		boolean[][] lShapeOne = new boolean[3][3];
		lShapeOne [0][0] = true;
		lShapeOne [0][1] = true;
		lShapeOne [0][2] = true;
		lShapeOne [1][2] = true;
		lShapeOne [2][2] = true;
		piecesList.add(index, new Piece(lShapeOne, 3, 3, 5));
		
//		index++;												debuggy bugg bugg bug
//		boolean[][] testShape = new boolean[9][9];
//		for (int i = 0; i < 9; i ++) {
//			Arrays.fill(testShape[i], true);
//		}
//		piecesList.add(index, new Piece(testShape, 9, 9, 5));

		index++;
		boolean[][] lShapeTwo = new boolean[3][3];
		lShapeTwo [0][0] = true;
		lShapeTwo [1][0] = true;
		lShapeTwo [2][0] = true;
		lShapeTwo [2][1] = true;
		lShapeTwo [2][2] = true;
		piecesList.add(index, new Piece(lShapeTwo, 3, 3, 5));
		
		index++;
		boolean[][] lShapeThree = new boolean[3][3];
		lShapeThree [0][0] = true;
		lShapeThree [1][0] = true;
		lShapeThree [2][0] = true;
		lShapeThree [0][1] = true;
		lShapeThree [0][2] = true;
		piecesList.add(index, new Piece(lShapeThree, 3, 3, 5));
		
		index++;
		boolean[][] lShapeFour = new boolean[3][3];
		lShapeFour [0][0] = true;
		lShapeFour [1][2] = true;
		lShapeFour [0][2] = true;
		lShapeFour [0][1] = true;
		lShapeFour [2][2] = true;
		piecesList.add(index, new Piece(lShapeFour, 3, 3, 5));
		
		index++;
		boolean[][] nineBlock = new boolean[3][3];
		nineBlock [0][0] = true;
		nineBlock [0][1] = true;
		nineBlock [0][2] = true;
		nineBlock [1][0] = true;
		nineBlock [1][1] = true;
		nineBlock [1][2] = true;
		nineBlock [2][0] = true;
		nineBlock [2][1] = true;
		nineBlock [2][2] = true;
		piecesList.add(index, new Piece(nineBlock, 3, 3, 9));
		
		index++;
		boolean[][] fourBlock = new boolean[2][2];
		fourBlock [0][0] = true;
		fourBlock [0][1] = true;
		fourBlock [1][0] = true;
		fourBlock [1][1] = true;
		piecesList.add(index, new Piece(fourBlock, 2, 2, 4));
		
		index++;
		boolean[][] smallLShapeOne = new boolean[2][2];
		smallLShapeOne [0][0] = true;
		smallLShapeOne [1][0] = true;
		smallLShapeOne [1][1] = true;
		piecesList.add(index, new Piece(smallLShapeOne, 2, 2, 3));
		
		index++;
		boolean[][] smallLShapeTwo = new boolean[2][2];
		smallLShapeTwo [0][1] = true;
		smallLShapeTwo [1][0] = true;
		smallLShapeTwo [1][1] = true;
		piecesList.add(index, new Piece(smallLShapeTwo, 2, 2, 3));
		
		index++;
		boolean[][] smallLShapeThree = new boolean[2][2];
		smallLShapeThree [0][0] = true;
		smallLShapeThree [1][0] = true;
		smallLShapeThree [0][1] = true;
		piecesList.add(index, new Piece(smallLShapeThree, 2, 2, 3));
		
		index++;
		boolean[][] smallLShapeFour = new boolean[2][2];
		smallLShapeFour [0][0] = true;
		smallLShapeFour [0][1] = true;
		smallLShapeFour [1][1] = true;
		piecesList.add(index, new Piece(smallLShapeFour, 2, 2, 3));

		index++;
		boolean[][] oneBlock = new boolean[1][1];
		oneBlock [0][0] = true;
		piecesList.add(index, new Piece(oneBlock, 1, 1, 1));
		
		index++;
		boolean[][] twoBlockVertical = new boolean[1][2];
		twoBlockVertical [0][0] = true;
		twoBlockVertical [0][1] = true;
		piecesList.add(index, new Piece(twoBlockVertical, 1, 2, 2));
		
		index++;
		boolean[][] twoBlockHorizontal = new boolean[2][1];
		twoBlockHorizontal [0][0] = true;
		twoBlockHorizontal [1][0] = true;
		piecesList.add(index, new Piece(twoBlockHorizontal, 2, 1, 2));
		
		index++;
		boolean[][] threeBlockVertical = new boolean[1][3];
		threeBlockVertical [0][0] = true;
		threeBlockVertical [0][1] = true;
		threeBlockVertical [0][2] = true;
		piecesList.add(index, new Piece(threeBlockVertical, 1, 3, 3));
		
		index++;
		boolean[][] threeBlockHorizontal = new boolean[3][1];
		threeBlockHorizontal [0][0] = true;
		threeBlockHorizontal [1][0] = true;
		threeBlockHorizontal [2][0] = true;
		piecesList.add(index, new Piece(threeBlockHorizontal, 3, 1, 3));
		
		return piecesList;
		
	}

}
