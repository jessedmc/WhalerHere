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
	/**
	 * Counts the calls of the paintComponent(Graphics g) method.
	 */
	protected int count = 0;

	/**
	 * Constructor for cloud character
	 */
	public ViewWhale() {
		this.currentX = Layout.instance().WHALE_START_WINDOW_X_POS;
		this.currentY = Layout.instance().WHALE_START_WINDOW_Y_POS;
		this.currentWidth = Layout.instance().WHALE_WIDTH;
		this.currentHeight = Layout.instance().WHALE_HEIGHT;
		this.incX = Layout.instance().whaleIncX;
		this.incY = Layout.instance().whaleIncY;
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
				this.image = ImageIO.read(new File("whale3.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		g.drawImage(this.image, this.currentX, this.currentY, null);
	}

	/**
	 * Whale moves right.
	 */
	public void stepRight() {
		this.moveRight();
	}
	/**
	 * Whale moves left.
	 */
	public void stepLeft() {
		this.moveLeft();
	}
	/**
	 * Whale moves up.
	 */
	public void stepUp() {
		this.moveUp();
	}
	/**
	 * Whale moves down.
	 */
	public void stepDown() {
		this.moveDown();
	}



}
