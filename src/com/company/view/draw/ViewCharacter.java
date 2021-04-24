package com.company.view.draw;



import com.company.extra.Layout;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 * Parent class for the characters of the game. Used to store image info, positions, and
 * dimensions of the characters on the screen.
 */
public class ViewCharacter extends JPanel {
    /**
     * The character's current x position on the screen.
     */
    public int currentX = 1;
    /**
     * The character's current y position on the screen.
     */
    public int currentY = 1;
    /**
     * The character's current width on the screen.
     */
    public int currentWidth = 100;
    /**
     * The character's current height on the screen.
     */
    public int currentHeight = 70;
    /**
     * The character's current x increment for motion.
     */
    public int incX = 20;
    /**
     * The character's current y increment for motion.
     */
    public int incY = 20;
    /**
     * The container for the .png image of the character.
     */
    protected BufferedImage image = null;
    /**
     * A short description to identify the character.
     */
    public String descriptor = "a component";

    /**
     * Swing drawing method. Draws to screen.
     * @param g The component controlling the drawing.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    /**
     * Character move right.
     */
    public void moveRight() {
        this.currentX = this.currentX + this.incX;
        repaint(); // calls update() to paintComponent() in super subclasses
    }
    /**
     * Character move left.
     */
    public void moveLeft() {
        this.currentX = this.currentX - this.incX;
        repaint();
    }
    /**
     * Character move down.
     */
    public void moveDown() {
        this.currentY = this.currentY + this.incY;
        repaint();
    }
    /**
     * Character move up.
     */
    public void moveUp() {
        this.currentY = this.currentY - this.incY;
        repaint();
    }

    /**
     * Update method.
     * @param g The component controlling the drawing.
     */
    @Override
    public void update(Graphics g) {

    }


    /**
     * Retrieve the value of the character's current x position.
     * @return Value of character's current x position.
     */
    public int getCurrentX() {
        return currentX;
    }

    /**
     * Set the value of the character's current x position.
     * @param currentX Value of the character's current x position.
     */
    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    /**
     * Retrieve the value of the character's current y position.
     * @return Value of character's current y position.
     */
    public int getCurrentY() {
        return currentY;
    }

    /**
     * Set the value of the character's current y position.
     * @param currentY Value of the character's current y position.
     */
    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }
    /**
     * Retrieve the value of the character's current width.
     * @return Value of character's current width.
     */
    public int getCurrentWidth() {
        return currentWidth;
    }
    /**
     * Retrieve the value of the character's current height.
     * @return Value of character's current height.
     */
    public int getCurrentHeight() {
        return currentHeight;
    }

    /**
     * Retrieve the image of the character.
     * @return The image of the character.
     */
    public BufferedImage getImage() {
        return image;
    }
}
