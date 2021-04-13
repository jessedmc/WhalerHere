package com.company.view.draw;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Timer;

import com.company.view.View;

public class DrawCompStar extends DrawComp implements ActionListener {
	protected int count = 0;
	private Thread thread;

	public DrawCompStar() {
		this.startX = 300;
		this.startY = 300;

		this.currentX = startX;
		this.currentY = startY;

		this.currentWidth = 100;
		this.currentHeight = 70;

	}

	// initial attributes
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("DrawCompStar  paintComponent(Graphics g)      this.count " + this.count);
		this.count++;

		if (this.image == null) {
			try {
				this.image = ImageIO.read(new File("star.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("DrawCompStar  paintComponent(Graphics g) @@@@@@@@   this.currentX  " + this.currentX);
		System.out.println("DrawCompStar  paintComponent(Graphics g) @@@@@@@@   this.currentY  " + this.currentY);
		System.out.println("DrawCompStar  paintComponent(Graphics g) @@@@@@@@   this.image  " + this.image.toString());

		g.drawImage(this.image, this.currentX, this.currentY, null);
		// System.out.println("DrawCompWhale paintComponent(Graphics g)
		// this.image.toString() " + this.image.toString());
		// g.setColor(Color.PINK);
		// g.drawRect(this.currentX, this.currentY, this.currentWidth,
		// this.currentHeight);
		// g.fillRect(this.currentX, this.currentY, this.currentWidth,
		// this.currentHeight);

	}

	public void floatLeft() {
		for (int i = 0; i < 20; i++) {
			Thread t = new Thread() {
				public void run() {
					moveLeft();
					// View.instance().updateCloud();
					try {
						Thread.currentThread().join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.start();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	Timer timer;

	public void floatLeftAux() {
		System.out.println("DrawCompStar floatLeftAux() _ --- _ --- _ -- _");
		timer = new Timer(2000, this);
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					timer.setInitialDelay(40);
					timer.start();
				}
			}
		};
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("DrawCompStar actionPerformed(ActionEvent e)  -- _ ---- _ ---- _ ---- _ --");
		moveLeft();
		View.instance().updateStar();
		timer.restart();
	}
}
