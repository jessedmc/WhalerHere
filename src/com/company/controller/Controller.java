package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

/**
 * The Controller class is a mediator between the View and the Model.
 */
public class Controller {

    /**
     * Singleton instance
     */
    private static Controller instance = null;


    /**
     * Singleton constructor
     */
    private Controller() {

    }


    /**
     * Singleton instance call.
     * @return singleton instance of Controller
     */
    public static Controller instance() {
        if (instance == null)
            instance = new Controller();
        return instance;
    }


    /**
     * Initialize the Model
     */
    public void modelInit() {
        Model.instance().init();
    }

    /**
     * Retrieve the value of Whale's current x position.
     * @return Value of Whale's current x position.
     */
    public int getModelWhaleCurrentXPos() {
        return Model.instance().getModelWhale().getCurrentX();
    }

    /**
     * Retrieve the value of Whale's current x position.
     * @return Value of Whale's current x position.
     */
    public int getModelWhaleCurrentYPos() {
        return Model.instance().getModelWhale().getCurrentY();
    }
    /**
     * Retrieve the value of Star's current x position.
     * @return Value of Whale's Star x position.
     */
    public int getModelStarCurrentXPos() {
        return Model.instance().getModelStar().getCurrentX();
    }
    /**
     * Retrieve the value of Star's current y position.
     * @return Value of Star's current y position.
     */
    public int getModelStarCurrentYPos() {
        return Model.instance().getModelStar().getCurrentY();
    }
    /**
     * Retrieve the value of Cloud's current x position.
     * @return Value of Cloud's current x position.
     */
    public int getModelCloudCurrentXPos() {
        return Model.instance().getModelCloud().getCurrentX();
    }
    /**
     * Retrieve the value of Cloud's current y position.
     * @return Value of Cloud's current y position.
     */
    public int getModelCloudCurrentYPos() {
        return Model.instance().getModelCloud().getCurrentY();
    }
    /**
     * Retrieve the value of Glitter's current x position.
     * @return Value of Glitter's current x position.
     */
    public int getModelGlitterCurrentXPos() {
        return Model.instance().getModelGlitter().getCurrentX();
    }
    /**
     * Retrieve the value of Glitter's current y position.
     * @return Value of Glitter's current y position.
     */
    public int getModelGlitterCurrentYPos() {
        return Model.instance().getModelGlitter().getCurrentY();
    }


    /**
     * Retrieve the state of the game.
     * @return Value of the state of the game.
     */
    public String getModelGameMode() {
        return Model.instance().getGameMode();
    }
    /**
     * Retrieve the score of the game.
     * @return Value of the score of the game.
     */
    public int getModelScore() {
        return Model.instance().getScore();
    }
    /**
     * Retrieve the whale's health of the game.
     * @return Value of the whale's health of the game.
     */
    public int getModelHealth() {
        return Model.instance().getHealth();
    }

    /**
     * Increment the score of the game.
     * @param incValue, The value by which to increment the score.
     */
    public void incModelScoreBy(int incValue) {
        Model.instance().setScore(Model.instance().getScore() + incValue);
    }

    /**
     * Decrement the whale's health of the game.
     */
    public void decModelHealthByOne() {
        Model.instance().setHealth(Model.instance().getHealth() - 1);
    }

    /**
     * Retrieve the whale's invincibility state.
     * @return The whale's invincibility state.
     */
    public boolean isWhaleInvincible() {
        return Model.instance().isInvincible();
    }
    /**
     * Set the whale's invincibility state.
     * @param invincible, is the whale invincible or not.
     */
    public void setWhaleInvincible(boolean invincible) {
        Model.instance().setInvincible(invincible);
    }

    /**
     * Set the game mode to continue.
     */
    public void setModelGameModeToContinue() {
        Model.instance().setGameModeToContinue();
    }

}
