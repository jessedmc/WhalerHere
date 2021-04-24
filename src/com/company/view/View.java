package com.company.view;

import java.awt.image.BufferedImage;

import com.company.controller.Controller;
import com.company.extra.Layout;
import com.company.view.draw.*;

public class View {

    private static View instance = null;
    private WhaleFrame frameWhale;
    private ViewWhale drawWhale;
    private ViewCloud drawCloud;
    private ViewStar drawStar;
    private ViewGlitter drawGlitter;


    private View() {

    }


    public static View instance() {
        if (instance == null)
            instance = new View();
        return instance;
    }

    public void init() {
        System.out.println("View init()      ");

        this.drawWhale = DrawFactory.createDrawWhale();
        this.drawCloud = DrawFactory.createDrawCloud();
        this.drawStar = DrawFactory.createDrawStar();
        this.drawGlitter = DrawFactory.createDrawGlitter();

        this.frameWhale = new WhaleFrame(Layout.instance().FRAME_WIDTH, Layout.instance().FRAME_HEIGHT);
        new Exception().printStackTrace();



        this.update();
    }
    
    public void updateRootPanel() {
    	System.out.println("View updateRootPanel()    ^^^^^^^^^^^^^^^^^^^^^(((*(8(*(*       ");
        new Exception().printStackTrace();
    	//this.drawCloud.repaint();
    	this.frameWhale.updateRootPanel();
    }
    
    public void updateStar() {
    	System.out.println("View updateStar()     ((((((()))))))        ");
        new Exception().printStackTrace();
    	this.frameWhale.updateRootPanel();
    	//this.drawStar.repaint();
    }

    public void updateStartGame() {
        System.out.println("View updateStartGame() ");
        new Exception().printStackTrace();
        // set positions of characters according to model
        this.drawWhale.setCurrentX(Controller.instance().getModelWhaleCurrentXPos());
        this.drawWhale.setCurrentY(Controller.instance().getModelWhaleCurrentYPos());
        this.drawStar.setCurrentX(Controller.instance().getModelStarCurrentXPos());
        this.drawStar.setCurrentY(Controller.instance().getModelStarCurrentYPos());
        this.drawCloud.setCurrentX(Controller.instance().getModelCloudCurrentXPos());
        this.drawCloud.setCurrentY(Controller.instance().getModelCloudCurrentYPos());
        this.drawGlitter.setCurrentX(Controller.instance().getModelGlitterCurrentXPos());
        this.drawGlitter.setCurrentY(Controller.instance().getModelGlitterCurrentYPos());

        System.out.println("View updateStartGame()  this.drawWhale.getWidth() " + this.drawWhale.getWidth());
        System.out.println("View updateStartGame()  this.drawWhale.getHeight() " + this.drawWhale.getHeight());
        System.out.println("View updateStartGame()  this.drawWhale.getCurrentX() " + this.drawWhale.getCurrentX());
        System.out.println("View updateStartGame()  this.drawWhale.getCurrentY() " + this.drawWhale.getCurrentY());
        System.out.println("View updateStartGame()  this.drawStar.getCurrentX() " + this.drawStar.getCurrentX());
        System.out.println("View updateStartGame()  this.drawStar.getCurrentY() " + this.drawStar.getCurrentY());
        System.out.println("View updateStartGame()  this.drawStar.getWidth() " + this.drawStar.getWidth());
        System.out.println("View updateStartGame()  this.drawStar.getHeight() " + this.drawStar.getHeight());
        System.out.println("View updateStartGame()  this.drawCloud.getCurrentX() " + this.drawCloud.getCurrentX());
        System.out.println("View updateStartGame()  this.drawCloud.getCurrentY() " + this.drawCloud.getCurrentY());
        System.out.println("View updateStartGame()  this.drawCloud.getWidth() " + this.drawCloud.getWidth());
        System.out.println("View updateStartGame()  this.drawCloud.getHeight() " + this.drawCloud.getHeight());
        System.out.println("View updateStartGame()  this.drawGlitter.getCurrentX() " + this.drawGlitter.getCurrentX());
        System.out.println("View updateStartGame()  this.drawGlitter.getCurrentY() " + this.drawGlitter.getCurrentY());
        System.out.println("View updateStartGame()  this.drawGlitter.getWidth() " + this.drawGlitter.getWidth());
        System.out.println("View updateStartGame()  this.drawGlitter.getHeight() " + this.drawGlitter.getHeight());


        this.frameWhale.getPanelRoot().add(this.frameWhale.getButtonStartGame());
        this.frameWhale.getButtonStartGame().setLocation(Layout.instance().BUTTON_START_GAME_X_POS, Layout.instance().BUTTON_START_GAME_Y_POS);


        System.out.println("View updateStartGame()  this.frameWhale.getButtonStartGame().getLocation().x " + this.frameWhale.getButtonStartGame().getLocation().x);
        System.out.println("View updateStartGame()  this.frameWhale.getButtonStartGame().getLocation().y " + this.frameWhale.getButtonStartGame().getLocation().y);
        System.out.println("View updateStartGame()  this.frameWhale.getWidth() " + this.frameWhale.getWidth());
        System.out.println("View updateStartGame()  this.frameWhale.getHeight() " + this.frameWhale.getHeight());
        this.updateRootPanel();
        this.frameWhale.invalidate();
        this.frameWhale.setVisible(true);
    }

