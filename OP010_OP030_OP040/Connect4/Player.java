package deezNuts;


public class Player {
	
	private int number;
	private int score;
	private int gamesWon;
	
	/**
	* Summary fragment: Constructor
	* This is the default constructor that sets all of the instance variables to 0.
	
	*
	* @author Noah Chopra-Khan
	*/
	public Player(){
		number = 0;
		score = 0;
		gamesWon = 0;
	}
	
	/**
	* Summary fragment: Constructor
	* This is constructor that passes an integer to set the player number.
	*
	* @author Noah Chopra-Khan
	*/
	public Player(int a){
		number = a;
	}
	
	/**
	* Summary fragment: getter of number
	* This method returns an integer representing the number.
	*
	*@return int
	* @author Noah Chopra-Khan
	*/
	public int getPlayerNumber(){
		return number;
	}
	
	/**
	* Summary fragment: Sets the number
	* This method sets the players number.
	*
	*@param a int
	*@return void
	* @author Noah Chopra-Khan
	*/
	public void setPlayerNumber(int a){
		number = a;
	}
	
	/**
	* Summary fragment: getter of score
	* This method returns an integer representing the score.
	*
	*@return int
	* @author Noah Chopra-Khan
	*/
	public int getScore(){
		return score;
	}
	
	/**
	* Summary fragment: Sets the Score
	* This method sets the Score.
	*
	*@param a int
	*@return void
	* @author Noah Chopra-Khan
	*/
	public void setScore(int a){
		score = a;
	}
	
	/**
	* Summary fragment: Sets gamesWon
	* This method sets the number of games won.
	*
	*@param a int
	*@return void
	* @author Noah Chopra-Khan
	*/
	public void setGamesWon(int a){
		gamesWon = a;
	}
	
	/**
	* Summary fragment: getter of gamesWon
	* This method returns an integer representing the number of games the player has won.
	*
	*@return int
	* @author Noah Chopra-Khan
	*/
	public int getGamesWon(){
		return gamesWon;
	}
	
	/**
	* Summary fragment: overrides toString method
	* This is method reutrns a string representing the player.
	* The String contains the Player's number, score, and games won.
	*
	*@return String
	*@author Noah Chopra-Khan
	*/
	public String toString(){
		String theString = "";
		theString = "Player number:  "+number+", Player score: "+score+", Games Won: "+gamesWon;
		return theString;
	}
	

}
