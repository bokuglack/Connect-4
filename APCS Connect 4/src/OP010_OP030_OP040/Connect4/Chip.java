package OP010_OP030_OP040.Connect4;

public class Chip {
	
	
	private int player;
	
	/**
	* Summary fragment: Constructor
	* This is the default constructor that sets all of the instance variables to 0.
	*
	* @author Noah Chopra-Khan
	*/
	public Chip(){
		player = 0;
	}
	
	/**
	* Summary fragment: Constructor
	* This is the constructor that sets the private instance variable: player, to the integer passed.
	*
	* @author Noah Chopra-Khan
	*/
	public Chip(int a){
		player = a;
	}
	
	/**
	* Summary fragment: getter of player
	* This method returns an integer representing the player.
	*
	*@return int
	* @author Noah Chopra-Khan
	*/
	public int getPlayerChip(){
		return player;
	}
	
	/**
	* Summary fragment: Sets the player
	* This method sets the private instance variable: player.
	*
	*@param a int
	*@return void
	* @author Noah Chopra-Khan
	*/
	public void setPlayerChip(int a){
		player = a;
	}
	
	/**
	* Summary fragment: overrides toString method
	* This is method returns a string representing the chip.
	* If the player is 0, it will return null.
	* If the player is 1, it will return B.
	* If the player is 2, it will return R.
	*
	*@return String
	*@author Noah Chopra-Khan
	*/
	public String toString(){
		String theString = "";
		if(player == 0){
			theString = null;
		}else if(player == 1){
			theString = "B";
		}else if(player == 2){
			theString = "R";
		}else{
			theString = "error: player does not equal 0,1, or 2";
		}
		return theString;
	}

}
