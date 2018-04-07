package chess;

public abstract class ChessPiece {
	
	private int level;

	public ChessPiece(int level){
		setLevel(level);
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
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
