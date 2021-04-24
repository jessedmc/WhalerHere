package com.company.view;

import java.awt.image.BufferedImage;

import com.company.controller.Controller;
import com.company.extra.Layout;
import com.company.view.draw.*;

/**
 * The main View of the MVC. This class contains all the elements that are displayed on the screen.
 */
public class View {
    /**
     * Singleton instance
     */
    private static View instance = null;
    private WhaleFrame frameWhale;
    private ViewWhale drawWhale;
    private ViewCloud drawCloud;
    private ViewStar drawStar;
    private ViewGlitter drawGlitter;

    /**
     * Singleton constructor
     */
    private View() {

    }

    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static View instance() {
        if (instance == null)
            instance = new View();
        return instance;
    }

    /**
     * Intialize the View.
     */
    public void init() {
        this.drawWhale = DrawFactory.createDrawWhale();
        this.drawCloud = DrawFactory.createDrawCloud();
        this.drawStar = DrawFactory.createDrawStar();
        this.drawGlitter = DrawFactory.createDrawGlitter();
        this.frameWhale = new WhaleFrame(Layout.instance().FRAME_WIDTH, Layout.instance().FRAME_HEIGHT);



        this.update();
    }

    /**
     * The main updating method during the game. Updates all elements on the screen.
     */
    public void updateRootPanel() {
    	this.frameWhale.updateRootPanel();
    }
    
    public void updateStar() {
    	this.frameWhale.updateRootPanel();
    }

    /**
     * Update method during the start of the game.
     */
    public void updateStartGame() {
        // set positions of characters according to model
        this.drawWhale.setCurrentX(Controller.instance().getModelWhaleCurrentXPos());
        this.drawWhale.setCurrentY(Controller.instance().getModelWhaleCurrentYPos());
        this.drawStar.setCurrentX(Controller.instance().getModelStarCurrentXPos());
        this.drawStar.setCurrentY(Controller.instance().getModelStarCurrentYPos());
        this.drawCloud.setCurrentX(Controller.instance().getModelCloudCurrentXPos());
        this.drawCloud.setCurrentY(Controller.instance().getModelCloudCurrentYPos());
        this.drawGlitter.setCurrentX(Controller.instance().getModelGlitterCurrentXPos());
        this.drawGlitter.setCurrentY(Controller.instance().getModelGlitterCurrentYPos());

        this.frameWhale.getPanelRoot().add(this.frameWhale.getButtonStartGame());
        this.frameWhale.getButtonStartGame().setLocation(Layout.instance().BUTTON_START_GAME_X_POS, Layout.instance().BUTTON_START_GAME_Y_POS);

        this.updateRootPanel();
        this.frameWhale.invalidate();
        this.frameWhale.setVisible(true);
    }

    /**
     * The general capture all update method. Updating from here is determined by game mode.
     */
    public void update() {
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

    /**
     * Update the View during continue game mode.
     */
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
    /**
     * Update the View during play game mode.
     */
    public void updatePlayGame() {
        this.frameWhale.getPanelRoot().remove(this.frameWhale.getButtonStartGame());
        this.drawWhale.setCurrentX(Controller.instance().getModelWhaleCurrentXPos());
        this.drawWhale.setCurrentY(Controller.instance().getModelWhaleCurrentYPos());
        this.drawStar.setCurrentX(Controller.instance().getModelStarCurrentXPos());
        this.drawStar.setCurrentY(Controller.instance().getModelStarCurrentYPos());
        this.drawCloud.setCurrentX(Controller.instance().getModelCloudCurrentXPos());
        this.drawCloud.setCurrentY(Controller.instance().getModelCloudCurrentYPos());
        this.drawGlitter.setCurrentX(Controller.instance().getModelGlitterCurrentXPos());
        this.drawGlitter.setCurrentY(Controller.instance().getModelGlitterCurrentYPos());

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

        this.updateRootPanel();
        this.frameWhale.invalidate(); // calls paint
        this.frameWhale.setVisible(true);

        View.instance().starFloatLeft();
        View.instance().cloudFloatLeft();
        View.instance().glitterFloatLeft();
    }

    /**
     * Entry point for program.
     * @param args
     */
    public static void main(String[] args) {
        View.instance().go();
    }

    /**
     * Driver for program.
     */
    public void go() {
        Layout.instance().init(); // 1
        Controller.instance().modelInit(); // 2
        this.init(); // 3
    }


    /**
     * Triggers a cloud float left event on the screen.
     */
    public void cloudFloatLeft() {
    	this.drawCloud.floatLeft();
    }
    /**
     * Triggers a star float left event on the screen.
     */
    public void starFloatLeft() {
    	this.drawStar.floatLeft();
    }
    /**
     * Triggers a glitter float left event on the screen.
     */
    public void glitterFloatLeft() {
        this.drawGlitter.floatLeft();
    }
    /**
     * Triggers a whale step right event on the screen.
     */
    public void whaleStepRight() {
    	this.drawWhale.stepRight();
        this.frameWhale.updateRootPanel();

    }
    /**
     * Triggers a whale step left event on the screen.
     */
    public void whaleStepLeft() {
        this.drawWhale.stepLeft();
        this.frameWhale.updateRootPanel();

    }
    /**
     * Triggers a whale step up event on the screen.
     */
    public void whaleStepUp() {
        this.drawWhale.stepUp();
        this.frameWhale.updateRootPanel();

    }
    /**
     * Triggers a whale step down event on the screen.
     */
    public void whaleStepDown() {
        this.drawWhale.stepDown();
        this.frameWhale.updateRootPanel();

    }

    /**
     * Retrieve the whale character.
     * @return Whale character.
     */
    public ViewWhale getDrawWhale() {
        return drawWhale;
    }

    /**
     * Retrieve the cloud character.
     * @return cloud character.
     */
    public ViewCloud getDrawCloud() {
        return drawCloud;
    }
    /**
     * Retrieve the glitter character.
     * @return glitter character.
     */
    public ViewGlitter getDrawGlitter() {
        return drawGlitter;
    }
    /**
     * Retrieve the star character.
     * @return star character.
     */
    public ViewStar getDrawStar() {
		return drawStar;
	}





}
