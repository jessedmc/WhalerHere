package com.company.model;

import java.awt.image.BufferedImage;

/**
 * Parent class for the characters of the game.
 */
public class ModelCharacter {


    protected int currentX = -1;
    protected int currentY = -1;

    protected int currentWidth = -1;
    protected int currentHeight = -1;

    protected int incX = 20;
    protected int incY = 20;


    protected String descriptor = "a component";

    public ModelCharacter(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public String toString() {
        return "ModelCharacter{" +

                ", currentX=" + currentX +
                ", currentY=" + currentY +
                ", currentWidth=" + currentWidth +
                ", currentHeight=" + currentHeight +
                ", incX=" + incX +
                ", incY=" + incY +
                ", descriptor='" + descriptor + '\'' +
                '}';
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

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }
}
