package com.company.handler;

import com.company.view.View;

/**
 * This class handles all key down events for the program.
 */
public class HandleKeyDown {


    private static HandleKeyDown instance = null;


    private HandleKeyDown() {

    }


    public static HandleKeyDown instance() {
        if (instance == null)
            instance = new HandleKeyDown();
        return instance;
    }
    public void handle (int direction){
        System.out.println("HandleKeyDown handle() direction " + direction);
        if (direction == Handler.instance().KEY_DOWN_DOWN){
            System.out.println("HandleKeyDown handle() KEY_DOWN_DOWN " );
            View.instance().whaleStepDown();
        }
        else if (direction == Handler.instance().KEY_DOWN_LEFT){
            System.out.println("HandleKeyDown handle() KEY_DOWN_LEFT " );
            View.instance().whaleStepLeft();
            //View.instance().cloudFloatLeft();
            //View.instance().update();
        }
        else if (direction == Handler.instance().KEY_DOWN_RIGHT){
            System.out.println("HandleKeyDown handle() KEY_DOWN_RIGHT " );
            View.instance().whaleStepRight();
            //View.instance().update();
        }
        else if (direction == Handler.instance().KEY_DOWN_UP){
            System.out.println("HandleKeyDown handle() KEY_DOWN_UP " );
            View.instance().whaleStepUp();
            //View.instance().update();
        }
        
    }
}
