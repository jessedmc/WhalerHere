package com.company.handler;

/**
 * Handles the ending of the game.
 */
public class HandleEndGame {
    private static HandleEndGame instance = null;

    private HandleEndGame() {

    }

    public static HandleEndGame instance() {
        if (instance == null)
            instance = new HandleEndGame();
        return instance;
    }

    public void handle() {
        System.out.println("HandleEndGame handle()  ");
        System.exit(0);
    }
}
