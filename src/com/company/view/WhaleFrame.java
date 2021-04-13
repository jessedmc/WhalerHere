package com.company.view;



import com.company.handler.Handler;
import com.company.view.draw.DrawComp;
import com.company.view.draw.DrawCompCloud;
import com.company.view.draw.DrawCompWhale;
import com.company.view.draw.DrawFactory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class WhaleFrame extends JFrame implements KeyListener {

    private JPanel panelWhale;
    private JPanel panelCloud;
    private RootPanel panelRoot;

    private FlowLayout flowWhale;
    private FlowLayout flowCloud;


    private int width = 1100;
    private int height = 800;



    public WhaleFrame(){
       /// this.drawWhale = DrawFactory.createDrawWhale();
      //  this.drawWhale.invalidate();
        //this.drawCloud = DrawFactory.createDrawCloud();


       // this.panelWhale = new JPanel();
       // this.panelCloud = new JPanel();
        this.panelRoot = new RootPanel();



        this.addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);

        this.setTitle("Its a whale");
        this.setResizable(false);
        this.setSize(width, height);
        this.setMinimumSize(new Dimension(width, height));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // this.panelWhale.add(this.drawWhale);
       // this.panelCloud.add(this.drawCloud);
    //   this.panelRoot.add(this.panelWhale);
       // this.panelRoot.add(this.panelCloud);


     //   this.setContentPane(this.panelRoot);


        //this.add(this.drawWhale);
        this.setContentPane(this.panelRoot);
       // this.panelRoot.add(View.instance().getDrawWhale());
        this.panelRoot.add(View.instance().getDrawCloud());
        this.panelRoot.add(View.instance().getDrawWhale());
        System.out.println("WhaleFrame 8888 88 99 99 33    this.panelRoot  " + this.panelRoot.getComponentCount());
        
       // this.getContentPane().setBackground(Color.PINK);
        //this.getContentPane().add(this.a);
        //this.getContentPane().add(this.drawCloud);

        //this.pack();
        this.setVisible(true);
        //this.drawWhale.moveLeft();

        //this.drawCloud.floatLeft();
    }
/*
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mainFrame frame = new mainFrame();

            }
        });
    }
    */

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

    public void addDrawComp(DrawComp drawComp) {
        //this.panelRoot.add(drawComp);
    }
    
    public void updateCloudPanel() {
    	System.out.println("WhaleFrame   updateCloudPanel()  ______^^^^^^^^");
    	this.panelRoot.repaint();
    	
    }
    
    public void updateStarPanel() {
    	System.out.println("WhaleFrame   updateStarPanel()   ############******** ");
    	this.panelRoot.repaint();
    	
    }
}

