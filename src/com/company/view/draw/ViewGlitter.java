package com.company.view.draw;

import com.company.extra.Layout;
import com.company.view.View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * The glitter character of the game. This class controls repainting of the glitter and
 * timing for animations.
 */
public class ViewGlitter extends ViewCharacter implements ActionListener {
    /**
     * Counts the calls of the paintComponent(Graphics g) method.
     */
    protected int count = 0;
    /**
     * Timer for animation.
     */
    private Timer timer;

    /**
     * Constructor for glitter character
     */
    public ViewGlitter() {
        this.currentX = Layout.instance().GLITTER_START_WINDOW_X_POS;
        this.currentY = Layout.instance().GLITTER_START_WINDOW_Y_POS;
        this.currentWidth = Layout.instance().GLITTER_WIDTH;
        this.currentHeight = Layout.instance().GLITTER_HEIGHT;
        this.incX = Layout.instance().glitterIncX;
        this.incY = Layout.instance().glitterIncY;
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
                this.image = ImageIO.read(new File("glitter_trans.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        g.drawImage(this.image, this.currentX, this.currentY, null);

        // check for screen wrapping
        if (this.currentX < (-1 * this.currentWidth)) {
            this.currentX = Layout.instance().FRAME_WIDTH;
        }
    }

    /**
     * Animation for glitter floating left.
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
     * A motion is performed on the glitter so this triggers a View update.
     * @param e Swing ActionEvent object
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        moveLeft();
        View.instance().updateRootPanel();
        timer.restart();
    }
}
