package com.srivastava.game;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.srivastava.game.utils.GameUtils;

public class Player extends Sprite {
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
