package com.company.view;

import java.awt.image.BufferedImage;

import com.company.view.draw.DrawCompCloud;
import com.company.view.draw.DrawCompStar;
import com.company.view.draw.DrawCompWhale;
import com.company.view.draw.DrawFactory;

public class View {

    private static View instance = null;
    private WhaleFrame frameWhale;
    private DrawCompWhale drawWhale;
    private DrawCompCloud drawCloud;
    private DrawCompStar drawStar;

    private View() {

    }


    public static View instance() {
        if (instance == null)
            instance = new View();
        return instance;
    }

    public void init() {
        this.drawWhale = DrawFactory.createDrawWhale();
        this.drawCloud = DrawFactory.createDrawCloud();
        this.drawStar = DrawFactory.createDrawStar();
        
        this.frameWhale = new WhaleFrame();
        this.update();
    }
    
    public void updateCloud() {
    	System.out.println("View updateCloud()    ^^^^^^^^^^^^^^^^^^^^^(((*(8(*(*       ");
    	//this.drawCloud.repaint();
    	this.frameWhale.updateCloudPanel();
    }
    
    public void updateStar() {
    	System.out.println("View updateStar()     ((((((()))))))        ");
    	this.frameWhale.updateCloudPanel();
    	//this.drawStar.repaint();
    }

    public void update() {
        System.out.println("View update() ");
        //this.startGame();
        this.frameWhale.invalidate();
        this.frameWhale.setVisible(true);
    }

    public static void main(String[] args) {
        View.instance().go();

    }

    public void go() {
        this.init();
       // this.startGame();
    }
    
    public void startGame() {
    	System.out.println("View startGame()  111 .......  ");
    	this.cloudFloatLeft();
    }
    
    public void cloudFloatLeft() {
    	this.drawCloud.floatLeftAux();
    }
    
    public void starFloatLeft() {
    	System.out.println("View    starFloatLeft()     (((((((((((((((((((((((  55555555555  ");
    	this.drawStar.floatLeftAux();
    }
    
    public void whaleStepRight() {
    	this.drawWhale.stepRight();
    }

    public BufferedImage getDrawWhaleImage() {
        return this.drawWhale.getImage();
    }

    public WhaleFrame getFrameWhale() {
        return frameWhale;
    }

    public void setFrameWhale(WhaleFrame frameWhale) {
        this.frameWhale = frameWhale;
    }

    public DrawCompWhale getDrawWhale() {
        return drawWhale;
    }

    public void setDrawWhale(DrawCompWhale drawWhale) {
        this.drawWhale = drawWhale;
    }

    public DrawCompCloud getDrawCloud() {
        return drawCloud;
    }

    public DrawCompStar getDrawStar() {
    	System.out.println("View  getDrawStar()    99 22 23  .... 111  this.drawStar   " + this.drawStar.toString());
		return drawStar;
	}


	public void setDrawStar(DrawCompStar drawStar) {
		this.drawStar = drawStar;
	}


	public void setDrawCloud(DrawCompCloud drawCloud) {
        this.drawCloud = drawCloud;
    }


}
