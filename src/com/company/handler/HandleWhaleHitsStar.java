package com.company.handler;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.SoundPlay;
import com.company.view.View;

/**
 * Handles the event of the whale colliding with the star on screen.
 */
public class HandleWhaleHitsStar {
    /**
     * Singleton instance
     */
    private static HandleWhaleHitsStar instance = null;
    /**
     * Singleton constructor
     */
    private HandleWhaleHitsStar() {

    }
    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static HandleWhaleHitsStar instance() {
        if (instance == null)
            instance = new HandleWhaleHitsStar();
        return instance;
    }

    // good hit
    /**
     * Handler for a whale hitting a star event.
     */
    public void handle() {
        SoundPlay.instance().playGoodSound();
        Controller.instance().setWhaleInvincible(true);
        Controller.instance().incModelScoreBy(Model.instance().SCORE_INC_FROM_STAR_HIT);
        Controller.instance().setModelGameModeToContinue();
        View.instance().update();
    }
}
