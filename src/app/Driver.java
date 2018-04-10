package app;

import chess.Bishop;
import chess.ChessPiece;
import chess.King;
import chess.Knight;
import chess.Pawn;
import chess.Queen;
import chess.Rook;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//tests each piece with the same test steps
		testPiece(new Pawn(),new Pawn());
		testPiece(new Knight(),new Knight());
		testPiece(new Bishop(),new Bishop());
		testPiece(new Rook(),new Rook());
		testPiece(new Queen(),new Queen());
		testPiece(new King(),new King());
				
	}
	/**
	 * To make several tests for a single ChessPiece
	 * @param piece
	 * @param compareTo
	 */
	private static void testPiece(ChessPiece piece, ChessPiece compareTo){
		
		
		System.out.println("========== TEST ==========");
		System.out.println("*** Testing toString() ***");
		System.out.println(piece.toString());

		System.out.println("*** Testing getLevel() ***");
		System.out.println(piece.getLevel());

		System.out.println("*** Testing move() ***");
		piece.move();
		
		System.out.println("*** Testing equals() to another same Piece ("+compareTo.toString()+") ***");
		System.out.println(piece.equals(compareTo));

		Pawn newPawn=new Pawn();
		System.out.println("*** Testing equals() to new Pawn() ***");
		System.out.println(piece.equals(newPawn));
		
		Pawn promotedPawn=new Pawn();
		promotedPawn.promote(new Queen());
		System.out.println("*** Testing equals() to promoted Pawn() ***");
		System.out.println(piece.equals(promotedPawn));

		System.out.println("*** Trying to promote a Pawn to this piece ("+piece.toString()+") ***");
		newPawn.promote(piece);
		System.out.println(newPawn);
		
		System.out.println("*** Trying to promote a previously promoted Pawn to this piece ***");
		promotedPawn.promote(piece);
		System.out.println(promotedPawn);
	}
	
	

}
