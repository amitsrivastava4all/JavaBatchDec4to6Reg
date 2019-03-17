package com.srivastava.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Player extends Sprite implements IPlayer {
	private int force ;
	private boolean isJumped ;
	private int mode;
	private ArrayList<Bullet> bullets = new ArrayList<>();
	
	
	
	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public void fire() {
		Bullet  bullet = new Bullet((this.getX()+this.getW()/2), (this.getY()+ this.getH()/2));
		bullets.add(bullet);
	}
	
	private int walkIndex = 0;
	private void drawWalk(Graphics g) {
		g.drawImage(walkImages[walkIndex], x, y , w, h , null);
		walkIndex++;
		if(walkIndex>4) {
			walkIndex = 0;
		}
	}
	
	private int punchIndex = 0;
	private void drawPunch(Graphics g) {
		g.drawImage(punchImages[punchIndex], x, y , w, h , null);
		punchIndex++;
		if(punchIndex>2) {
			punchIndex = 0;
			mode = WALK;
		}
	}
	
	@Override
	public void draw(Graphics g) {
		if(mode==WALK) {
			drawWalk(g);
		}
		else
			if(mode==PUNCH) {
				drawPunch(g);
			}
	}
	
	BufferedImage img ;
	private void loadPlayerSprite() {
		try {
			img = ImageIO.read(Player.class.getResource((PLAYER_IMG)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	BufferedImage walkImages [] = new BufferedImage[5];
	public void loadWalk() {
		walkImages[0]= img.getSubimage(8, 116, 30, 73);
		walkImages[1]= img.getSubimage(72, 111, 37, 78);
		walkImages[2]= img.getSubimage(136, 110, 37, 79);
		walkImages[3]= img.getSubimage(204, 111, 32, 78);
		walkImages[4]= img.getSubimage(268, 110, 31, 79);
	}
	
	BufferedImage punchImages [] = new BufferedImage[3];
	public void loadPunch() {
		punchImages[0]= img.getSubimage(4, 207, 37, 79);
		punchImages[1]= img.getSubimage(62, 207, 53, 79);
		punchImages[2]= img.getSubimage(141, 207, 37, 79);
		
	}
	
	
	
	public void jump() {
		if(!isJumped) {
		force = -20;
		y+=force;
		isJumped = true;
		}
		
	}
	public void fall() {
		if(y<(FLOOR-this.h)) {
		force+=GRAVITY;
		y+=force;
		}
		if(y>=(FLOOR - this.h)) {
			y = FLOOR - this.h;
			isJumped = false;
		}
	}
	public ArrayList<Bullet> getBullets() {
		return bullets;
	}

	public void setBullets(ArrayList<Bullet> bullets) {
		this.bullets = bullets;
	}

	public void move() {
		x+=speed;
	}
	Player(int x, int y  ){
		mode = WALK;
		loadPlayerSprite();
		loadWalk();
		loadPunch();
		this.x = x;
		this.w = this.h= 200;
		this.y = FLOOR - this.h;
		this.speed = 0;
		image = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	
		

}
