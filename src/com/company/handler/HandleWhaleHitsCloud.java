package com.company.handler;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.SoundPlay;
import com.company.view.View;

/**
 * Handles the event of the whale colliding with the cloud on screen.
 */
public class HandleWhaleHitsCloud {
    private static HandleWhaleHitsCloud instance = null;

    private HandleWhaleHitsCloud() {

    }

    public static HandleWhaleHitsCloud instance() {
        if (instance == null)
            instance = new HandleWhaleHitsCloud();
        return instance;
    }

    // bad hit
    public void handle() {
        System.out.println("HandleWhaleHitsCloud handle()  ");
        SoundPlay.instance().playBadSound();
        Controller.instance().setWhaleInvincible(true);
        Controller.instance().decModelHealthByOne();
        if (Controller.instance().getModelHealth() == 0) {
            Handler.instance().handleEvent(Handler.instance().END_GAME);
        }
        Controller.instance().setModelGameModeToContinue();
        View.instance().update();
    }
}
