package chess;

/**
 * Queen Class
 * @author franciscoigor@gmail.com
 *
 */
public class Queen extends ChessPiece {

	/**
	 * Default constructor
	 */
	public Queen() {
		super(9);
	}
	
	@Override
	public void move() {
		System.out.println("like a bishop or a rook");
	}
	
	@Override
	public String toString(){
		return "Queen";
	}

}
