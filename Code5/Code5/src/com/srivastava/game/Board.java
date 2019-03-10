package com.srivastava.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.srivastava.game.utils.GameUtils;

import jaco.mp3.player.MP3Player;



public class Board extends JPanel implements GameUtils {
	Player player;
	Timer timer;
	MP3Player mp3 ;
	
	ArrayList<Spider> spiders =new ArrayList<>();
	Image homeImage = new ImageIcon(Board.class.getResource(HOME)).getImage();
	private Sprite home = new Sprite(FRAME_WIDTH-200, FLOOR-200, 200, homeImage);
	private void gameMusic() {
		 mp3 = new MP3Player(Board.class.getResource(MUSIC));
		 mp3.play();
	}
	private void drawBullets(Graphics g) {
		for(Bullet bullet : player.getBullets()) {
			if(bullet.isVisible()) {
			bullet.draw(g);
			}
		}
	}
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
				if(e.getKeyCode()==KeyEvent.VK_J) {
					player.jump();
				}
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					player.fire();
				}
				
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				player.setSpeed(9);
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.setSpeed(-9);
					}
				// TODO Auto-generated method stub
	
				
			}
		});
	}
	
	private void drawSpiders(Graphics g) {
		for(Spider spider : spiders) {
			if(spider.isVisible()) {
			spider.draw(g);
			spider.move();
			}
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
	//gameMusic();
	//setBackground(Color.YELLOW);
}
private int timeLeft = TIME_LEFT;
int mydelay =1;
private void gameOver(Graphics g, String reason) {
	g.setColor(Color.RED);
	g.setFont(new Font("Arial",Font.BOLD,40));
	g.drawString(reason, FRAME_WIDTH/2, FRAME_HEIGHT/2);
	timer.stop();
}
private boolean isCollide(Sprite player, Sprite sprite) {
	boolean collide = false;
	int xDistance = Math.abs(player.getX() - sprite.getX());
	int yDistance = Math.abs(player.getY() - sprite.getY());
	int width = Math.max(player.getW(), sprite.getW());
	int height = Math.max(player.getH(), sprite.getH());
	return xDistance<=(width-70) && yDistance<=(height-50);
}
private void drawTime(Graphics g) {
	if(mydelay==30) {
		
		
		timeLeft--;
		mydelay=0;
	}
	if(timeLeft==0) {
		gameOver(g,"Game Over Time Up");
	}
	g.setColor(Color.RED);
	g.setFont(new Font("Arial",Font.BOLD,32));
	g.drawString(String.valueOf(timeLeft), FRAME_WIDTH-70, 60);
	mydelay++;
	
}
private void drawHome(Graphics g) {
	

	g.drawImage(home.getImage(),home.getX(),home.getY(),home.getW(), home.getH(), null);
}
private void drawBackground(Graphics g) {
	ImageIcon ic = new ImageIcon(Board.class.getResource(BACKGROUND));

	g.drawImage(ic.getImage(), 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
}

private void fall(){
	for(Spider spider : spiders) {
		if(spider.fall) {
			spider.fall();
		}
	}
}
private void killSpider() {
		for(Bullet bullet : player.getBullets()) {
			for(Spider spider : spiders) {
				if(isCollide(spider, bullet)) {
					spider.fall();
					System.out.println("Spider Kill ");
					//spider.fall();
				}
			}
		}
}

@Override
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	//System.out.println("Paint....");
	drawBackground(g);
	player.draw(g);
	player.move();
	drawSpiders(g);
	drawHome(g);
	drawTime(g);
	if(isCollide(player,home)) {
		gameOver(g,"U Have Complete the First Round...");
	}
	for(Spider spider :spiders) {
		if(isCollide(player, spider)) {
			gameOver(g, "Spider Bite You Game Over");
			break;
		}
	}
	drawBullets(g);
	killSpider();
	fall();
	player.fall();
}
}
