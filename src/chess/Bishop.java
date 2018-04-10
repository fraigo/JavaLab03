package chess;

/**
 * Bishop Class
 * @author franciscoigor@gmail.com
 *
 */
public class Bishop extends ChessPiece {

	/**
	 * Default constructor
	 */
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
