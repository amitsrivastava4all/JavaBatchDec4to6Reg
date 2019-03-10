package com.srivastava.game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Spider extends Sprite{
	int force = GRAVITY;
	boolean fall = false;
	public void move() {
		if(!fall ) {
		y+=speed;
		changeDirection();
		}
	}
	public void fall() {
		speed = 0;
		fall = true;
		if(y<=(FRAME_HEIGHT+200)) {
			y+=force;
			force+=GRAVITY + 2;
		}
		if(y>(FRAME_HEIGHT+200)) {
			isVisible = false;
		}
	}
	public void changeDirection() {
		if((y+h)>=FRAME_HEIGHT) {
			speed = speed * -1;
		}
		else
		if(y<=40) {	
			speed  = speed * -1 ;
		}
	}
	public Spider(int x, int y, String imageName, int speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.h = this.w = SPIDER_WIDTH;
		this.isVisible = true;
		image = new ImageIcon(Spider.class.getResource(imageName)).getImage();
	}

}
