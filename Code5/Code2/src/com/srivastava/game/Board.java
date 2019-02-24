package com.srivastava.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.srivastava.game.utils.GameUtils;



public class Board extends JPanel implements GameUtils {
public Board() {
	setSize(FRAME_WIDTH, FRAME_HEIGHT);
	
	//setBackground(Color.YELLOW);
}
private void drawBackground(Graphics g) {
	ImageIcon ic = new ImageIcon(Board.class.getResource(BACKGROUND));

	g.drawImage(ic.getImage(), 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
}
@Override
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	drawBackground(g);
}
}
