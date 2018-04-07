package chess;


/**
 * Knight Class
 * @author franciscoigor@gmail.com
 *
 */
public class Knight extends ChessPiece {

	public Knight() {
		super(2);
	}
	
	@Override
	public void move() {
		System.out.println("Like an L");
	}
	
	@Override
	public String toString(){
		return "Knight";
	}

}
