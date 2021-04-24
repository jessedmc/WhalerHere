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
	/**
	 * Counts the calls of the paintComponent(Graphics g) method.
	 */
	protected int count = 0;
	/**
	 * Timer for animation.
	 */
	private	Timer timer;
	/**
	 * Constructor for star character
	 */
	public ViewStar() {
		this.currentX = Layout.instance().STAR_START_WINDOW_X_POS;
		this.currentY = Layout.instance().STAR_START_WINDOW_Y_POS;
		this.currentWidth = Layout.instance().STAR_WIDTH;
		this.currentHeight = Layout.instance().STAR_HEIGHT;
		this.incX = Layout.instance().starIncX;
		this.incY = Layout.instance().starIncY;
	}

	/**
	 * Swing drawing method. Draws to screen.
	 * @param g The component controlling the drawing.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.count++;
		if (this.image == null) {
			try {
				this.image = ImageIO.read(new File("star_trans.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		g.drawImage(this.image, this.currentX, this.currentY, null);

		// check for collision (hit)
		if (Controller.instance().getModelGameMode().equals("play") || Controller.instance().getModelGameMode().equals("continue")) {
			boolean whaleStarHit = this.isWhaleStarHit();
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
	/**
	 * Checks to see if the whale hit a star.
	 * @return boolean, True is whale hit star, False is no hit.
	 */
	public boolean isWhaleStarHit() {
		int whaleX = View.instance().getDrawWhale().getCurrentX();
		int whaleY = View.instance().getDrawWhale().getCurrentY();
		int whaleWidth = View.instance().getDrawWhale().getCurrentWidth();
		int whaleHeight = View.instance().getDrawWhale().getCurrentHeight();
		int starX = this.currentX;
		int starY = this.currentY;
		int starWidth = this.currentWidth;
		int starHeight = this.currentHeight;

		if ((whaleX + whaleWidth) > starX && whaleX < (starX + starWidth)) { // hit on x axis
			if (whaleY < starY && (whaleY + whaleHeight) > starY) { // hit on y axis
				return true;
			}
		}

		return false;
	}

	/**
	 * Animation for star floating left.
	 */
	public void floatLeft() {
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
	/**
	 * A motion is performed on the star so this triggers a View update.
	 * @param e Swing ActionEvent object
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		moveLeft();
		View.instance().updateStar();
		timer.restart();
	}
}
