package com.company.handler;

import com.company.view.View;

/**
 * This class handles all key down events for the program.
 */
public class HandleKeyDown {

    /**
     * Singleton instance
     */
    private static HandleKeyDown instance = null;

    /**
     * Singleton constructor
     */
    private HandleKeyDown() {

    }

    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static HandleKeyDown instance() {
        if (instance == null)
            instance = new HandleKeyDown();
        return instance;
    }

    /**
     * Handles a key down event for the directional arrows.
     * @param direction Which directional arrow was pressed.
     */
    public void handle(int direction){
        System.out.println("HandleKeyDown handle() direction " + direction);
        if (direction == Handler.instance().KEY_DOWN_DOWN){
            View.instance().whaleStepDown();
        }
        else if (direction == Handler.instance().KEY_DOWN_LEFT){
            View.instance().whaleStepLeft();
        }
        else if (direction == Handler.instance().KEY_DOWN_RIGHT){
            View.instance().whaleStepRight();
        }
        else if (direction == Handler.instance().KEY_DOWN_UP){
            View.instance().whaleStepUp();
        }
        
    }
}
