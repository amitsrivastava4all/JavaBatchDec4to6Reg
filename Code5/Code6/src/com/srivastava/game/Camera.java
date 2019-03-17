package com.srivastava.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.srivastava.game.utils.GameUtils;

public class Camera extends Sprite implements GameUtils {
	
	private BufferedImage img;
	public Camera() {
		loadImage();
		this.x = 0;
		this.y = 0;
	 this.h = FRAME_HEIGHT;
	 this.w = FRAME_WIDTH;
	}
	
	public void move(int speed) {
		x+=speed;
	}
	
	public void drawBG(Graphics g) {
		BufferedImage sub = img.getSubimage(x, y, w, h+270);
		g.drawImage(sub, 0, 0, w, h, null);
	}
	
	public  void loadImage() {
		try {
			 img = ImageIO.read(Camera.class.getResource(BACKGROUND));
			
			System.out.println("Image is Loaded...");
		} 
		catch(IllegalArgumentException e) {
			System.out.println("Game Background is Not Avaliable");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Game Background is Not Avaliable");
			//e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//			loadImage();
//	}

}
