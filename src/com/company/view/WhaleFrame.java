package com.company.view;



import com.company.handler.Handler;
import com.company.view.draw.ViewCharacter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

/**
 * This class is the main window for the game.
 */
public class WhaleFrame extends JFrame implements KeyListener {
    // panels
    /**
     * The main panel for the window.
     */
    private RootPanel panelRoot;
    /**
     * This panel contains all the info displayed during the game.
     */
    private JPanel panelInfo;

    /**
     * Subcontainer of panelInfo
     */
    // layouts
    private FlowLayout layoutInfo;

    // controls
    /**
     * Start game button.
     */
    private JButton buttonStartGame;
    /**
     * Displays the score.
     */
    private JLabel labelScore;
    /**
     * Displays the health.
     */
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

        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * Standard Swing keypress listener. Listens for directional arrow presses for motion of whale.
     * @param e KeyEvent of KeyPress.
     */
    @Override
    public void keyPressed(KeyEvent e) {
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

    /**
     * Main panel updating for window.
     */
    public void updateRootPanel() {
    	this.panelRoot.repaint();
    }

    /**
     * Retrieve the root panel of window.
     * @return The root panel of window.
     */
    public RootPanel getPanelRoot() {
        return panelRoot;
    }
    /**
     * Retrieve the button for starting the game in window.
     * @return The button for starting the game in window.
     */
    public JButton getButtonStartGame() {
        return buttonStartGame;
    }
    /**
     * Retrieve the label for displaying the score.
     * @return The label for displaying the score.
     */
    public JLabel getLabelScore() {
        return labelScore;
    }
    /**
     * Retrieve the label for displaying the health.
     * @return The label for displaying the health.
     */
    public JLabel getLabelHealth() {
        return labelHealth;
    }
}

