package chess;


/**
 * Pawn Class
 * @author franciscoigor@gmail.com
 *
 */
public class Pawn extends ChessPiece {
	
	/**
	 * Indicator for promoted piece
	 */
	private boolean hasBeenPromoted;
	/**
	 * Reference to a promoted piece
	 */
	private ChessPiece newPiece;

	/**
	 * Default constructor
	 */
	public Pawn() {
		super(1);
		hasBeenPromoted=false;
	}
	
	@Override
	public void move() {
		System.out.println("Forward 1");
	}
	
	@Override
	public String toString(){
		return "Pawn ["+(this.hasBeenPromoted?"Promoted to "+this.newPiece.toString():"Not promoted")+"]";
	}
	
	/**
	 * Promote a pawn piece to a different piece.
	 * It cannot be another <code>Pawn</code> or a <code>King</code>
	 * @param newPiece
	 */
	public void promote(ChessPiece newPiece){
		if(this.hasBeenPromoted){
			System.out.println("This piece has been promoted yet ("+newPiece.toString()+")");
		} else if (newPiece instanceof King || newPiece instanceof Pawn){
			System.out.println("Cannot promote to this piece ("+newPiece.toString()+")");
		}else{
			this.newPiece=newPiece;
			this.hasBeenPromoted=true;
		}
	}
	
	/**
	 * Gets the promoted piece associated to the pawn
	 * @return A promoted piece, or null if it's not promoted
	 */
	public ChessPiece getNewPiece() {
		return newPiece;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pawn){
			Pawn pawn=(Pawn)obj;
			if (pawn.hasBeenPromoted && this.hasBeenPromoted && pawn.newPiece.equals(this.newPiece)){
				//both promoted pieces to the same piece
				return true;
			} else if (!pawn.hasBeenPromoted && !this.hasBeenPromoted){
				//both not promoted pieces
				return true;
			}else{
				return false;
			}
		}else{
			return super.equals(obj);
		}
	}

}
