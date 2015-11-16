package OP010_OP030_OP040.Connect4;

public class Connect4View implements KeyListener{
  private Board currentBoard;
  
  public Connect4View(Board b){
    currentBoard = b;
  }
  
  public void setBoard(Board b){
    currentBoard = b;
  }
  
  public void updateDisplay(){
    System.out.println(currentBoard.toString());
  }
}
