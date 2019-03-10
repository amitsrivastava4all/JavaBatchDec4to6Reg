package com.srivastava.game;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Sprite{
	
	public Bullet(int x, int y) {
		this.x = x;
		this.y = y;
		this.w = this.h = 20;
		this.isVisible = true;
		this.speed = 25;
	}
	public void outOfFrame(){
		if(x>=FRAME_WIDTH) {
			isVisible = false;
		}
	}
	public void move() {
		this.x += this.speed;
		outOfFrame();
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(x,y,w,h);
		move();
	}
}
