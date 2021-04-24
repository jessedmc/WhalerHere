package com.company.handler;

import com.company.model.Model;
import com.company.view.SoundPlay;
import com.company.view.View;

/**
 * Handles the starting of the game.
 */
public class HandleStartGame {
    /**
     * Singleton instance
     */
    private static HandleStartGame instance = null;
    /**
     * Singleton constructor
     */
    private HandleStartGame() {

    }
    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static HandleStartGame instance() {
        if (instance == null)
            instance = new HandleStartGame();
        return instance;
    }
    /**
     * Handler starting the game.
     */
    public void handle() {
        Model.instance().setGameModeToPlay();
        View.instance().update();
        SoundPlay.instance().playGameSong();
    }
}
