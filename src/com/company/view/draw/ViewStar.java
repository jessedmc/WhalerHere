package com.company.view.draw;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Timer;

import com.company.controller.Controller;
import com.company.extra.Layout;
import com.company.handler.Handler;
import com.company.view.SoundPlay;
import com.company.view.View;


/**
 * The star character of the game. This class controls repainting of the star and
 * timing for animations.
 */
public class ViewStar extends ViewCharacter implements ActionListener {
	protected int count = 0;
	private Thread thread;
	private	Timer timer;


	public ViewStar() {
		this.currentX = Layout.instance().STAR_START_WINDOW_X_POS;
		this.currentY = Layout.instance().STAR_START_WINDOW_Y_POS;
		this.currentWidth = Layout.instance().STAR_WIDTH;
		this.currentHeight = Layout.instance().STAR_HEIGHT;
		this.incX = Layout.instance().starIncX;
		this.incY = Layout.instance().starIncY;
	}

	// initial attributes
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("ViewStar  paintComponent(Graphics g)      this.count " + this.count);
		this.count++;

		if (this.image == null) {
			try {
				this.image = ImageIO.read(new File("star_trans.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("ViewStar  paintComponent(Graphics g) @@@@@@@@   this.currentX  " + this.currentX);
		System.out.println("ViewStar  paintComponent(Graphics g) @@@@@@@@   this.currentY  " + this.currentY);
		System.out.println("ViewStar  paintComponent(Graphics g) @@@@@@@@   this.image  " + this.image.toString());

		g.drawImage(this.image, this.currentX, this.currentY, null);

		// check for collision (hit)
		if (Controller.instance().getModelGameMode().equals("play") || Controller.instance().getModelGameMode().equals("continue")) {
			boolean whaleStarHit = this.isWhaleStarHit();
			System.out.println("ViewStar  paintComponent(Graphics g)    whaleStarHit  " + whaleStarHit);
			if (!Controller.instance().isWhaleInvincible()) {
				if (whaleStarHit) {
					Handler.instance().handleEvent(Handler.instance().WHALE_HIT_STAR); // good

				}
			}
		}

		// check for screen wrapping, reset whale's invincibility
		if (this.currentX < (-1 * this.currentWidth)) {
			this.currentX = Layout.instance().FRAME_WIDTH;

		}
	}

	public boolean isWhaleStarHit() {
		int whaleX = View.instance().getDrawWhale().getCurrentX();
		int whaleY = View.instance().getDrawWhale().getCurrentY();
		int whaleWidth = View.instance().getDrawWhale().getCurrentWidth();
		int whaleHeight = View.instance().getDrawWhale().getCurrentHeight();
		int starX = this.currentX;
		int starY = this.currentY;
		int starWidth = this.currentWidth;
		int starHeight = this.currentHeight;
		System.out.println("ViewStar isWhaleStarHit()      000 11 000      whaleX " + whaleX);
		System.out.println("ViewStar isWhaleStarHit()      000 11 000      whaleY " + whaleY);
		System.out.println("ViewStar isWhaleStarHit()      000 11 000      whaleWidth " + whaleWidth);
		System.out.println("ViewStar isWhaleStarHit()      000 11 000      whaleHeight " + whaleHeight);
		System.out.println("ViewStar isWhaleStarHit()      000 11 000      starX " + starX);
		System.out.println("ViewStar isWhaleStarHit()      000 11 000      starY " + starY);
		System.out.println("ViewStar isWhaleStarHit()      000 11 000      starWidth " + starWidth);
		System.out.println("ViewStar isWhaleStarHit()      000 11 000      starHeight " + starHeight);


		if ((whaleX + whaleWidth) > starX && whaleX < (starX + starWidth)) { // hit on x axis
			if (whaleY < starY && (whaleY + whaleHeight) > starY) { // hit on y axis
				return true;
			}
		}

		return false;
	}


	public void floatLeft() {
		System.out.println("ViewStar floatLeft() _ --- _ --- _ -- _");
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
		System.out.println("ViewStar actionPerformed(ActionEvent e)  -- _ ---- _ ---- _ ---- _ --");
		moveLeft();
		View.instance().updateStar();
		timer.restart();
	}
}
