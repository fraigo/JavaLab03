package chess;

/**
 * King Class
 * @author franciscoigor@gmail.com
 *
 */
public class King extends ChessPiece {

	public King() {
		super(1000);
	}
	
	@Override
	public void move() {
		System.out.println("One square");
	}
	
	@Override
	public String toString(){
		return "King";
	}

}
