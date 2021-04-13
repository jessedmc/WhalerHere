package com.company.handler;

import com.company.view.View;
import com.company.view.WhaleFrame;

public class Handler {
    public final int KEY_DOWN_RIGHT = 1000;
    public final int KEY_DOWN_LEFT = 1001;
    public final int KEY_DOWN_UP = 1002;
    public final int KEY_DOWN_DOWN = 1003;
    public final int KEY_DOWN = 1004;

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


}
