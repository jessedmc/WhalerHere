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
    protected int count = 0;
    private Thread thread;
    private Timer timer;

    public ViewGlitter() {
        this.currentX = Layout.instance().GLITTER_START_WINDOW_X_POS;
        this.currentY = Layout.instance().GLITTER_START_WINDOW_Y_POS;
        this.currentWidth = Layout.instance().GLITTER_WIDTH;
        this.currentHeight = Layout.instance().GLITTER_HEIGHT;
        this.incX = Layout.instance().glitterIncX;
        this.incY = Layout.instance().glitterIncY;
    }

    // initial attributes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("ViewGlitter  paintComponent(Graphics g)      this.count " + this.count);
        this.count++;
        new Exception().printStackTrace();
        if (this.image == null) {
            try {
                this.image = ImageIO.read(new File("glitter_trans.png"));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("ViewGlitter  paintComponent(Graphics g) 22222   this.currentX  " + this.currentX);
        System.out.println("ViewGlitter  paintComponent(Graphics g) 22222   this.currentY  " + this.currentY);
        System.out.println("ViewGlitter  paintComponent(Graphics g) 22222   this.image  " + this.image.toString());

        g.drawImage(this.image, this.currentX, this.currentY, null);

        // check for screen wrapping
        if (this.currentX < (-1 * this.currentWidth)) {
            this.currentX = Layout.instance().FRAME_WIDTH;
        }

    }


    public void floatLeft() {
        System.out.println("DrawCompCloud floatLeftAux()");
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
        moveLeft();
        View.instance().updateRootPanel();
        timer.restart();
    }
}