    public void update() {
        System.out.println("View update() ");
        new Exception().printStackTrace();
        if (Controller.instance().getModelGameMode().equals("start")) {
            this.updateStartGame();
        }
        else if (Controller.instance().getModelGameMode().equals("play")) {
            this.updatePlayGame();
        }
        else if (Controller.instance().getModelGameMode().equals("continue")) {
            this.updateContinueGame();
        }
    }

    public void updateContinueGame() {
        this.updateRootPanel();
        this.frameWhale.invalidate(); // calls paint
        this.frameWhale.setVisible(true);

        int health = Controller.instance().getModelHealth();
        String healthStr = "";
        if (health == 3) {
            healthStr = "* * *";
        }
        else if (health == 2) {
            healthStr = "* *";
        }
        else if (health == 1) {
            healthStr = "*";
        }
        else if (health == 0) {
            healthStr = "expired";
        }
        this.frameWhale.getLabelHealth().setText(healthStr);

        int score = Controller.instance().getModelScore();
        this.frameWhale.getLabelScore().setText(String.valueOf(score));

    }

    public void updatePlayGame() {
        System.out.println("View updatePlayGame()   ");
        //new Exception().printStackTrace();
        this.frameWhale.getPanelRoot().remove(this.frameWhale.getButtonStartGame());
        this.drawWhale.setCurrentX(Controller.instance().getModelWhaleCurrentXPos());
        this.drawWhale.setCurrentY(Controller.instance().getModelWhaleCurrentYPos());
        this.drawStar.setCurrentX(Controller.instance().getModelStarCurrentXPos());
        this.drawStar.setCurrentY(Controller.instance().getModelStarCurrentYPos());
        this.drawCloud.setCurrentX(Controller.instance().getModelCloudCurrentXPos());
        this.drawCloud.setCurrentY(Controller.instance().getModelCloudCurrentYPos());
        this.drawGlitter.setCurrentX(Controller.instance().getModelGlitterCurrentXPos());
        this.drawGlitter.setCurrentY(Controller.instance().getModelGlitterCurrentYPos());

        System.out.println("View updatePlayGame()  this.drawWhale.getCurrentX() " + this.drawWhale.getCurrentX());
        System.out.println("View updatePlayGame()  this.drawWhale.getCurrentY() " + this.drawWhale.getCurrentY());
        System.out.println("View updatePlayGame()  this.drawWhale.getWidth() " + this.drawWhale.getWidth());
        System.out.println("View updatePlayGame()  this.drawWhale.getHeight() " + this.drawWhale.getHeight());

        int health = Controller.instance().getModelHealth();
        String healthStr = "";
        if (health == 3) {
            healthStr = "* * *";
        }
        else if (health == 2) {
            healthStr = "* *";
        }
        else if (health == 1) {
            healthStr = "*";
        }
        else if (health == 0) {
            healthStr = "expired";
        }
        this.frameWhale.getLabelHealth().setText(healthStr);

        int score = Controller.instance().getModelScore();
        this.frameWhale.getLabelScore().setText(String.valueOf(score));

        System.out.println("View updatePlayGame()  health " + health);
        System.out.println("View updatePlayGame()  score " + score);


        //this.updateViewCharactersAll();
        this.updateRootPanel();
        this.frameWhale.invalidate(); // calls paint
        this.frameWhale.setVisible(true);

        View.instance().starFloatLeft();
        View.instance().cloudFloatLeft();
        View.instance().glitterFloatLeft();
    }

    public void updateViewCharactersAll() {
        System.out.println("View updateViewCharactersAll()   ");

        this.drawWhale.repaint();
    }

    public static void main(String[] args) {
        View.instance().go();

    }

    public void go() {
        Layout.instance().init(); // 1
        Controller.instance().modelInit(); // 2

        this.init(); // 3
    }
    

    
    public void cloudFloatLeft() {
    	this.drawCloud.floatLeft();
    }
    
    public void starFloatLeft() {
    	System.out.println("View    starFloatLeft()     (((((((((((((((((((((((  55555555555  ");
    	this.drawStar.floatLeft();
    }

    public void glitterFloatLeft() {
        this.drawGlitter.floatLeft();
    }
    
    public void whaleStepRight() {
    	this.drawWhale.stepRight();
        this.frameWhale.updateRootPanel();

    }

    public void whaleStepLeft() {
        this.drawWhale.stepLeft();
        this.frameWhale.updateRootPanel();

    }

    public void whaleStepUp() {
        this.drawWhale.stepUp();
        this.frameWhale.updateRootPanel();

    }

    public void whaleStepDown() {
        this.drawWhale.stepDown();
        this.frameWhale.updateRootPanel();

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

    public ViewWhale getDrawWhale() {
        return drawWhale;
    }

    public void setDrawWhale(ViewWhale drawWhale) {
        this.drawWhale = drawWhale;
    }

    public ViewCloud getDrawCloud() {
        return drawCloud;
    }

    public ViewGlitter getDrawGlitter() {
        return drawGlitter;
    }

    public void setDrawGlitter(ViewGlitter drawGlitter) {
        this.drawGlitter = drawGlitter;
    }

    public ViewStar getDrawStar() {
    	System.out.println("View  getDrawStar()    99 22 23  .... 111  this.drawStar   " + this.drawStar.toString());
		return drawStar;
	}


	public void setDrawStar(ViewStar drawStar) {
		this.drawStar = drawStar;
	}


	public void setDrawCloud(ViewCloud drawCloud) {
        this.drawCloud = drawCloud;
    }


}
