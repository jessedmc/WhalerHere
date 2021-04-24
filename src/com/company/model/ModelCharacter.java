package com.company.model;

import java.awt.image.BufferedImage;

/**
 * Parent class for the characters of the game.
 */
public class ModelCharacter {

    /**
     * The character's current x position on screen.
     */
    protected int currentX = -1;
    /**
     * The character's current y position on screen.
     */
    protected int currentY = -1;
    /**
     * The character's current width on screen.
     */
    protected int currentWidth = -1;
    /**
     * The character's current height on screen.
     */
    protected int currentHeight = -1;
    /**
     * The character's current x increment for movement.
     */
    protected int incX = 20;
    /**
     * The character's current y increment for movement.
     */
    protected int incY = 20;

    /**
     * A description identifying the character.
     */
    protected String descriptor = "a component";

    /**
     * Constructor for character in the model portion of the program.
     * @param descriptor A description identifying the character.
     */
    public ModelCharacter(String descriptor) {
        this.descriptor = descriptor;
    }

    /**
     * Gives string representation of the character.
     * @return String representation of the character.
     */
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


    /**
     * Retrieve the current x position of the character.
     * @return The current x position of the character.
     */
    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }
    /**
     * Retrieve the current y position of the character.
     * @return The current y position of the character.
     */
    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }
    /**
     * Retrieve the current width of the character.
     * @return The current width of the character.
     */
    public int getCurrentWidth() {
        return currentWidth;
    }

    public void setCurrentWidth(int currentWidth) {
        this.currentWidth = currentWidth;
    }
    /**
     * Retrieve the current height of the character.
     * @return The current height of the character.
     */
    public int getCurrentHeight() {
        return currentHeight;
    }

    /**
     * Set the current height of the whale.
     * @param currentHeight, The current height of the whale.
     */
    public void setCurrentHeight(int currentHeight) {
        this.currentHeight = currentHeight;
    }

    /**
     * Set the increment x of the whale.
     * @param incX, The increment x of the whale.
     */
    public void setIncX(int incX) {
        this.incX = incX;
    }

    /**
     * Set the increment y of the whale.
     * @param incY, The increment y of the whale.
     */
    public void setIncY(int incY) {
        this.incY = incY;
    }


}
