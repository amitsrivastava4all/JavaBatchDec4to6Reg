package com.srivastava.game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Spider extends Sprite{
	public void move() {
		y+=speed;
		changeDirection();
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
		image = new ImageIcon(Spider.class.getResource(imageName)).getImage();
	}

}
