package com.srivastava.game;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.srivastava.game.utils.GameUtils;

public class Player extends Sprite {
	private int force ;
	private boolean isJumped ;
	private ArrayList<Bullet> bullets = new ArrayList<>();
	public void fire() {
		Bullet  bullet = new Bullet((this.getX()+this.getW()/2), (this.getY()+ this.getH()/2));
		bullets.add(bullet);
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
		this.x = x;
		this.w = this.h= 200;
		this.y = FLOOR - this.h;
		this.speed = 0;
		image = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	
		

}
