package com.company.view.draw;

import com.company.extra.Layout;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


/**
 * The whale character of the game. This class controls repainting of the whale and
 * timing for animations.
 */
public class ViewWhale extends ViewCharacter {
	protected int count = 0;
	private Thread thread;

	public ViewWhale() {
		this.currentX = Layout.instance().WHALE_START_WINDOW_X_POS;
		this.currentY = Layout.instance().WHALE_START_WINDOW_Y_POS;
		this.currentWidth = Layout.instance().WHALE_WIDTH;
		this.currentHeight = Layout.instance().WHALE_HEIGHT;
		this.incX = Layout.instance().whaleIncX;
		this.incY = Layout.instance().whaleIncY;
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("ViewWhale  paintComponent(Graphics g)      this.count " + this.count);
		this.count++;
		new Exception().printStackTrace();
		if (this.image == null) {
			try {
				this.image = ImageIO.read(new File("whale3.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("ViewWhale  paintComponent(Graphics g) 22222   this.currentX  " + this.currentX);
		System.out.println("ViewWhale  paintComponent(Graphics g) 22222   this.currentY  " + this.currentY);
		System.out.println("ViewWhale  paintComponent(Graphics g) 22222   this.image  " + this.image.toString());

		g.drawImage(this.image, this.currentX, this.currentY, null);
	}
	
	public void stepRight() {
		this.moveRight();
	}

	public void stepLeft() {
		this.moveLeft();
	}

	public void stepUp() {
		this.moveUp();
	}

	public void stepDown() {
		this.moveDown();
	}



}
