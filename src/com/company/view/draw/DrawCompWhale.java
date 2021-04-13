package com.company.view.draw;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DrawCompWhale extends DrawComp {
	protected int count = 0;
	private Thread thread;

	public DrawCompWhale() {
		this.startX = 400;
		this.startY = 100;

		this.currentX = startX;
		this.currentY = startY;

		this.currentWidth = 100;
		this.currentHeight = 70;

	}

	// initial attributes
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("DrawCompWhale  paintComponent(Graphics g)      this.count " + this.count);
		this.count++;

		if (this.image == null) {
			try {
				this.image = ImageIO.read(new File("whale3.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("DrawCompWhale  paintComponent(Graphics g) 22222   this.currentX  " + this.currentX);
		System.out.println("DrawCompWhale  paintComponent(Graphics g) 22222   this.currentY  " + this.currentY);
		System.out.println("DrawCompWhale  paintComponent(Graphics g) 22222   this.image  " + this.image.toString());

		g.drawImage(this.image, this.currentX, this.currentY, null);
		// System.out.println("DrawCompWhale paintComponent(Graphics g)
		// this.image.toString() " + this.image.toString());
		// g.setColor(Color.PINK);
		// g.drawRect(this.currentX, this.currentY, this.currentWidth,
		// this.currentHeight);
		// g.fillRect(this.currentX, this.currentY, this.currentWidth,
		// this.currentHeight);

	}
	
	public void stepRight() {
		this.moveRight();
	}




}
