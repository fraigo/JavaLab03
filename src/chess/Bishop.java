package chess;

public class Bishop extends ChessPiece {

	public Bishop() {
		super(3);
	}
	
	@Override
	public void move() {
		System.out.println("Diagonally");
	}
	
	@Override
	public String toString(){
		return "Bishop";
	}

}
