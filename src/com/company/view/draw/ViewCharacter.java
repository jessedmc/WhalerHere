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
    public int currentX = 1;
    public int currentY = 1;
    public int currentWidth = 100;
    public int currentHeight = 70;
    public int incX = 20;
    public int incY = 20;
    protected BufferedImage image = null;
    public String descriptor = "a component";


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("ViewCharacter   paintComponent(Graphics g)   ");
        //g.setColor(Color.PINK);
        // g.drawRect(currentX, currentY, currentWidth, currentHeight);
        // g.fillRect(currentX, currentY, currentWidth, currentHeight);

    }

    public void moveRight() {
        this.currentX = this.currentX + this.incX;
        repaint(); // calls update() to paintComponent() in super subclasses
    }

    public void moveLeft() {
        this.currentX = this.currentX - this.incX;
        System.out.println("ViewCharacter  moveLeft() this.currentX  " + this.currentX);
        repaint();
    }

    public void moveDown() {
        this.currentY = this.currentY + this.incY;
        repaint();
    }

    public void moveUp() {
        this.currentY = this.currentY - this.incY;
        repaint();
    }

    @Override
    public void update(Graphics g) {

    }



    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    public int getCurrentWidth() {
        return currentWidth;
    }

    public void setCurrentWidth(int currentWidth) {
        this.currentWidth = currentWidth;
    }

    public int getCurrentHeight() {
        return currentHeight;
    }

    public void setCurrentHeight(int currentHeight) {
        this.currentHeight = currentHeight;
    }

    public int getIncX() {
        return incX;
    }

    public void setIncX(int incX) {
        this.incX = incX;
    }

    public int getIncY() {
        return incY;
    }

    public void setIncY(int incY) {
        this.incY = incY;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }
}
