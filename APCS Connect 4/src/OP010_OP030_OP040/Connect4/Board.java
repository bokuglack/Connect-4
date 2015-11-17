package OP010_OP030_OP040.Connect4;
public class Board {
	private int gamesize;
	private Chip[][] board;
	private Player player1;
	private Player player2;
	private Object score;
	
	public Board(int gs, Player p1, Player p2){
		gamesize = gs;
		player1 = p1;
		player2 = p2;
		board = new Chip[gs][gs];
		for(int i = 0; i < board.length; i++){
			for(int e = 0; e < board[i].length; e++){
				board[i][e] = new Chip();
			}
		}
	}
	
	public Board(int gs){
		this(gs, new Player(), new Player());
	}
	
	public Board(){
		this(0, new Player(), new Player());
	}
	
	
	
	public void reset(){
		board = new Chip[this.gamesize][this.gamesize];
		for(int i = 0; i < board.length; i++){
			for(int e = 0; e < board[i].length; e++){
				board[i][e] = new Chip();
			}
		}
	}
	
	public int countEmptySpaces(){
		int numEmpty = 0;
		for(int i = 0; i < board.length; i++){
			for(int e = 0; e < board[i].length; e++){
				if(board[i][e].getPlayerChip() == 0){
					numEmpty++;
				}
			}
		}
		return numEmpty;
	}
	
	public String getScore(){
		return player1.getGamesWon() + " : " + player2.getGamesWon();
	}
	
	public boolean isFull(){
		if(this.countEmptySpaces() == 0){
			return true;
		}
		return false;
	}
	
	public String toString(){
		String s = this.getScore() + "\n";
		for(int i = 0; i < board.length; i++){
			s = s + "\n";
			for(int e = 0; e<board[i].length; e++){
				s = s + board[i][e].toString() + "\t";
			}
		}
		return s;
	}
	
	public Board copyBoard(){
		Board copy = new Board(this.gamesize);
		copy.score = this.score;
		for(int i = 0; i < board.length; i++){
			for(int e=0; e < board[i].length; e++){
				copy.board[i][e] = this.board[i][e];
			}
		}

		return copy;
	}
	
	public void move(boolean p, int dir){
		if(p){
			player1.setPosition((player1.getPostion() + dir)%gamesize);
		}else{
			player2.setPosition((player2.getPostion() + dir)%gamesize);
		}
	}
	
	public void dropChip(int column, int row, int p){
		board[column][row].setPlayerChip(p);
	}
}
