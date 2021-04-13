package com.company.view.draw;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class DrawComp extends JPanel {
    public int startX = 50;
    public int startY = 50;

    public int currentX = startX;
    public int currentY = startY;

    public int currentWidth = 100;
    public int currentHeight = 70;

    public int incX = 20;
    public int incY = 20;

    protected BufferedImage image = null;

    public String descriptor = "a component";



    // initial attributes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("DrawComp   paintComponent(Graphics g)   ");  
        //g.setColor(Color.PINK);
        // g.drawRect(currentX, currentY, currentWidth, currentHeight);
        // g.fillRect(currentX, currentY, currentWidth, currentHeight);

    }

    public void moveRight() {
        this.currentX = this.currentX + this.incX;
        repaint(); // calls update()
    }

    public void moveLeft() {
        this.currentX = this.currentX - this.incX;
        System.out.println("DrawComp  moveLeft() this.currentX  " + this.currentX);
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

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
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
