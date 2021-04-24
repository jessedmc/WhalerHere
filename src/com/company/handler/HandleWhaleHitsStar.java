package com.company.handler;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.SoundPlay;
import com.company.view.View;

/**
 * Handles the event of the whale colliding with the star on screen.
 */
public class HandleWhaleHitsStar {
    private static HandleWhaleHitsStar instance = null;

    private HandleWhaleHitsStar() {

    }

    public static HandleWhaleHitsStar instance() {
        if (instance == null)
            instance = new HandleWhaleHitsStar();
        return instance;
    }

    // good hit
    public void handle() {
        System.out.println("HandleWhaleHitsStar handle()  ");
        SoundPlay.instance().playGoodSound();
        Controller.instance().setWhaleInvincible(true);
        Controller.instance().incModelScoreBy(Model.instance().SCORE_INC_FROM_STAR_HIT);
        Controller.instance().setModelGameModeToContinue();
        View.instance().update();
    }
}
