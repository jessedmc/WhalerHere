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
 * The cloud character of the game. This class controls repainting of the cloud and
 * timing for animations.
 */
public class ViewCloud extends ViewCharacter implements ActionListener {
	/**
	 * Counts the calls of the paintComponent(Graphics g) method.
	 */
	protected int count = 0;
	/**
	 * Timer for timing animations.
	 */
	private Timer timer;

	/**
	 * Constructor for cloud character
	 */
	public ViewCloud() {
		this.currentX = Layout.instance().CLOUD_START_WINDOW_X_POS;
		this.currentY = Layout.instance().CLOUD_START_WINDOW_Y_POS;
		this.currentWidth = Layout.instance().CLOUD_WIDTH;
		this.currentHeight = Layout.instance().CLOUD_HEIGHT;
		this.incX = Layout.instance().cloudIncX;
		this.incY = Layout.instance().cloudIncY;
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
				this.image = ImageIO.read(new File("cloud.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		g.drawImage(this.image, this.currentX, this.currentY, null);

		// check for collision (hit)
		if (Controller.instance().getModelGameMode().equals("play") || Controller.instance().getModelGameMode().equals("continue")) {
			boolean whaleCloudHit = this.isWhaleCloudHit();
			if (!Controller.instance().isWhaleInvincible()) {
				if (whaleCloudHit) {
					Handler.instance().handleEvent(Handler.instance().WHALE_HIT_CLOUD); // good
				}
			}
		}

		// check for screen wrapping
		if (this.currentX < (-1 * this.currentWidth)) {
			this.currentX = Layout.instance().FRAME_WIDTH;
			Controller.instance().setWhaleInvincible(false);
			SoundPlay.instance().playWhaleSoundOne();
		}
	}

	/**
	 * Checks to see if the whale hit a cloud.
	 * @return boolean, True is whale hit cloud, False is no hit.
	 */
	public boolean isWhaleCloudHit() {
		int whaleX = View.instance().getDrawWhale().getCurrentX();
		int whaleY = View.instance().getDrawWhale().getCurrentY();
		int whaleWidth = View.instance().getDrawWhale().getCurrentWidth();
		int whaleHeight = View.instance().getDrawWhale().getCurrentHeight();
		int cloudX = this.currentX;
		int cloudY = this.currentY;
		int cloudWidth = this.currentWidth;
		int cloudHeight = this.currentHeight;

		if ((whaleX + whaleWidth) > cloudX && whaleX < (cloudX + cloudWidth)) { // hit on x axis
			if (whaleY < cloudY && (whaleY + whaleHeight) > cloudY) { // hit on y axis
				return true;
			}
		}

		return false;
	}

	/**
	 * Animation for cloud floating left.
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
	 * A motion is performed on the cloud so this triggers a View update.
	 * @param e Swing ActionEvent object
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		moveLeft();
		View.instance().updateRootPanel();
		timer.restart();
	}
}
