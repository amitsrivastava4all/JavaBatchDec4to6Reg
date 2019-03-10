package com.srivastava.game;

import java.awt.Graphics;
import java.awt.Image;

import com.srivastava.game.utils.GameUtils;

public class Sprite implements GameUtils {
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected Image image;
	protected int speed;
	protected boolean isVisible;
	
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public Sprite() {
		
	}
	public Sprite(int x, int y, int w, Image image) {
		this.x = x;
		this.y = y;
		this.h= this.w = w;
		this.image = image;
		this.speed = 0;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void draw(Graphics g) {
		g.drawImage(image, x, y, w, h, null);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
}
