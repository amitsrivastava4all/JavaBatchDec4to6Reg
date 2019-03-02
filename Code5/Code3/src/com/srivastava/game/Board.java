package com.srivastava.game;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.srivastava.game.utils.GameUtils;



public class Board extends JPanel implements GameUtils {
	Player player;
	Timer timer;
	ArrayList<Spider> spiders =new ArrayList<>();
	
	private void bindEvents() {
		this.addKeyListener(new KeyAdapter() {
			
		
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				player.setSpeed(0);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Key Press "+e.getKeyCode()+" "+e.getKeyChar());
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				player.setSpeed(6);
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.setSpeed(-6);
					}
				// TODO Auto-generated method stub
	
				
			}
		});
	}
	
	private void drawSpiders(Graphics g) {
		for(Spider spider : spiders) {
			spider.draw(g);
			spider.move();
		}
	}
	private void loadSpiders() {
		int x = 300;
		int speed = 2;
		String imageName = "";
		for(int i = 1; i<=MAX_SPIDERS; i++) {
			if(i==1) {
				imageName =SPIDER1;
			}
			else
			if(i==2) {	
				imageName = SPIDER2;
			}
			else {
				imageName = SPIDER3;
			}
			Spider spider = new Spider(x,40, imageName,speed);
			spiders.add(spider);
			speed +=2;
			x+=SPIDER_WIDTH + SPIDER_GAP;
		}
	}
	private void gameLoop(){
		/*ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		};
		timer = new Timer(DELAY,l);*/
//		timer = new Timer(DELAY,new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		timer = new Timer(DELAY,(e)-> {
			repaint();
		});
		timer.start();
	}
	
public Board() {
	setSize(FRAME_WIDTH, FRAME_HEIGHT);
	player = new Player(100,200);
	loadSpiders();
	setFocusable(true);
	bindEvents();
	gameLoop();
	//setBackground(Color.YELLOW);
}
private void drawBackground(Graphics g) {
	ImageIcon ic = new ImageIcon(Board.class.getResource(BACKGROUND));

	g.drawImage(ic.getImage(), 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
}
@Override
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	//System.out.println("Paint....");
	drawBackground(g);
	player.draw(g);
	player.move();
	drawSpiders(g);
}
}
