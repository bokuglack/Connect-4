
public class Connect4View implements KeyListener{
  private Board currentBoard;
  
  public Connect4view(Board b){
    currentBoard = b;
  }
  
  public void setBoard(Board b){
    currentBoard = b;
  }
  
  public void updateDisplay(){
    System.out.println(currentBoard.toString());
  }
}
