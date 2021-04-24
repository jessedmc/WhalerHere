package com.company.handler;

import com.company.model.Model;
import com.company.view.SoundPlay;
import com.company.view.View;

/**
 * Handles the starting of the game.
 */
public class HandleStartGame {
    private static HandleStartGame instance = null;

    private HandleStartGame() {

    }

    public static HandleStartGame instance() {
        if (instance == null)
            instance = new HandleStartGame();
        return instance;
    }

    public void handle() {
        System.out.println("HandleStartGame handle()  ");
        Model.instance().setGameModeToPlay();
        View.instance().update();
        SoundPlay.instance().playGameSong();
    }
}
