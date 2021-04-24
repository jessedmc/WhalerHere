package com.company.handler;

import com.company.view.View;
import com.company.view.WhaleFrame;

/**
 * The general handler class to handle all incoming events from the view.
 */
public class Handler {
    public final int KEY_DOWN_RIGHT = 1000;
    public final int KEY_DOWN_LEFT = 1001;
    public final int KEY_DOWN_UP = 1002;
    public final int KEY_DOWN_DOWN = 1003;
    public final int KEY_DOWN = 1004;
    public final int START_GAME = 1005;
    public final int END_GAME = 1006;
    public final int WHALE_HIT_CLOUD = 1007;
    public final int WHALE_HIT_STAR = 1008;


    private static Handler instance = null;


    private Handler() {

    }


    public static Handler instance() {
        if (instance == null)
            instance = new Handler();
        return instance;
    }

    public void handleEvent(int event, int param) {
        if (event == this.KEY_DOWN){

            HandleKeyDown.instance().handle(param);

        }


    }

    public void handleEvent(int event) {
        if (event == this.START_GAME) {
            HandleStartGame.instance().handle();
        }
        else if (event == this.WHALE_HIT_STAR) {
            HandleWhaleHitsStar.instance().handle();
        }
        else if (event == this.WHALE_HIT_CLOUD) {
            HandleWhaleHitsCloud.instance().handle();
        }
        else if (event == this.END_GAME) {
            HandleEndGame.instance().handle();
        }

    }


}
