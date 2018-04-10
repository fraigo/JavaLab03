package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import chess.Bishop;
import chess.King;
import chess.Knight;
import chess.Pawn;
import chess.Queen;

public class PawnTest {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testToStringNew() {
		Pawn p=new Pawn();
		assertEquals(p.toString(), "Pawn [Not promoted]");
	}

	@Test
	public void testToStringPromoted() {
		Pawn p=new Pawn();
		p.promote(new Queen());
		assertEquals(p.toString(), "Pawn [Promoted to Queen]");
	}

	@Test
	public void testPromotePawn() {
		Pawn p1=new Pawn();
		Pawn promotedTo=new Pawn();
		p1.promote(promotedTo);
		assertEquals(p1.toString(), "Pawn [Not promoted]");
	}

	@Test
	public void testPromoteKing() {
		Pawn p1=new Pawn();
		King promotedTo=new King();
		p1.promote(promotedTo);
		assertEquals(p1.toString(), "Pawn [Not promoted]");
	}
	
	@Test
	public void testPromoteAlreadyPromoted() {
		Pawn p1=new Pawn();
		Knight promotedTo=new Knight();
		p1.promote(promotedTo);
		assertEquals(p1.toString(), "Pawn [Promoted to Knight]");
		Bishop promotedAlso=new Bishop();
		p1.promote(promotedAlso);
		assertEquals(p1.toString(), "Pawn [Promoted to Knight]");
	}

	@Test
	public void testEqualsNewPawn() {
		Pawn p1=new Pawn();
		Pawn p2=new Pawn();
		assertTrue(p1.equals(p2));
	}

	@Test
	public void testEqualsPromotedPawn() {
		Pawn p1=new Pawn();
		Pawn p2=new Pawn();
		p2.promote(new Queen());
		assertFalse(p1.equals(p2));
	}

	@Test
	public void testEqualsBothPromotedPawns() {
		Pawn p1=new Pawn();
		p1.promote(new Queen());
		Pawn p2=new Pawn();
		p2.promote(new Queen());
		assertTrue(p1.equals(p2));
	}

	@Test
	public void testEqualsBothPromotedPawns2() {
		Pawn p1=new Pawn();
		p1.promote(new Queen());
		Pawn p2=new Pawn();
		p2.promote(new Knight());
		assertFalse(p1.equals(p2));
	}

	@Test
	public void testEqualsQueen() {
		Pawn p1=new Pawn();
		Queen p2=new Queen();
		assertEquals(p1.equals(p2),false);
	}


	@Test
	public void testGetNewPiece() {
		Pawn p1=new Pawn();
		Queen q1=new Queen();
		p1.promote(q1);
		assertEquals(p1.getNewPiece(),q1);
	}

}
