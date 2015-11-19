package OP010_OP030_OP040.Connect4;

import java.awt.event.KeyListener;

public class Connect4Controller implements KeyListener{
  private Board board;
	private Connect4View view;
	private boolean cont = false;

	public Connect4Controller(Board b, Connect4View v){
		board = b;
		view = v;
	}

	public void runGame(){
		if(board.getTurn()){
			System.out.println("Player 1's turn.\n" + board.toString());
			while(!cont){	
			}
		}
		else{
			System.out.println("Player 2's turn.\n" + board.toString());
			while(!cont){	
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			board.move(board.turn, 1);
			System.out.println(board.toString());
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			board.move(board.turn, -1);
			System.out.println(board.toString());
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			board.dropChip();
			cont = true;
		}
	}

	public void keyPressed(KeyEvent e) {
	}

	
	public void keyReleased(KeyEvent e) {
	}
}
