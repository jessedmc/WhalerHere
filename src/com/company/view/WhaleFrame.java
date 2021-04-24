package com.company.view;



import com.company.handler.Handler;
import com.company.view.draw.ViewCharacter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class WhaleFrame extends JFrame implements KeyListener {
    // panels
    private RootPanel panelRoot;
    private JPanel panelInfo;

    // layouts
    private FlowLayout layoutInfo;

    // controls
    private JButton buttonStartGame;
    private JLabel labelScore;
    private JLabel labelHealth;

    /**
     * WhaleFrame is the main window to the game.
     * @param width Width of window in pixels.
     * @param height Height of window in pixels.
     */
    public WhaleFrame(int width, int height) {

        // create panels
        this.panelRoot = new RootPanel();
        this.panelInfo = new JPanel();

        // create layouts
        this.layoutInfo = new FlowLayout();

        // create controls
        this.buttonStartGame = new JButton("Start Game");
        this.labelScore = new JLabel("-----");
        this.labelHealth = new JLabel("* * *");

        // focus to frame
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);

        // frame attributes
        this.setTitle("Nimbus");
        this.setResizable(false);
        this.setSize(width, height);
        this.setMinimumSize(new Dimension(width, height));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // containers
        // -- layouts
        this.panelInfo.setLayout(this.layoutInfo);
        this.panelInfo.add(this.labelScore);
        this.panelInfo.add(this.labelHealth);


        // -- panels
        this.setContentPane(this.panelRoot);
        this.panelRoot.add(this.panelInfo);
        this.panelRoot.add(View.instance().getDrawCloud());
        this.panelRoot.add(View.instance().getDrawWhale());
        this.panelRoot.add(View.instance().getDrawStar());
        this.panelRoot.add(View.instance().getDrawGlitter());

        // frame color, has to be after containers
        this.getContentPane().setBackground(Color.PINK);

        // action listeners
        this.addKeyListener(this);

        this.buttonStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Handler.instance().handleEvent(Handler.instance().START_GAME);
            }
        });


        System.out.println("WhaleFrame 8888 88 99 99 33    this.panelRoot  " + this.panelRoot.getComponentCount());
        this.setVisible(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("WhaleFrame keyTyped(KeyEvent e)      nnnnnnnnn ");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("WhaleFrame keyPressed(KeyEvent e)     oooooooo ");
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Handler.instance().handleEvent(Handler.instance().KEY_DOWN, Handler.instance().KEY_DOWN_RIGHT);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Handler.instance().handleEvent(Handler.instance().KEY_DOWN, Handler.instance().KEY_DOWN_LEFT);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Handler.instance().handleEvent(Handler.instance().KEY_DOWN, Handler.instance().KEY_DOWN_DOWN);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            Handler.instance().handleEvent(Handler.instance().KEY_DOWN, Handler.instance().KEY_DOWN_UP);
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
    
    public void updateRootPanel() {
    	System.out.println("WhaleFrame   updateCloudPanel()  ______^^^^^^^^");
    	new Exception().printStackTrace();
    	this.panelRoot.repaint();
    	
    }
    
    public void updateStarPanel() {
    	System.out.println("WhaleFrame   updateStarPanel()   ############******** ");
    	this.panelRoot.repaint();
    	
    }

    public RootPanel getPanelRoot() {
        return panelRoot;
    }

    public JButton getButtonStartGame() {
        return buttonStartGame;
    }

    public JLabel getLabelScore() {
        return labelScore;
    }

    public JLabel getLabelHealth() {
        return labelHealth;
    }
}

