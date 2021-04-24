package com.company.handler;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.SoundPlay;
import com.company.view.View;

/**
 * Handles the event of the whale colliding with the cloud on screen.
 */
public class HandleWhaleHitsCloud {
    /**
     * Singleton instance
     */
    private static HandleWhaleHitsCloud instance = null;
    /**
     * Singleton constructor
     */
    private HandleWhaleHitsCloud() {

    }
    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static HandleWhaleHitsCloud instance() {
        if (instance == null)
            instance = new HandleWhaleHitsCloud();
        return instance;
    }

    // bad hit
    /**
     * Handler for a whale hitting a cloud event.
     */
    public void handle() {
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
