package com.srivastava.game;

import javax.swing.JFrame;

import com.srivastava.game.utils.GameUtils;

public class GameFrame extends JFrame implements GameUtils {
	public GameFrame() {
		setTitle(TITLE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		setLocationRelativeTo(null);
		//setLocation(100, 100);
		Board board = new Board();
		this.add(board);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame frame = new GameFrame();

	}

}
