package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

public class Controller {

    private static Controller instance = null;


    private Controller() {

    }


    public static Controller instance() {
        if (instance == null)
            instance = new Controller();
        return instance;
    }


    public void modelInit() {
        Model.instance().init();
    }

    public int getModelWhaleCurrentXPos() {
        return Model.instance().getModelWhale().getCurrentX();
    }

    public int getModelWhaleCurrentYPos() {
        return Model.instance().getModelWhale().getCurrentY();
    }

    public int getModelStarCurrentXPos() {
        return Model.instance().getModelStar().getCurrentX();
    }

    public int getModelStarCurrentYPos() {
        return Model.instance().getModelStar().getCurrentY();
    }

    public int getModelCloudCurrentXPos() {
        return Model.instance().getModelCloud().getCurrentX();
    }

    public int getModelCloudCurrentYPos() {
        return Model.instance().getModelCloud().getCurrentY();
    }

    public int getModelGlitterCurrentXPos() {
        return Model.instance().getModelGlitter().getCurrentX();
    }

    public int getModelGlitterCurrentYPos() {
        return Model.instance().getModelGlitter().getCurrentY();
    }

    public int getModelWhaleWidth() {
        return Model.instance().getModelWhale().getCurrentWidth();
    }

    public int getModelWhaleHeight() {
        return Model.instance().getModelWhale().getCurrentHeight();
    }

    public int getModelStarWidth() {
        return Model.instance().getModelStar().getCurrentWidth();
    }

    public int getModelStarHeight() {
        return Model.instance().getModelStar().getCurrentHeight();
    }

    public int getModelCloudWidth() {
        return Model.instance().getModelCloud().getCurrentWidth();
    }

    public int getModelCloudHeight() {
        return Model.instance().getModelCloud().getCurrentHeight();
    }

    public int getModelGlitterWidth() {
        return Model.instance().getModelGlitter().getCurrentWidth();
    }

    public int getModelGlitterHeight() {
        return Model.instance().getModelGlitter().getCurrentHeight();
    }

    public String getModelGameMode() {
        return Model.instance().getGameMode();
    }

    public int getModelScore() {
        return Model.instance().getScore();
    }

    public int getModelHealth() {
        return Model.instance().getHealth();
    }

    public void incModelScoreBy(int incValue) {
        Model.instance().setScore(Model.instance().getScore() + incValue);
    }

    public void decModelScoreBy(int decValue) {
        Model.instance().setScore(Model.instance().getScore() - decValue);

    }

    public void incModelHealthByOne() {
        Model.instance().setHealth(Model.instance().getHealth() + 1);

    }

    public void decModelHealthByOne() {
        Model.instance().setHealth(Model.instance().getHealth() - 1);
    }

    public boolean isWhaleInvincible() {
        return Model.instance().isInvincible();
    }

    public void setWhaleInvincible(boolean invincible) {
        Model.instance().setInvincible(invincible);
    }

    public void setModelGameModeToContinue() {
        Model.instance().setGameModeToContinue();
    }

}
