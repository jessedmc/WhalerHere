package com.company.extra;

import com.company.model.Model;
import com.company.model.ModelCharacter;

/**
 * This class contains all the data for positions and dimensions of characters.
 */
public class Layout {
    /**
     * Singleton instance
     */
    private static Layout instance = null;

    /**
     * Window width.
     */
    public final int FRAME_WIDTH = 1200;
    /**
     * Window height.
     */
    public final int FRAME_HEIGHT = 1000;

    public int WHALE_START_WINDOW_X_POS = -1;
    public int WHALE_START_WINDOW_Y_POS = -1;
    public int STAR_START_WINDOW_X_POS = -1;
    public int STAR_START_WINDOW_Y_POS = -1;
    public int CLOUD_START_WINDOW_X_POS = -1;
    public int CLOUD_START_WINDOW_Y_POS = -1;
    public int GLITTER_START_WINDOW_X_POS = -1;
    public int GLITTER_START_WINDOW_Y_POS = -1;

    public int WHALE_INITIAL_X_POS = 0;
    public int WHALE_INITIAL_Y_POS = 0;
    public int STAR_INITIAL_X_POS = 0;
    public int STAR_INITIAL_Y_POS = 0;
    public int CLOUD_INITIAL_X_POS = 0;
    public int CLOUD_INITIAL_Y_POS = 0;
    public int GLITTER_INITIAL_X_POS = 0;
    public int GLITTER_INITIAL_Y_POS = 0;

    public int WHALE_HEIGHT = 0;
    public int WHALE_WIDTH = 0;
    public int STAR_HEIGHT = 0;
    public int STAR_WIDTH = 0;
    public int CLOUD_HEIGHT = 0;
    public int CLOUD_WIDTH = 0;
    public int GLITTER_HEIGHT = 0;
    public int GLITTER_WIDTH = 0;

    public int BUTTON_START_GAME_HEIGHT = 100;
    public int BUTTON_START_GAME_WIDTH = 100;
    public int BUTTON_START_GAME_X_POS = -1;
    public int BUTTON_START_GAME_Y_POS = -1;


    public int whaleIncX = 0;
    public int whaleIncY = 0;
    public int starIncX = 0;
    public int starIncY = 0;
    public int cloudIncX = 0;
    public int cloudIncY = 0;
    public int glitterIncX = 0;
    public int glitterIncY = 0;

    /**
     * Singleton constructor
     */
    private Layout() {

    }

    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static Layout instance() {
        if (instance == null)
            instance = new Layout();
        return instance;
    }

    public void init() {
        System.out.println("Layout init()");
        WHALE_START_WINDOW_X_POS = 0;
        WHALE_START_WINDOW_Y_POS = 0;
        STAR_START_WINDOW_X_POS = 500;
        STAR_START_WINDOW_Y_POS = 500;
        CLOUD_START_WINDOW_X_POS = 200;
        CLOUD_START_WINDOW_Y_POS = 300;
        GLITTER_START_WINDOW_X_POS = 600;
        GLITTER_START_WINDOW_Y_POS = 400;

        WHALE_INITIAL_X_POS = 60;
        WHALE_INITIAL_Y_POS = 100;
        WHALE_HEIGHT = 253;
        WHALE_WIDTH = 406;
        STAR_INITIAL_X_POS = FRAME_WIDTH;
        STAR_INITIAL_Y_POS = 100;
        STAR_HEIGHT = 52;
        STAR_WIDTH = 66;
        CLOUD_INITIAL_X_POS = FRAME_WIDTH;
        CLOUD_INITIAL_Y_POS = 400;
        CLOUD_HEIGHT = 154;
        CLOUD_WIDTH = 278;
        GLITTER_INITIAL_X_POS = FRAME_WIDTH;
        GLITTER_INITIAL_Y_POS = 700;
        GLITTER_HEIGHT = 140;
        GLITTER_WIDTH = 124;

        whaleIncX = 30;
        whaleIncY = 30;
        starIncX = 10;
        starIncY = 10;
        cloudIncX = 5;
        cloudIncY = 5;
        glitterIncX = 20;
        glitterIncY = 20;


        this.BUTTON_START_GAME_X_POS = (int)((float)this.FRAME_WIDTH / 2.0);
        this.BUTTON_START_GAME_Y_POS = (int)((float)this.FRAME_HEIGHT / 2.0);

    }
}
