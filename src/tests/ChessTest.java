package tests;

import chess.Bishop;
import chess.ChessPiece;
import chess.King;
import chess.Knight;
import chess.Pawn;
import chess.Queen;
import chess.Rook;


public class ChessTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testPiece(new Pawn(),new Pawn());
		testPiece(new Knight(),new Knight());
		testPiece(new Bishop(),new Bishop());
		testPiece(new Rook(),new Rook());
		testPiece(new Queen(),new Queen());
		testPiece(new King(),new King());
				
	}
	
	private static void testPiece(ChessPiece p, ChessPiece compareTo){
		
		
		System.out.println("========== TEST ==========");
		System.out.println("*** Testing toString() ***");
		System.out.println(p.toString());

		System.out.println("*** Testing getLevel() ***");
		System.out.println(p.getLevel());

		System.out.println("*** Testing move() ***");
		p.move();
		
		System.out.println("*** Testing equals() to another same Piece ("+compareTo.toString()+") ***");
		System.out.println(p.equals(compareTo));

		Pawn newPawn=new Pawn();
		System.out.println("*** Testing equals() to new Pawn() ***");
		System.out.println(p.equals(newPawn));
		
		Pawn promotedPawn=new Pawn();
		promotedPawn.promote(new Queen());
		System.out.println("*** Testing equals() to promoted Pawn() ***");
		System.out.println(p.equals(promotedPawn));

		System.out.println("*** Trying to promote a Pawn to this piece ("+p.toString()+") ***");
		newPawn.promote(p);
		System.out.println(newPawn);
		
		System.out.println("*** Trying to promote a previously promoted Pawn to this piece ***");
		promotedPawn.promote(p);
		System.out.println(promotedPawn);
	}
	
	

}
