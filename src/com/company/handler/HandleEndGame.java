package com.company.handler;

/**
 * Handles the ending of the game.
 */
public class HandleEndGame {
    /**
     * Singleton instance
     */
    private static HandleEndGame instance = null;
    /**
     * Singleton constructor
     */
    private HandleEndGame() {

    }
    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static HandleEndGame instance() {
        if (instance == null)
            instance = new HandleEndGame();
        return instance;
    }

    /**
     * Handles the ending of the game.
     */
    public void handle() {
        System.exit(0);
    }
}
