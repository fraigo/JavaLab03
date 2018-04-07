package chess;

/**
 * ChessPiece abstract Class
 * @author franciscoigor@gmail.com
 *
 */
public abstract class ChessPiece {
	
	/**
	 * Level of importance
	 */
	private int level;

	/**
	 * Creates a piece with a level of importance
	 * @param level Level or importance
	 */
	public ChessPiece(int level){
		setLevel(level);
	}
	
	/**
	 * Sets the level
	 * @param level Level of importance
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * Gets the level
	 * @return Level of importance
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * Moves the piece (describe the movement with words)
	 */
	public abstract void move();
	
	@Override
	public String toString(){
		return "ChessPiece";
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof ChessPiece){
			ChessPiece piece=(ChessPiece)obj;
			return this.getLevel()==piece.getLevel();
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return super.hashCode();
	}

}
